package htl;

public class Main {
    public static void main(String[] args) {

        System.out.println("Observer Pattern\n" +
                           "================\n\n");

        var b1 = new BebenSensor();
        var b2 = new BebenSensor();
        var b3 = new BebenSensor();

        var z1 = new Zentrale();

        b1.add(z1);
        b2.add(z1);
        b3.add(z1);

        System.out.print("b1 meldet: "); b1.messungVonStärke(3);
        System.out.print("b2 meldet: "); b2.messungVonStärke(7);
    }
}
