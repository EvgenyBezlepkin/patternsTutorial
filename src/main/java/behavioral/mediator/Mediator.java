package behavioral.mediator;

public interface Mediator {

    void setColleague(Colleague c);
    void send(String message, ColleagueAbstract sender);
}
