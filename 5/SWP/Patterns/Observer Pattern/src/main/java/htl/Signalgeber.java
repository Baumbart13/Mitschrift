package htl;

public class Signalgeber implements Observer {
    @Override
    public void update(Sensor sensor, int risiko) {
        var pre = sensor.toString() + " meldet: ";
        if(risiko >= 3){
            System.out.println(pre + "ALARM! Hier ist die Sirene");
            return;
        }
        if(risiko >= 2){
            System.out.println(pre + "Warnung! Jetzt sind wird Laternen");
            return;
        }
        if(risiko >= 0){
            System.out.println(pre + "Nüx");
            return;
        }
        System.out.println(pre + "Oida, jetz is ausnahmezustand. Koan Plan was abgeht");
    }
}
