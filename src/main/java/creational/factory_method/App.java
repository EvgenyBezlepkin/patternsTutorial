package creational.factory_method;

public class App {

    private final CoffeeFactory coffeeFactory;

    public App(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }

    public static void main(String[] args) {

        App app = new App(new CoffeeFactory());
        app.orderCoffee(CoffeeType.AMERICANO);

    }

    /*
    Предоставляет подклассам интерфейс для создания экземпляров класса.
    В момент создания наследники могут определить, какой класс создавать.
    Иными словами, шаблон делегирует создание объектов наследникам родительского класса.
    Это позволяет использовать в коде программы не специфические классы, а манипулировать абстрактными объектами на более высоком уровне.
     */

}
