package com.isa.bookcase.cdi;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;
import com.isa.bookcase.service.Library;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@RequestScoped
public class FindBookCDIRequestBean {

    @EJB
    private Books books;

    public List<Book> displayByAuthor(String author) {
        List<Book> findedBooks = new ArrayList<Book>();

//        books.getBooks().stream()
//                .filter(book -> book.getTitle().startsWith(author)).forEachOrdered(findedBooks::add);

        for (Book book:books.getBooks()
        ) {
            if (book.getAuthor().startsWith(author)) {
                findedBooks.add(book);
            }
        }

        return findedBooks;
    }

    public List<Book> displayByTitle(String title) {
        List<Book> findedBooks = new ArrayList<Book>();


//        books.getBooks().stream()
//                .filter(book -> book.getTitle().startsWith(tittle)).forEachOrdered(findedBooks::add);

        for (Book book:books.getBooks()
        ) {
            if (book.getTitle().startsWith(title)) {
                findedBooks.add(book);
            }
        }

        return findedBooks;
    }

//    @EJB
//    private Library library;

//    public User findById(Long id) {
//        return userRepository.findById(id).orElse(null);
//    }

//    public Optional<Book> displayByAuthor(String author) {
//        return displayAllBooks().stream()
//                .filter(book -> book.getAuthor().contains(author)).findAny();
//    }
}
