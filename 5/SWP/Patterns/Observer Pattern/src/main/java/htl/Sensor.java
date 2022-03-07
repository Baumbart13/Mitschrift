package htl;

import java.util.LinkedList;
import java.util.List;

public class Sensor {
    private List<Observer> beobachter = new LinkedList<Observer>();

    public void add(Observer b){
        beobachter.add(b);
    }

    public void remove(Observer b){
        beobachter.remove(b);
    }

    /**
     * Verständige die Beobachter, dass etwas passiert ist / getan wurde
      */
    public void notifyBeobachter(int risiko){
        for(var b : beobachter){
            b.update(this, risiko); // Änder anhand meiner Informationen deinen Zustand
        }
    }
}
