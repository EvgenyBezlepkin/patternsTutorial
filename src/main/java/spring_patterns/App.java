package spring_patterns;

import spring_patterns.singleton.Singl;
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

        // TODO:  Борисов Spring Patterns для взрослых, с 50 мин.
    }

    static void print (Object o) {
        System.out.println(o);
    }
}
