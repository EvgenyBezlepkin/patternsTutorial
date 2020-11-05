package structural.observer;

public interface Observable {

    void addObserver(ChatObserver observer);
    void removeObserver(ChatObserver observer);
    void notifyObservers();
}
