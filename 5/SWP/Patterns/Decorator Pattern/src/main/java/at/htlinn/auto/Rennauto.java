package at.htlinn.auto;

public class Rennauto implements IRennauto {
    @Override
    public MotorTyp getMotorTyp() {
        return null;
    }

    @Override
    public String getGestellTyp() {
        return null;
    }

    @Override
    public String getHersteller() {
        return null;
    }

    @Override
    public double getPreis() {
        return 0;
    }

    @Override
    public int getPS() {
        return 0;
    }

    @Override
    public String getBeschreibung() {
        return null;
    }

    @Override
    public void printAllInfo() {
        System.out.println(getBeschreibung());
        System.out.println(getPS());
        System.out.println(getPreis());
        System.out.println(getMotorTyp());
        System.out.println(getGestellTyp());
        System.out.println(getHersteller());
        System.out.println();
    }
}
