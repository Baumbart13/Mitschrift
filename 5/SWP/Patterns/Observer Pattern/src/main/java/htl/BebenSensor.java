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
        switch(stärke){
            case 1:
            case 2:
            case 3:
                notifyBeobachter(1);
                break;
            case 4:
            case 5:
                notifyBeobachter(1);
                break;
            case 6:
            case 7:
                notifyBeobachter(2);
                break;
            default:
                notifyBeobachter(3);
                break;
        }
    }
}
