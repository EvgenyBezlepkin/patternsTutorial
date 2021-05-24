package structural.proxy;

public class App {

    public static void main(String[] args) {

        Resource<String> resourceProxy = new ResourceProxy(new StringResource());

        System.out.println(resourceProxy.get("A"));
        System.out.println(resourceProxy.get("A"));
        System.out.println(resourceProxy.get("A"));
        System.out.println(resourceProxy.get("A"));
        System.out.println(resourceProxy.get("A"));
        System.out.println(resourceProxy.get("A"));

    }

    /*
    Прокси - это объект, который контролирует доступ к другому объекту, перехватывая все вызовы (выполняет функцию контейнера).
    В даном случае мы перехватываем и подчитываем вызов метода public String get(String o)

    Прокси хранит ссылку, которая позволяет заместителю обратиться к реальному объекту
    Имплементирует тот же интерфейс
     */
}
