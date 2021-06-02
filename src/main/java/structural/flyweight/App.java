package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main (String [] args){

        FlyweightFactory factory = new FlyweightFactory();

        List<Character> characterCodes = new ArrayList<>(){{
            add(Character.A);
            add(Character.B);
            add(Character.C);
        }};

        for (Character nextCode : characterCodes){
            EnglishCharacter character = factory.getCharacter(nextCode);
            System.out.println(character.printCharacter());
        }
    }
}

/*
Flyweight используется для уменьшения затрат при работе с большим количеством мелких объектов.
При проектировании приспособленца необходимо разделить его свойства на внешние и внутренние.
Внутренние свойства неизменны, внешние могут отличаться.
Flyweight дополняет шаблон Factory Method таким образом, что при обращении клиента к Factory Method для создания нового объекта
ищет уже созданный объект с такими же параметрами, что и у требуемого, и возвращает его клиенту. Если такого объекта нет, то фабрика создаст новый.
 */
