package creational.abstract_factory.first_factory;

import creational.abstract_factory.second_factory.CoffeeFactory;

public interface AbstractFactory {

    CoffeeFactory createFactory(FactoryType type);
}
