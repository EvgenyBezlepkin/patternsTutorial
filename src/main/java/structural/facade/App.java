package structural.facade;

public class App {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerImpl();
        computer.startComputer();
    }

    /*
    Предоставляет унифицированный интерфейс более высокого уровня вместо набора интерфейсов, что упрощает использование подсистем,
    т.е. "обертывает" сложную подсистему более простым интерфейсом.

     */
}
