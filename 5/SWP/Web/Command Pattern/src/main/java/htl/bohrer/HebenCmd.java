package htl.bohrer;

import htl.Command;

public class HebenCmd implements Command {
    Bohrer obj;
    float strecke;

    public HebenCmd(Bohrer obj, float strecke){
        super();
        this.obj = obj;
        this.strecke = strecke;
    }

    @Override
    public void execute() {
        obj.heben(strecke);
    }
}
