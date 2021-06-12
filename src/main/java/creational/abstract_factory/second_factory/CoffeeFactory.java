package creational.abstract_factory.second_factory;

import creational.abstract_factory.Coffee;

public interface CoffeeFactory {

    Coffee createCoffee (CoffeeType type);
}
