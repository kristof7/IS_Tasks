package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.enterprise.context.RequestScoped;
import java.util.List;

@RequestScoped
public class BookService {

  private Books books = new Books();

  public List<Book> getBooks() { return books.getBooks();}

}
