package structural.observer;

import java.util.logging.Logger;

public class User implements ChatObserver {
    private static final Logger LOGGER = Logger.getLogger(User.class.getName());

    @Override
    public void update(String message) {
        LOGGER.info(String.format("%s get new message: %s", this.getClass().getSimpleName(), message));
    }
}
