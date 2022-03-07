package htl;

public class Main {
    public static void main(String[] args) {

        System.out.println("Observer Pattern\n" +
                           "================\n\n");

        var b1 = new BebenSensor();
        var b2 = new BebenSensor();
        var b3 = new BebenSensor();

        var z1 = new Zentrale();

        var g1 = new Signalgeber();
        var g2 = new Signalgeber();

        b1.add(z1);
        b2.add(z1);
        b3.add(z1);

        z1.add(g1);
        z1.add(g2);

        b1.messungVonStärke(3);
        System.out.println("==============");
        b2.messungVonStärke(7);
        System.out.println("==============");
        b3.messungVonStärke(5);
        System.out.println("==============");

        z1.notifyBeobachter(3);
        System.out.println("==============");
        z1.notifyBeobachter(-1);
        System.out.println("==============");
    }
}
