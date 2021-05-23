package structural.abstract_document;

import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {


        // вложенный тип с метатипом DESCRIPTION
        var someDesc = Map.of(
                Property.METATYPE, Property.DESCRIPTION,
                Property.LABEL, "someLabel",
                Property.VALUE, "someValue");

        // вложенный тип с метатипом PARTS
        var wheelProperties = Map.of(
                Property.METATYPE, Property.PARTS,
                Property.TYPE, "wheel",
                Property.MODEL, "15C",
                Property.PRICE, 100L);

        // вложенный тип с метатипом PARTS
        var doorProperties = Map.of(
                Property.METATYPE, Property.PARTS,
                Property.TYPE, "door",
                Property.MODEL, "Lambo",
                Property.PRICE, 300L);

        // корень документа
        var carProperties = Map.of(
                Property.MODEL, "300SL",
                Property.PRICE, 10000L,
                // списки сложенных типов по метатипам
                Property.PARTS, List.of(wheelProperties, doorProperties),
                Property.DESCRIPTION, List.of(someDesc)
        );

        // создаем корень абстрактного документа
        var car = new Car(carProperties);

        System.out.println("Here is our car:");
        System.out.println("-> model: " + car.getModel());
        System.out.println("-> price: " + car.getPrice());

        // получаем вложенные объекты по метатипу PARTS
        car.getParts().forEach(p -> System.out.println(
                p.getMetaType().get().toString() + ", " +
                p.getType().orElse(null) + ", " +
                p.getModel().orElse(null) + ", " +
                p.getPrice().orElse(null) + " "
                )
        );

        // получаем вложенные объекты по метатипу DESCRIPTION
        car.getDescription().forEach(p -> System.out.println(
                p.getMetaType().get().toString() + " " +
                p.getValue().orElse(null) + " " +
                p.getLabel().orElse(null))
        );
    }

    /*
    Шаблон позволяет организоваь объекты в слабо типизированные хранилища типа «ключ-значение».
    Целью шаблона является достижение высокой степени гибкости между компонентами в строго типизированном языке,

    Документ - это объект, который содержит ряд свойств. Свойство может быть примитивом или объектом (списком других документов).
    На каждое свойство ссылаются с помощью ключа.

    Реализация
    0) основа - мапа<перечисление, объект> с методами положить, дать, датьВложенныеЭлементы
    1) существует перечисление с поддерживаемыми типами данных
    2) существуют интерфейсы с реализациями (дефолтными методами), которые позволяют получить из мапы свой тип данных
    3) если элемент перечисления предсталяет объект - создаем для него свой класс
     */
}
