package ru.zaur.spring.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zaur.spring.components.interfaces.IData;
import ru.zaur.spring.config.SpringConfiguration;

/**
 * Created by elbukaevzaur@gmail.com on 07.11.2016.
 */
public class Main {
    public static void main(String[]args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringConfiguration.class);
        context.refresh();
        IData data = (IData) context.getBean("data");
        data.Read();
    }
}
