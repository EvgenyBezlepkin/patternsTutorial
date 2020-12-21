package spring_patterns.creational.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class Singl {

    @Autowired
    @Lazy
    Helper h;

    public void getMethod(){
        System.out.println("hello");
    }

    @Scheduled(fixedDelay = 500)
    public String getMethod2(){
        return h.getS();
    }



}
