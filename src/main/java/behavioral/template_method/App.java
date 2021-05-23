package behavioral.template_method;

public class App {
    public static void main(String[] args)  {

        Network network1 = new Facebook("Hank", "123");
        Network network2 = new Twitter("Jill", "pass");

        System.out.print("\n************************\n");
        network1.post("Hello");
        System.out.print("\n************************\n");
        network2.post("Buy");
    }

    /**
     Шаблон определяет основу алгоритма и позволяет наследникам переопределить некоторые шаги алгоритма, не изменяя структуру в целом.
     Abstract class определяет абстрактные и конкретные операции.
     Первые реализуются в наследниках. Вторые являются инвариантными и выполнены в AbstractClass.
     */
}