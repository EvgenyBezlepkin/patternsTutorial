package structural.visitor;

import structural.visitor.additional_logic.XMLExportVisitor;
import structural.visitor.project.Circle;
import structural.visitor.project.Dot;
import structural.visitor.project.Rectangle;
import structural.visitor.project.Shape;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);
        ArrayList<Shape> al = new ArrayList<>(Arrays.asList(dot, circle, rectangle));

        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        for (Shape shape : al) {
            System.out.println(shape.accept(exportVisitor));
        }


        /*
        instanceof в данном случае работает некорректно потому что в иерархии некоторые классы наследуются от других
        и instanceof определяет принадлежность класса по его родителю
         */
        for (Shape shape : al) {
            if (shape instanceof Dot) {
                System.out.println("dot");
            } else if (shape instanceof Circle) {
                System.out.println("circle");
            } else if (shape instanceof Rectangle) {
                System.out.println("rectangle");
            }
        }

    }
}
/* Необходимо сделать операции над рядом объектов, не изменяя классы объектов. И нет возможности запрашивать тип каждого узла
 и осуществлять приведение указателя к правильному типу, прежде чем выполнить нужную операцию.
 1) существует иерархия объектов (фигур), в которые мы добавили общий метод String accept(Visitor visitor);
 2) он имеет одну и ту же реализацию
 public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
(вызываем на объекте иерархии метод аксепт, передаем туда объект визитора, который вызывает у себя метод визит, куда
передает экземпляр объекта)
 3) интерфейс визитора имеет перегруженные методы String visit(Dot dot); для всей иерархии
 4) класс визитора имеет нужные реализации этого метода
 5) у каждого объекта иерархии вызываем метод аксепт и передаем в него экземпляр визитора,
         for (Shape shape : args) {
            shape.accept(exportVisitor);
        }
    в теле метода аксепт на объекте визитора вызывается метод визит, которому передается объект класса
    return visitor.visit(this);
    поскольку джава знает тип этого объекта олна вызывает правильный перегруженный метод из класса визит
 */

