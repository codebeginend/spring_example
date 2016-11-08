package ru.zaur.spring.components.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.zaur.spring.components.interfaces.IBooks;
import ru.zaur.spring.components.interfaces.IData;



/**
 * Created by elbukaevzaur@gmail.com on 07.11.2016.
 */
public class DataImpl implements IData {
    IBooks books;
    public void Read() {
        books.setBook("book 4");
        books.AllBooks();
    }

    @Autowired
    @Qualifier("books")
    public void setBooks(IBooks books) {
        this.books = books;
    }
}
