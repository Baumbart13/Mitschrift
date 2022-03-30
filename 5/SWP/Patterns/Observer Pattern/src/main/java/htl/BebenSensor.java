package htl;

public class BebenSensor extends Sensor {
    int stärke = 0;

    public BebenSensor(){
        this(0);
    }

    public BebenSensor(int stärke){
        this.stärke = stärke;
    }

    public void messungVonStärke(int stärke){
        this.stärke = stärke;
        switch (stärke) {
            case 1, 2, 3 -> notifyBeobachter(1);
            case 4, 5 -> notifyBeobachter(1);
            case 6, 7 -> notifyBeobachter(2);
            default -> notifyBeobachter(3);
        }
    }
}
