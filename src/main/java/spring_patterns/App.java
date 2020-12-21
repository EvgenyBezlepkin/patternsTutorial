package spring_patterns;

import spring_patterns.creational.singleton.Singl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext cac = SpringApplication.run(App.class, args);

        /*  ленивая инициализация бина - аналогия ленивой инициализации синглтона
            необходимо поставить аннотацию @Lazy над классом, который необходимо отложенно загружать
            и над инжекцией
        * */
        Singl singl = cac.getBean(Singl.class);
        print(singl.getMethod2());

    }

    static void print (Object o) {
        System.out.println(o);
    }
}
