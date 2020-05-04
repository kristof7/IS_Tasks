package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BooksRepository;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class BookService {
    @EJB
    BooksRepository booksRepository;

    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    public List showArandomBook() {
        return booksRepository.showArandomBook();
    }

    public List<Book> findBookForAuthor(String author) {
        return findAll().stream().
                filter(book -> book.getAuthor().toLowerCase().
                        contains(author.toLowerCase())).
                collect(Collectors.toList());
    }

    public List<Book> findBookForTitle(String title) {
        return findAll().stream().
                filter(book -> book.getTitle().toLowerCase().
                        contains(title.toLowerCase())).collect(Collectors.toList());
    }

}
