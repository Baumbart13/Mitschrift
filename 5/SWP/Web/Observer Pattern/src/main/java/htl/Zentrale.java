package htl;

public class Zentrale extends Sensor implements SensorBeobachter {
    @Override
    public void update(Sensor sensor, int risiko) {
        switch(risiko){
            case 1:
                System.out.println("");
                notifyBeobachter(1);
                break;
            case 2:
                notifyBeobachter(2);
                System.out.println("Warnung: geringe Gefahr");
                break;
            case 3:
                notifyBeobachter(3);
                System.out.println("Alarm: Gefahr");
                break;
            default:
                notifyBeobachter(-1);
                System.out.println("Sensor defekt!");
                break;
        }
    }
}
