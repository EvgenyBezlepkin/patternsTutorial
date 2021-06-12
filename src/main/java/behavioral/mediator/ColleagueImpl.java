package behavioral.mediator;

public class ColleagueImpl extends ColleagueAbstract{

    private final String name;

    public ColleagueImpl(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println(name + " send: " + message);
    }
}
