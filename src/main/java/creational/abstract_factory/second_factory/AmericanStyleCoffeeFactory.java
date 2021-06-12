package creational.abstract_factory.second_factory;

import creational.abstract_factory.Coffee;

public class AmericanStyleCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new AmericanStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanStyleEspresso();
                break;
        }

        return coffee;
    }
}
