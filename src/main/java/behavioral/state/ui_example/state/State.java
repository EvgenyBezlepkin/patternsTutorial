package behavioral.state.ui_example.state;

import behavioral.state.ui_example.Player;

public abstract class State {
    protected final Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
