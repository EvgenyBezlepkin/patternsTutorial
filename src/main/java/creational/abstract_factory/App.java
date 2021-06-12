package creational.abstract_factory;

import creational.abstract_factory.first_factory.FactoryCreator;
import creational.abstract_factory.first_factory.FactoryType;
import creational.abstract_factory.first_factory.AbstractFactory;
import creational.abstract_factory.second_factory.CoffeeFactory;
import creational.abstract_factory.second_factory.CoffeeType;

public class App {

    private final AbstractFactory af;

    public App(AbstractFactory af) {
        this.af = af;
    }

    public Coffee orderCoffee(CoffeeFactory cf, CoffeeType ct) {
        Coffee coffee = cf.createCoffee(ct);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }

    public CoffeeFactory getFactory(FactoryType cft) {
        return af.createFactory(cft);
    }

    public static void main(String[] args) {

        App app = new App(new FactoryCreator());
        CoffeeFactory factory = app.getFactory(FactoryType.AMERICAN_STYLE);
        app.orderCoffee(factory, CoffeeType.AMERICANO);

    }

    /*
    Предоставляет интерфейс для создания семейств взаимосвязанных объектов, не специфицируя их конкретных классов.
    Шаблон реализуется созданием абстрактного класса Factory, который представляет собой интерфейс для создания компонентов системы.
    Затем пишутся классы, реализующие этот интерфейс.
     */

}
