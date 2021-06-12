package behavioral.mediator;

public abstract class ColleagueAbstract implements Colleague{

    protected Mediator mediator;

    public ColleagueAbstract(Mediator mediator) {
        this.mediator = mediator;
    }


    public void send(String message) {
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}
