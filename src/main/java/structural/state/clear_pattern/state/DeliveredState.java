package structural.state.clear_pattern.state;

import structural.state.clear_pattern.Context;

public class DeliveredState implements State {

    @Override
    public void next(Context pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void prev(Context pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}
