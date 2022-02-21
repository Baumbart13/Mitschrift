package htl.bohrer;

import htl.Command;

public class LinksCmd implements Command {
    Bohrer obj;
    float strecke;

    public LinksCmd(Bohrer obj, float strecke){
        super();
        this.obj = obj;
        this.strecke = strecke;
    }

    @Override
    public void execute() {
        obj.links(strecke);
    }
}
