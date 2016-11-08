package ru.zaur.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import ru.zaur.spring.components.impl.BooksImpl;
import ru.zaur.spring.components.interfaces.IBooks;
/**
 * Created by Администратор on 08.11.2016.
 */
@Aspect
public class AopDeclareParents {
    @DeclareParents(value="ru.zaur.spring.components.interfaces.IData+"
            ,defaultImpl=BooksImpl.class)
    public static IBooks booksImpl;
}
