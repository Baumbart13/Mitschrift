package at.htlinn.auto.Toyota;

import at.htlinn.auto.Auto;
import at.htlinn.auto.IAuto;
import at.htlinn.auto.MotorTyp;

public class CH_R extends Auto {
    private IAuto auto;

    public CH_R(IAuto a) {
        this.auto = a;
    }

    @Override
    public MotorTyp getMotortyp() {
        return MotorTyp.Hybrid;
    }

    @Override
    public int getSitze() {
        return auto.getSitze() + 1;
    }

    @Override
    public int getTüren() {
        return auto.getSitze();
    }

    @Override
    public String getFahrgestellnummer() {
        return auto.getFahrgestellnummer() + "3333Japan45";
    }

    @Override
    public double getPreis() {
        return auto.getPreis() + 30000.00;
    }

    @Override
    public String getBeschreibung() {
        return auto.getBeschreibung() + "Toyota CH-R";
    }

    @Override
    public int getPS() {
        return auto.getPS() + 15;
    }
}
