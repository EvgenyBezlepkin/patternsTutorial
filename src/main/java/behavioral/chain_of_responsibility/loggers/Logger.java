package behavioral.chain_of_responsibility.loggers;


public abstract class Logger {

    protected int mask;

    // объект-обработчик хранит другой объект-обработчик и так далее по цепочке
    protected Logger next;

    // принимаем ссылку на объект, устанавливаем ее в поле и возвращаем этот объект
    public Logger setNext(Logger log) {
        next = log;
        return log;
    }

    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }

    // метод, переопределяемый в конкретных классах-обработчиках
    abstract protected void writeMessage(String msg);
}
