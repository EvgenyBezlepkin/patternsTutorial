package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public final class MediatorImpl implements Mediator {

    private final List<Colleague> colleagueList;

    public MediatorImpl() {
        colleagueList = new ArrayList<>();
    }

    @Override
    public void setColleague(Colleague c) {
        colleagueList.add(c);
    }

    @Override
    public void send(String message, ColleagueAbstract sender) {
        for (Colleague c : colleagueList) {
            if (!c.equals(sender)) {
                c.notify(message);
            }
        }
    }
}
