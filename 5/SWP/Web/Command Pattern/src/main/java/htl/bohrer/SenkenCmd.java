package htl.bohrer;

import htl.Command;

public class SenkenCmd implements Command {
    Bohrer obj;
    float strecke;

    public SenkenCmd(Bohrer obj, float strecke){
        super();
        this.obj = obj;
        this.strecke = strecke;
    }

    @Override
    public void execute() {
        obj.senken(strecke);
    }
}
