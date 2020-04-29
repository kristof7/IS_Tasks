package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BooksRepository;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.xml.registry.infomodel.User;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RequestScoped
public class BookService {
    @EJB
    BooksRepository booksRepository;

    public List findAll() {
        return booksRepository.findAll();
    }

    public List writeRandomBook() {
        return booksRepository.writeRandomBook();
    }

    public Book findBookForAuthor(String author) {
        return booksRepository.findBookForAuthor(author).orElse(null);
    }

}
