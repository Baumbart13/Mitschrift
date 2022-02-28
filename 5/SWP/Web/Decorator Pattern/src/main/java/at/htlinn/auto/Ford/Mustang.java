package at.htlinn.auto.Ford;

import at.htlinn.auto.IKlassiker;
import at.htlinn.auto.Klassiker;
import at.htlinn.auto.MotorTyp;

public class Mustang extends Klassiker {
    private IKlassiker k;
    public Mustang(IKlassiker k){
        this.k = k;
    }
    @Override
    public MotorTyp getMotorTyp() {
        return MotorTyp.Diesel;
    }

    @Override
    public int getPS() {
        return 75;
    }

    @Override
    public String getFahrgestellnummer() {
        return "kmdfndmfdkAlteSchrottkiste1265454";
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
        return 7500;
    }

    @Override
    public String getBeschreibung() {
        return "lahme Arschkiste hahihaiFischkind";
    }
}
