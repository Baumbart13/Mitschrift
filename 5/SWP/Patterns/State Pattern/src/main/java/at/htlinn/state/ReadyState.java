package at.htlinn.state;

import at.htlinn.model.Automate;

/**
 * Machine is idling
 */
public class ReadyState extends State {
    @Override
    public void next(Automate automate) {
        automate.setState(new CoinInsertedState());
    }

    @Override
    public void prev(Automate automate) {
        if (automate.getState() != this) {
            automate.setState(this);
        }
    }

    @Override
    public void printStatus() {
        System.out.println("I am the start-state.");
    }
}
