package creational.abstract_factory.second_factory;

import creational.abstract_factory.Coffee;

public class ItalianStyleCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                break;
        }

        return coffee;
    }
}
