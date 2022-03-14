package at.htlinn.state;

import at.htlinn.model.Automate;

/**
 * After the drink was successfully selected, the drink will be served and machines returns to idling (ReadyState)
 */
public class DrinkOutputState extends State {
    @Override
    public void next(Automate automate) {
        automate.setState(new ReadyState());
    }

    @Override
    public void prev(Automate automate) {
        automate.setState(new DrinkSelectionState());
    }

    @Override
    public void printStatus() {
        System.out.println("Drink is coming.");
    }
}
