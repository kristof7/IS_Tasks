package com.isa.bookcase.service;

import com.isa.bookcase.repository.BooksRespository;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;

@RequestScoped
public class BookService {
    @EJB
    BooksRespository booksRespository;

    public List findAll() {
        return booksRespository.findAll();
    }

}
