package htl;

public class Signalgeber implements SensorBeobachter {
    @Override
    public void update(Sensor sensor, int risiko) {
        if(risiko >= 3){
            System.out.println("ALARM! Hier ist die Sirene");
            return;
        }
        if(risiko >= 2){
            System.out.println("Warnung! Jetzt sind wird Laternen");
            return;
        }
        if(risiko >= 0){
            System.out.println("Nüx");
            return;
        }
        System.out.println("Oida, jetz is ausnahmezustand. Koan Plan was abgeht");
    }
}
