package creational.singleton;

/*
+ Ленивая инициализация
+ Высокая производительность
- Поддерживается только с JDK 1.5
 */
public class Singl2 {
    private static volatile Singl2 instance;

    private Singl2() {
        System.out.println("anything do");
    }

    public static Singl2 getInstance() {
        Singl2 localInstance = instance;
        if (localInstance == null) {
            synchronized (Singl2.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singl2();
                }
            }
        }
        return localInstance;
    }
}
