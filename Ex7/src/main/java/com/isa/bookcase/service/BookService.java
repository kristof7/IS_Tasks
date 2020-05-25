package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import java.util.List;

public class BookService {

    private final List<Book> books = new Books().getBooks();

}
