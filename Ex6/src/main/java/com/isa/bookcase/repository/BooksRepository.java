package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;

import javax.ejb.Local;
import java.util.List;
import java.util.Optional;

@Local
public interface BooksRepository {

List<Book> showAllBooks();
Book showRandomBook();
Optional<Book> findByAuthor(String author);
Optional<Book> findByTitle(String title);





}
