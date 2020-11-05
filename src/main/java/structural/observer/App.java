package structural.observer;

public class App {
    public static void main(String[] args) {
        User user = new User();
        Admin admin = new Admin();
        Chat chat = new Chat();

        chat.addObserver(admin);
        chat.addObserver(user);

        chat.addMessage("Hi");
        chat.notifyObservers();
        chat.addMessage("Hello");
        chat.addMessage("Buy");
        chat.notifyObservers();

        chat.removeObserver(user);
        chat.addMessage("Buy-buy");
        chat.notifyObservers();
    }

    /*
    позволяет объектам получать оповещения об изменении состояния других объектов.
        Observable — интерфейс, определяющий методы для добавления, удаления и оповещения наблюдателей;
        Observer — интерфейс, с помощью которого наблюдатель получает оповещение;
        ConcreteObservable — конкретный класс, который реализует интерфейс Observable;
        ConcreteObserver — конкретный класс, который реализует интерфейс Observer.

    Шаблон «наблюдатель» применяется в тех случаях, когда система обладает следующими свойствами:
        существует как минимум один объект, рассылающий сообщения;
        имеется не менее одного получателя сообщений, причём их количество и состав могут изменяться во время работы приложения;
        позволяет избежать сильного зацепления взаимодействующих классов.
     */
}