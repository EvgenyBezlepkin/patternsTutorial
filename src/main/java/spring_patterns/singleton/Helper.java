package spring_patterns.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


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
