package htl.bohrer;

import htl.Command;

public class VorCmd implements Command {
    Bohrer obj;
    float strecke;

    public VorCmd(Bohrer obj, float strecke){
        super();
        this.obj = obj;
        this.strecke = strecke;
    }

    @Override
    public void execute() {
        obj.vor(strecke);
    }
}
