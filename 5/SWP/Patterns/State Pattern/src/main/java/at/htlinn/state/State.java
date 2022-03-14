package at.htlinn.state;

import at.htlinn.model.Automate;

public abstract class State {
    public abstract void next(Automate automate);

    public abstract void prev(Automate automate);

    public abstract void printStatus();
}
