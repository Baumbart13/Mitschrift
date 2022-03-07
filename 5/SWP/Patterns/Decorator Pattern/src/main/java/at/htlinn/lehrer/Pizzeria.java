package at.htlinn.lehrer;

public class Pizzeria {
    // Factory Method
    static public IPizza getMargahretia(){
        IPizza p = new Hefeteig();
        p = new Tomaten(p);
        p = new Käse(p);
        return p;
    }
}
