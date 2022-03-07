package at.htlinn.auto.Audi;

import at.htlinn.auto.Auto;
import at.htlinn.auto.IAuto;
import at.htlinn.auto.MotorTyp;

public class A3 extends Auto {
    private IAuto a;
    public A3(IAuto a)
    {
        this.a = a;
    }

    @Override
    public MotorTyp getMotortyp() {
        return a.getMotortyp();
    }

    @Override
    public int getSitze() {
        return a.getSitze() + 1;
    }

    @Override
    public int getTüren() {
        return a.getTüren();
    }

    @Override
    public String getFahrgestellnummer() {
        return a.getFahrgestellnummer() + "ekjfkdjfjdfjdskjfkjdf454845";
    }

    @Override
    public double getPreis() {
        return a.getPreis() + 25000.00;
    }

    @Override
    public String getBeschreibung() {
        return a.getBeschreibung() + "Audi A3 8V 190PS";
    }

    @Override
    public int getPS() {
        return a.getPS() + 130;
    }
}
