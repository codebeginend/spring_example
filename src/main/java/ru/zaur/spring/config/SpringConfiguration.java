package ru.zaur.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.zaur.spring.aspects.AopBooks;
import ru.zaur.spring.components.impl.BooksImpl;
import ru.zaur.spring.components.impl.DataImpl;
import ru.zaur.spring.components.interfaces.IBooks;
import ru.zaur.spring.components.interfaces.IData;

/**
 * Created by elbukaevzaur@gmail.com on 07.11.2016.
 */
@Configuration
@ComponentScan("ru.zaur.spring")
@EnableAspectJAutoProxy(exposeProxy = true)
public class SpringConfiguration {
    //
    @Bean
    public IData data(){
        DataImpl data = new DataImpl();
        data.setBooks(books());
        return data;
    }
    @Bean
    public IBooks books(){
        return new BooksImpl();
    }
    //Аспекты
    @Bean
    public AopBooks aBooks(){
        AopBooks aopBooks;
        return new AopBooks();
    }
}
