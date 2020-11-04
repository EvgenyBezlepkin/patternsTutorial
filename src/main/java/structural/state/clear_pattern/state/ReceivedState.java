package structural.state.clear_pattern.state;

import structural.state.clear_pattern.Context;

public class ReceivedState implements State {

    @Override
    public void next(Context pkg) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Context pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("This package is already received by a client.");
    }
}
