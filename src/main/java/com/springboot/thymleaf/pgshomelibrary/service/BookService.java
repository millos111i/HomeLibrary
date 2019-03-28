package com.springboot.thymleaf.pgshomelibrary.service;

import com.springboot.thymleaf.pgshomelibrary.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book save(Book book);

    Book findById(Integer id);

    Book update(Book book);

    void delete(Integer id);
}
