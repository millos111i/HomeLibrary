package com.springboot.thymleaf.pgshomelibrary.service;

import com.springboot.thymleaf.pgshomelibrary.model.Book;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book save(Book book);
}
