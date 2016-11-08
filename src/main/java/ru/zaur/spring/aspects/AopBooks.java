package ru.zaur.spring.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import ru.zaur.spring.components.interfaces.IBooks;

/**
 * Created by elbukaevzaur@gmail.com on 07.11.2016.
 */
@Aspect
public class AopBooks{
    @Around("execution(* ru.zaur.spring.components.impl.DataImpl.Read(..))")
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("start around");
            System.out.println("start around title");
            long start = System.currentTimeMillis();
            joinpoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("end around");
            System.out.println("time out " + (end - start)
                    + " millisecond.");
        } catch (Throwable t) {
            System.out.println("boom!");
        }
    }
    @Before("execution(* ru.zaur.spring.components.impl.BooksImpl.setBook(String)) && args(book)")
    public void interceptThoughts(String book) {
        System.out.println("The book is delivered to the board : "+book);
    }
}
