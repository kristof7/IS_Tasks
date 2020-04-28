package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.EJB;
import javax.ejb.Local;
import java.util.List;

@Local
public interface BooksRepository {

    public List<Book> findAll();
}
