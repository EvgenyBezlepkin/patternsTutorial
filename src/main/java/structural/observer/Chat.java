package structural.observer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Chat implements Observable{
    private static final Logger LOGGER = Logger.getLogger(Chat.class.getName());

    private final ArrayDeque<String> messages;
    private final List<ChatObserver> observers;

    public Chat() {
        observers = new ArrayList<>();
        messages = new ArrayDeque<>();
    }

    public void addObserver(ChatObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ChatObserver observer) {
        observers.remove(observer);
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public void notifyObservers() {

        while (messages.size() > 0) {
            String message = messages.poll();
            for (ChatObserver observer : observers) {
                observer.update(message);
            }
        }

    }
}
