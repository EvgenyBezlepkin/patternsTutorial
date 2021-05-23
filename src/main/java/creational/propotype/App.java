package creational.propotype;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        circle.ex = new ObjectField(4);

        Circle anotherCircle = (Circle) circle.clone();

        compare(circle, anotherCircle);
    }

    private static void compare(Shape shapes, Shape shapesCopy) {

        if (shapes != shapesCopy) {
            if (shapes.equals(shapesCopy)) {
                System.out.println("different and identical objects");
            } else {
                System.out.println("not identical objects");
            }
        } else {
            System.out.println("the same objects");
        }
    }

    /*
    Для копирования объекта следует
    1 копируемый класс и классы ссылочных полей должны имплементировать интерфейс Cloneable, переопределяеть метод clone()
    2 при наличии ссылочных полей в классе необходимы вызывать их методы clone() отдельно

        protected Object clone() throws CloneNotSupportedException {
        Shape sh = ((Shape)super.clone());
        sh.ex = (ObjectField)sh.ex.clone();
        return sh;
    }
     */
}
