package at.htlinn.state;

import at.htlinn.model.Automate;

/**
 * Now the user selects a drink. It checks for right amount of cash currently
 */
public class DrinkSelectionState extends State {
    @Override
    public void next(Automate automate) {
        automate.setState(new DrinkOutputState());
    }

    @Override
    public void prev(Automate automate) {
        automate.setState(new CoinInsertedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Drinks get selected");
    }
}
