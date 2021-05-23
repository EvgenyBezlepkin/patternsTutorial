package creational.singleton;

public class App {

    public static void main(String[] args) {

        Singl.getInstance();
        Singl2.getInstance();
    }

    /*
    используется, когда
    1 должно быть создано не более одного объекта какого-либо класса,
    2 требуется предоставить глобальную точку доступа к объекту класса
     */
}
