package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Comparator;
import java.util.List;

import static com.isa.bookcase.entity.Category.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    List<Book> books;

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void beforeEach() {
        books = List.of(
                new Book("Steve McConnell", "Code Complete", ACTION, 128, false),
                new Book("Cay S. Horstmann", "Core Java Volume I – Fundamentals", SCI_FI, 154, true),
                new Book("Joshua Bloch", "Effective Java", CLASSIC, 230, false),
                new Book("Herbert Schildt", "Java: A Beginner’s Guide", STORY, 76, true),
                new Book("Herbert Schildt", "Java - The Complete Reference", THRILLER, 210, false),
                new Book("Kathy Sierra & Bert Bates", "Head First Java", HORROR, 189, false),
                new Book("Brian Goetz", "Java Concurrency in Practice", DRAMA, 348, false),
                new Book("Lasse Koskela", "Test-Driven: TDD and Acceptance TDD for Java Developers", CRIME, 195, false),
                new Book("Brett D. McLaughlin", "Head First Object-Oriented Analysis Design", BIOGRAPHY, 78, true),
                new Book("Scott Oaks", "Java Performance: The Definite Guide", COMIC, 143, true),
                new Book("Robert Cecil Martin", "Clean Code – A Handbook of Agile Software Craftsmanship", HISTORICAL, 190, false));

        when(bookDao.findAllBooks()).thenReturn(books);
    }

    @AfterEach
    public void afterEach() {
        books = null;
    }

    @Test
    @DisplayName("Checks if method findAllBooks successfully retrieves all books from the list")
    public void testIfAllBooksListed() {
        // when
        List<Book> result = bookService.findAllBooks();

        // then
        assertThat(result)
                .hasSize(11)
                .isEqualTo(books);
    }

    @Test
    @DisplayName("Checks if books from:'for kids' category filtered properly")
    void testIfFoundBooksForKids() {
        // when
        List<Book> result = bookService.findBooksForKids();

        // then
        assertThat(result)
                .hasSize(4)
                .isNotSameAs(books)
                .contains(books.get(3));
    }

    @Test
    @DisplayName("Checks if author's name with prefix retrieved")
    void testIfFoundBooksAuthorStartsWith() {
        // when
        List<Book> result = bookService.findBooksAuthorStartsWith("S");

        // then
        assertThat(result)
                .hasSize(2)
                .isNotSameAs(books)
                .contains(books.get(0), books.get(9));
    }

    @Test
    @DisplayName("Checks if books' retrieved with titles that contain indicated fragment")
    void testIfFoundBooksTitleContains() {
        // when
        List<Book> result = bookService.findBooksTitleContains("Java");

        // then
        assertThat(result)
                .hasSize(8)
                .isNotSameAs(books)
                .contains(books.get(1), books.get(2), books.get(3),
                        books.get(4), books.get(5), books.get(7), books.get(2));
    }

    @Test
    @DisplayName("Checks if longest books retrieved")
    void testIfFoundLongestBooks() {
        // when
        List<Book> result = bookService.findLongestBooks(220);

        // then
        assertThat(result)
                .isNotSameAs(books)
                .contains(books.get(2), books.get(6))
                .doesNotContain(new Book("Herbert Schildt", "Java: A Beginner’s Guide", STORY, 76, true));
    }

    @Test
    @DisplayName("Checks if book with the longest title retrieved")
    void testIfBookWithLongestTitle() {
        // when
        String result = bookService.bookWithLongestTitle();

        // then
        assertThat(result)
                .isEqualTo("Test-Driven: TDD and Acceptance TDD for Java Developers")
                .isNotEqualTo("Clean Code – A Handbook of Agile Software Craftsmanship");
    }

    @Test
    @DisplayName("Checks if method sorts books considering nr of pages in ascending order")
    void testIfSortsBooksByPagesAsc() {
        // when
        List<Book> result = bookService.sortBooksByPagesAsc();

        // then
        assertThat(result)
                .isNotSameAs(books)
                .hasSameSizeAs(books)
                .isSortedAccordingTo(Comparator.comparing(Book::getPages));
    }
}