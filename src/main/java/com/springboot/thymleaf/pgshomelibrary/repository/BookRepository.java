package com.springboot.thymleaf.pgshomelibrary.repository;

import com.springboot.thymleaf.pgshomelibrary.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
