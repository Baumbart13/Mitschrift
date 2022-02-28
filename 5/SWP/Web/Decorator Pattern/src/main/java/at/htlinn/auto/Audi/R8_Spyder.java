package at.htlinn.auto.Audi;

import at.htlinn.auto.MotorTyp;
import at.htlinn.auto.IRennauto;
import at.htlinn.auto.Rennauto;

public class R8_Spyder extends Rennauto {
    IRennauto r;

    public R8_Spyder(IRennauto r) {
        this.r = r;
    }

    @Override
    public MotorTyp getMotorTyp() {
        return MotorTyp.Benzin;
    }

    @Override
    public String getGestellTyp() {
        return "gedämpftes Gestell";
    }

    @Override
    public String getHersteller() {
        return "Audi";
    }

    @Override
    public double getPreis() {
        return 2000000.00;
    }

    @Override
    public int getPS() {
        return 560;
    }

    @Override
    public String getBeschreibung() {
        return "Rennauto für reiche Menschen";
    }
}
