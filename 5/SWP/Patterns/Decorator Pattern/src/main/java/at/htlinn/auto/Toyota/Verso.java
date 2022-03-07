package at.htlinn.auto.Toyota;

import at.htlinn.auto.Auto;
import at.htlinn.auto.IAuto;
import at.htlinn.auto.MotorTyp;

public class Verso extends Auto {
    private IAuto a;
    public Verso(IAuto a)
    {
        this.a = a;
    }

    @Override
    public MotorTyp getMotortyp() {
        return MotorTyp.Hybrid;
    }

    @Override
    public int getSitze() {
        return 6;
    }

    @Override
    public int getTüren() {
        return 4;
    }

    @Override
    public String getFahrgestellnummer() {
        return "Toyota 3678192AWhdAw";
    }

    @Override
    public double getPreis() {
        return 45000.00;
    }

    @Override
    public String getBeschreibung() {
        return "Isch halt Toyota";
    }

    @Override
    public int getPS() {
        return 80;
    }
}
