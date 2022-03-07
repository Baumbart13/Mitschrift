package htl.bohrer;

import htl.Command;

public class RechtsCmd implements Command {
    Bohrer obj;
    float strecke;

    public RechtsCmd(Bohrer obj, float strecke){
        super();
        this.obj = obj;
        this.strecke = strecke;
    }

    @Override
    public void execute() {
        obj.rechts(strecke);
    }
}
