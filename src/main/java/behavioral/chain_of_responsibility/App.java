package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.loggers.*;

public class App {

    public static void main(String[] args) {

        // создаем цепочку обработчиков
        Logger logger = new StdoutLogger(Log.DEBUG.getNum())
                .setNext(new EmailLogger(Log.NOTICE.getNum()))
                .setNext(new StderrLogger(Log.ERR.getNum()));

        // передаем в метод номер логгера, который может быть обработан тольк первым обработчиком
        logger.message("Entering function y.", Log.DEBUG.getNum());

        // первыми двумя
        logger.message("Step1 completed.", Log.NOTICE.getNum());

        // первыми тремя
        logger.message("An error has occurred.", Log.ERR.getNum());
    }

    /*
    Применение
    1 С помощью Цепочки обязанностей вы можете связать потенциальных обработчиков в одну цепь
    и при получении запроса поочерёдно спрашивать каждого из них, не хочет ли он обработать запрос.
    2 Цепочка обязанностей позволяет запускать обработчиков последовательно один за другим в том порядке, в котором они находятся в цепочке.
    3 Когда набор объектов, способных обработать запрос, должен задаваться динамически.

    Создание
    Создаем абстрактный объект обработчика,
    он имеет ссылку на себя

    В методе
    public Logger setNext(Logger log) {
        next = log;
        return log;
    }
    мы принимаем ссылку на объект, устанавливаем ее в поле и возвращаем этот объект

    теперь создать цепочку можно примерно так
    Logger logger = new StdoutLogger(Log.DEBUG.getNum())
        .setNext(new EmailLogger(Log.NOTICE.getNum()))
        .setNext(new StderrLogger(Log.ERR.getNum()));

    Далее необходимо в абстрактном классе создать метод который будет вызывать себя у каждого конкртного класса-обработчика
       public void message(...) {
            writeMessage(msg);

        if (next != null) {
            next.message(...);
        }
    }

     */

}
