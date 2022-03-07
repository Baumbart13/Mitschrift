package at.htlinn.auto.VW;

import at.htlinn.auto.IKlassiker;
import at.htlinn.auto.Klassiker;
import at.htlinn.auto.MotorTyp;

public class Kaefer extends Klassiker {
    @Override
    public MotorTyp getMotorTyp() {
        return MotorTyp.Diesel;
    }

    @Override
    public int getPS() {
        return 45;
    }

    @Override
    public String getFahrgestellnummer() {
        return "Käfer 890815awdawd";
    }

    @Override
    public int getSitze() {
        return 2;
    }

    @Override
    public boolean getBenutzt() {
        return true;
    }

    @Override
    public double getPrice() {
        return 8000.00;
    }

    @Override
    public String getBeschreibung() {
        return "I bims";
    }
}
