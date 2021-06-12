package creational.abstract_factory.first_factory;

import creational.abstract_factory.second_factory.AmericanStyleCoffeeFactory;
import creational.abstract_factory.second_factory.CoffeeFactory;
import creational.abstract_factory.second_factory.ItalianStyleCoffeeFactory;

public class FactoryCreator implements AbstractFactory {

    public CoffeeFactory createFactory(FactoryType type) {
        CoffeeFactory fc = null;

        switch (type) {
            case AMERICAN_STYLE:
                fc = new AmericanStyleCoffeeFactory();
                break;
            case ITALIAN_STYLE:
                fc = new ItalianStyleCoffeeFactory();
                break;
        }

        return fc;
    }
}
