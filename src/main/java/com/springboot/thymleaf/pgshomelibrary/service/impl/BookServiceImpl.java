package com.springboot.thymleaf.pgshomelibrary.service.impl;

import com.springboot.thymleaf.pgshomelibrary.model.Book;
import com.springboot.thymleaf.pgshomelibrary.repository.BookRepository;
import com.springboot.thymleaf.pgshomelibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {

        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }


}
