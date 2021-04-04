package behavioral.state.ui_example;

import behavioral.state.ui_example.state.ReadyState;
import behavioral.state.ui_example.state.State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private State state;
    private boolean playing;
    private final List<Integer> playlist;
    private int currentTrack;

    public Player() {
        state = new ReadyState(this);
        setPlaying(true);
        playlist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}
