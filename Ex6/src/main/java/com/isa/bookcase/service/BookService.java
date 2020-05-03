package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.BooksRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Set;

@RequestScoped
public class BookService {

    @Inject
    private BooksRepository booksRepository;

    public List<Book> findAllBooks(){
        return booksRepository.findAllBooks();
    }

    public Book findRandomBook(){
        return booksRepository.findRandomBook();
    }

    public Set<Book> findByAuthor(String author){
        return booksRepository.findByAuthor(author);
    }

    public Set<Book> findByTitleAndAuthor(String title, String author) {
        return booksRepository.findByTitleAndAuthor(title, author) ;
    }
}