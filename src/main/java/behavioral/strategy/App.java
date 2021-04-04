package behavioral.strategy;

class App {
    public static void main(String[] args) {
        Context context = new Context("*");
        System.out.println(context.executeStrategy(5, 7));
    }
}

/*
определяет семейство схожих алгоритмов и помещает каждый из них в отдельный класс,
после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.
Создается вспомогательный класс, в котором определяется интерфейсное поле иерархии алгоритмов,
там же мы присваиваем этому полю какую-то реализацию.
В метод этого класса передаем вызов методов стратегии
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
 */