package htl;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Strategy Pattern\n" +
                            "================\n\n");
        var enten = new Enten[3];

        enten[0] = new HausEnte();
        enten[1] = new HolzEnte();
        enten[2] = new GummiEnte();

        for (var e : enten) {
            e.gibLaut();
        }
        // Ändern das Verhalten zur Laufzeit
        enten[2].setLaut(new Stumm());

        for (var e : enten) {
            e.gibLaut();
        }

        System.out.println("-------------------");

        for (var e : enten) {
            e.bewegen();
        }
        enten[2].setBewegen(new Fliegen());

        for (var e : enten) {
            e.bewegen();
        }
    }
}
