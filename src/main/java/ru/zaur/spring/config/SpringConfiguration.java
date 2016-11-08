package ru.zaur.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.zaur.spring.aspects.AopBooks;
import ru.zaur.spring.aspects.AopDeclareParents;
import ru.zaur.spring.aspects.JudgeAspect;
import ru.zaur.spring.components.impl.BooksImpl;
import ru.zaur.spring.components.impl.CriticismEngineImpl;
import ru.zaur.spring.components.impl.DataImpl;
import ru.zaur.spring.components.interfaces.IBooks;
import ru.zaur.spring.components.interfaces.ICriticismEngine;
import ru.zaur.spring.components.interfaces.IData;

/**
 * Created by elbukaevzaur@gmail.com on 07.11.2016.
 */
@Configuration
@ComponentScan("ru.zaur.spring")
@EnableAspectJAutoProxy(exposeProxy = true)
public class SpringConfiguration {
    //Бины
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
    @Bean
    public ICriticismEngine iCriticismEngine(){
        String [] criticismPool = {"Привет ", "Мир"};
        ICriticismEngine criticismEngine = new CriticismEngineImpl();
        criticismEngine.setCriticismPool(criticismPool);
        return criticismEngine;
    }
    //Аспекты
    @Bean
    public AopBooks aBooks(){
        AopBooks aopBooks;
        return new AopBooks();
    }
    @Bean
    public AopDeclareParents aopDeclareParents(){
        return new AopDeclareParents();
    }
    @Bean
    public JudgeAspect judgeAspect(){
        JudgeAspect judgeAspect = new JudgeAspect();
        judgeAspect.setCriticismEngine(iCriticismEngine());
        return judgeAspect;
    }
}
