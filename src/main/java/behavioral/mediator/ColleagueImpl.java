package behavioral.mediator;

public class ColleagueImpl extends ColleagueAbstract{

    private final User user;

    public ColleagueImpl(Mediator mediator, User user) {
        super(mediator);
        this.user = user;
    }

    @Override
    public void notify(String message) {
        System.out.println(user.getName() + " send: " + message);
    }
}
