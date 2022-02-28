package at.htlinn.auto;

public class Auto implements IAuto {
    @Override
    public MotorTyp getMotortyp() {
        return MotorTyp.Benzin;
    }

    @Override
    public int getSitze() {
        return 4;
    }

    @Override
    public int getTüren() {
        return 4;
    }

    @Override
    public String getFahrgestellnummer() {
        return "0000aWDAWd1";
    }

    @Override
    public double getPreis() {
        return 10000.00;
    }

    @Override
    public String getBeschreibung() {
        return "Std Auto";
    }

    @Override
    public int getPS() {
        return 60;
    }

    @Override
    public void printAllInfo(){
        System.out.println(getMotortyp());
        System.out.println(getSitze());
        System.out.println(getPreis());
        System.out.println(getFahrgestellnummer());
        System.out.println(getTüren());
        System.out.println(getBeschreibung());
        System.out.println(getPS());
        System.out.println();
    }
}
