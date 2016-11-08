package ru.zaur.spring.components.impl;

import org.springframework.stereotype.Component;
import ru.zaur.spring.components.interfaces.IBooks;

/**
 * Created by elbukaevzaur@gmail.com on 07.11.2016.
 */
public class BooksImpl implements IBooks{
    public String Book;
    public void AllBooks() {
        System.out.println("book 1");
        System.out.println("book 2");
        System.out.println("book 3");
    }

    public void setBook(String book) {
        this.Book = book;
    }

    public String getBook() {
        return Book;
    }
}
