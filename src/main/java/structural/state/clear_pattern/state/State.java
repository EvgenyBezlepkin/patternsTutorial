package structural.state.clear_pattern.state;

import structural.state.clear_pattern.Context;

public interface State {
    void next(Context pkg);
    void prev(Context pkg);
    void printStatus();
}
