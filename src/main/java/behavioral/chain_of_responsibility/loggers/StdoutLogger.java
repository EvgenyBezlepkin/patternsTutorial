package behavioral.chain_of_responsibility.loggers;

public class StdoutLogger extends Logger {
    public StdoutLogger(int mask) {
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.out.println("Fist chain class: " + msg);
    }
}
