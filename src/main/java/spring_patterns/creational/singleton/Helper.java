package spring_patterns.creational.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
@Lazy
public class Helper {

    private final String s;

    public Helper() {
        System.out.println("Helper");
        this.s = "new service";
    }

    public String getS() {
        return s;
    }

}
