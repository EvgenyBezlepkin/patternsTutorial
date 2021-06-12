package behavioral.mediator;

public class App {

    public static void main(String[] args) {

        Mediator m = new MediatorImpl();
        Colleague c1 = new ColleagueImpl(m, "Mike");
        Colleague c2 = new ColleagueImpl(m, "Bob");

        m.setColleague(c1);
        m.setColleague(c2);

        c1.send("How are you?");
        c2.send("Fine, thanks");

    }

    /*
    обеспечивает заимодействие множества объектов, формируя при этом слабое зацепление
    и избавляя объекты от необходимости явно ссылаться друг на друга. Работает через создание объекта,
    инкапсулирующего взаимодействие множества объектов

    Mediator defines the interface the Colleague objects use to communicate
    Colleague defines the abstract class holding a single reference to the Mediator
    ConcreteMediator encapsulates the interaction logic between Colleague objects
    ConcreteColleagues communicate only through the Mediator
     */

}
