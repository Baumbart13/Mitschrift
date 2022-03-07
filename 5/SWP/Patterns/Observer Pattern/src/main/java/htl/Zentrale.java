package htl;

public class Zentrale extends Sensor implements Observer {
    @Override
    public void update(Sensor sensor, int risiko) {
        var pre = sensor.toString() + " meldet: ";
        switch(risiko){
            case 1:
                System.out.println(pre + "");
                notifyBeobachter(1);
                break;
            case 2:
                notifyBeobachter(2);
                System.out.println(pre + "Warnung: geringe Gefahr");
                break;
            case 3:
                notifyBeobachter(3);
                System.out.println(pre + "Alarm: Gefahr");
                break;
            default:
                notifyBeobachter(-1);
                System.out.println(pre + "Sensor defekt!");
                break;
        }
    }
}
