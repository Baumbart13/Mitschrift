package at.htlinn;

import at.htlinn.auto.Autohaus;
import at.htlinn.auto.IAuto;
import at.htlinn.auto.IKlassiker;
import at.htlinn.auto.IRennauto;
import at.htlinn.lehrer.*;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern");
        for(var s : args){
            System.out.print("\"s\" - ");
        }
        if(Arrays.stream(args).anyMatch(Predicate.isEqual("lehrer")) && Arrays.stream(args).anyMatch(Predicate.isEqual("auto"))){
            System.out.println("Please, use either \"lehrer\" or \"auto\"");
        }else if(Arrays.stream(args).anyMatch(Predicate.isEqual("lehrer"))){
            lehrer();
        }else if(Arrays.stream(args).anyMatch(Predicate.isEqual("auto"))){
            auto();
        }
    }

    private static void auto(){
        IAuto auto = Autohaus.getAudiA3();
        auto.printAllInfo();

        IRennauto rennauto = Autohaus.getAudiR8Spyder();
        rennauto.printAllInfo();

        IKlassiker klassiker = Autohaus.getFordMustang();
        klassiker.printAllInfo();

        IAuto toyoda = Autohaus.getToyotaChr();
        toyoda.printAllInfo();
    }

    private static void lehrer(){
        System.out.println("\n================ Pizza ================");
        IPizza p = new Hefeteig();
        p = new Tomaten(p);
        p = new Käse(p);
        p = new Schinken(p);

        IPizza p2 = new Käse(new Tomaten(new Hefeteig()));

        var p3 = Pizzeria.getMargahretia();

        System.out.println(p.getDescription());
        System.out.println(p.getPrice());
    }
}
