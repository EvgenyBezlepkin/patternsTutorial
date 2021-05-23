package behavioral.state.clear_pattern;

public class App {
    public static void main(String[] args) {

        // init - first state
        Context pkg = new Context();
        pkg.printStatus();

        // second state
        pkg.nextState();
        pkg.printStatus();

        // again first state
        pkg.previousState();
        pkg.printStatus();

        // second state
        pkg.nextState();
        pkg.printStatus();

        // final third state
        pkg.nextState();
        pkg.printStatus();
    }
}

/*
позволяет объектам менять поведение в зависимости от своего состояния

Context — класс, объекты которого должны менять своё поведение в зависимости от состояния.
State — интерфейс, который должен реализовать каждое из конкретных состояний.
Через этот интерфейс объект Context взаимодействует с состоянием, делегируя ему вызовы методов.
Интерфейс должен содержать средства для обратной связи с объектом, поведение которого нужно изменить.
StateA … StateZ — классы конкретных состояний.
Должны содержать информацию о том, при каких условиях и в какие состояния может переходить объект из текущего состояния.
Например, из StateA объект может переходить в состояние StateB и StateC, а из StateB — обратно в StateA и так далее.
Объект одного из них должен содержать Context при создании.

Difference between state and strategy patterns

First, the strategy pattern defines a family of interchangeable algorithms.
Generally, they achieve the same goal, but with a different implementation, for example, sorting or rendering algorithms.
In state pattern, the behavior might change completely, based on actual state.
Next, in strategy, the client has to be aware of the possible strategies to use and change them explicitly.
Whereas in state pattern, each state is linked to another and create the flow as in Finite State Machine.
 */
