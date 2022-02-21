package htl.bohrer;

import htl.Command;

public class ZurückCmd implements Command {
    Bohrer obj;
    float strecke;

    public ZurückCmd(Bohrer obj, float strecke){
        super();
        this.obj = obj;
        this.strecke = strecke;
    }

    @Override
    public void execute() {
        obj.zurück(strecke);
    }
}
