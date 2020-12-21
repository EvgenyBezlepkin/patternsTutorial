package behavioral.chain_of_responsibility.loggers;

public class EmailLogger extends Logger {
    public EmailLogger(int mask) {
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.out.println("Second chain class: " + msg);
    }
}
