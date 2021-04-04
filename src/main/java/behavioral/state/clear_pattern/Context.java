package behavioral.state.clear_pattern;

import behavioral.state.clear_pattern.state.OrderedState;
import behavioral.state.clear_pattern.state.State;

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
