package at.htlinn.state;

import at.htlinn.model.Automate;

/**
 * The machine receives coins and fills up the current amount of cash for the next order
 */
public class CoinInsertedState extends State{
    @Override
    public void next(Automate automate) {
        automate.setState(new DrinkSelectionState());
    }

    @Override
    public void prev(Automate automate) {
        automate.setState(new ReadyState());
    }

    @Override
    public void printStatus() {
        System.out.println("Coins got inserted.");
    }
}
