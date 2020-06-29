package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookService {

    private BookDao bookDao;

    public List<Book> findBooksForKids() {
        return bookDao.findAllBooks()
                      .stream()
                      .filter(Book::isForKids)
                      .collect(Collectors.toList());
    }

    public List<Book> findBooksAuthorStartsWith(String prefix) {
        return bookDao.findAllBooks()
                      .stream()
                      .filter(book -> book.getAuthor()
                                          .startsWith(prefix))
                      .collect(Collectors.toList());
    }

    public List<Book> findBooksTitleContains(String fragment) {
        return bookDao.findAllBooks()
                      .stream()
                      .filter(book -> book.getTitle()
                                          .contains(fragment))
                      .collect(Collectors.toList());
    }

    public List<Book> findLongestBooks() {
        return bookDao.findAllBooks()
                      .stream()
                      .sorted(Comparator.comparing(Book::getPages)
                                        .reversed())
                      .limit(1)
                      .collect(Collectors.toList());
    }

    public String bookWithLongestTitle() {
        return bookDao.findAllBooks()
                      .stream()
                      .max(Comparator.comparing(p -> p.getTitle()
                                                      .length()))
                      .map(Book::getTitle)
                      .get();
    }

    public List<Book> sortBooksByPagesAsc() {
        return bookDao.findAllBooks()
                      .stream()
                      .sorted(Comparator.comparing(Book::getPages))
                      .collect(Collectors.toList());
    }

    public Map<Category, List<Book>> groupBooksByCategory() {
        return bookDao.findAllBooks()
                      .stream()
                      .collect(Collectors.groupingBy(Book::getCategory));
    }
}
