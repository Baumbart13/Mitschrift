package at.htlinn;

import at.htlinn.model.Automate;
import at.htlinn.state.ReadyState;

public class Main {
    public static void main(String[] args) {
        Automate automate = new Automate();
        automate.setState(new ReadyState());
        goForwardOneRound(automate);
    }

    private static Automate goForwardOneRound(Automate automate) {
        int readyStateCounter = 0;
        while (0 <= readyStateCounter && readyStateCounter <= 1) {
            if (automate.getState().getClass() == ReadyState.class) {
                readyStateCounter++;
            }
            automate.printState();
            automate.nextState();
        }
        return automate;
    }
}
