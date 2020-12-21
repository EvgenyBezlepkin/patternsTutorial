package behavioral.chain_of_responsibility;

public enum Log {

    ERR(3),
    NOTICE(5),
    DEBUG(7);

    private int mark;

    Log(int mark) {
        this.mark = mark;
    }

    public int getNum() {
        return mark;
    }
}
