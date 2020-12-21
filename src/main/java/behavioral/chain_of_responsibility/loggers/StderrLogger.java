package behavioral.chain_of_responsibility.loggers;

public class StderrLogger extends Logger {
    public StderrLogger(int mask) {
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.out.println("Third chain class: " + msg);
    }
}
