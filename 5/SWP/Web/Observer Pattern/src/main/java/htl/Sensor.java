package htl;

import java.util.LinkedList;
import java.util.List;

public class Sensor {
    private List<SensorBeobachter> beobachter = new LinkedList<SensorBeobachter>();

    public void add(SensorBeobachter b){
        beobachter.add(b);
    }

    public void remove(SensorBeobachter b){
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
