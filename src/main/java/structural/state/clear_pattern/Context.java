package structural.state.clear_pattern;

import structural.state.clear_pattern.state.OrderedState;
import structural.state.clear_pattern.state.State;

public class Context {

    private State state;

    public Context() {
        state = new OrderedState();
    }

    public void previousState() { state.prev(this); }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
