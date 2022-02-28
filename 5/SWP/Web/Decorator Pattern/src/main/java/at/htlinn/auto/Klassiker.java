package at.htlinn.auto;

public class Klassiker implements IKlassiker{
    @Override
    public MotorTyp getMotorTyp() {
        return null;
    }

    @Override
    public int getPS() {
        return 0;
    }

    @Override
    public String getFahrgestellnummer() {
        return null;
    }

    @Override
    public int getSitze() {
        return 0;
    }

    @Override
    public boolean getBenutzt() {
        return false;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getBeschreibung() {
        return null;
    }

    @Override
    public void printAllInfo(){
        System.out.println(getBenutzt());
        System.out.println(getBeschreibung());
        System.out.println(getFahrgestellnummer());
        System.out.println(getPS());
        System.out.println(getSitze());
        System.out.println(getMotorTyp());
        System.out.println(getPrice());
        System.out.println();
    }
}
