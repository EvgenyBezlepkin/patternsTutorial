package creational.singleton;

/*
+ Простая и прозрачная реализация
+ Потокобезопасность
- Не ленивая инициализация
*/
public class Singl {

    private static final Singl instance = new Singl();

    private Singl(){
        System.out.println("creating singleton");
    }

    public static Singl getInstance() {
        return instance;
    }

}
