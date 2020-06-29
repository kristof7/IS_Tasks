package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService bookService;

    private List<Book> books = new ArrayList<>();

    @BeforeEach
    @DisplayName("should get all books")
    public void beforeEach() {

        //given
        List<Book> books = List.of(

                new Book("Hanya Yanagihara", "Male zycie", Category.CLASSIC, 816, false),
                new Book("Maja Lunde", "Historia Pszczol", Category.CLASSIC, 514, false),
                new Book("Leonie Swann", "Kroczac w ciemnosci", Category.CLASSIC, 424, false),
                new Book("George R.R. Martin", "Gra o tron", Category.SCI_FI, 999, false),
                new Book("J. R. R. Tolkien", "Hobbit", Category.SCI_FI, 315, false),
                new Book("Simon Beckett", "Chemia smierci", Category.THRILLER, 352, false),
                new Book("Marc Elsberg", "Blackout", Category.THRILLER, 784, false),
                new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORICAL, 304, false),
                new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true),
                new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.CLASSIC, 112, true),
                new Book("Jojo Moyes", "Zanim sie pojawiles", Category.ROMANCE, 382, false),
                new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.BIOGRAPHY, 490, false)
        );

        when(bookDao.findAllBooks()).thenReturn(books);
    }

    @AfterEach
    @DisplayName("should clear list of books after each test method")
    public void AfterEach() {

        books = null;
    }

    @Test
    @DisplayName("should return all books for kids")
    public void isBookForKids() {
        //when
        List<Book> result = bookService.findBooksForKids();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    @DisplayName("should return all books, where author starts with 'Ma' prefix")
    public void allBooksAuthorStartsWith() {

        //when
        List<Book> result = bookService.findBooksAuthorStartsWith("Ma");

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    @DisplayName("should return all books, where title contains 'ci' fragment")
    public void BooksTitleContains() {

        //when
        List<Book> result = bookService.findBooksTitleContains("ci");

        //then
        assertThat(result).hasSize(3);
    }

    @Test
    @DisplayName("should return longest book - by pages")
    public void longestBooks() {

        // when
        List<Book> result = bookService.findLongestBooks(1);

        // then
        assertThat(result.get(0).getPages()).isEqualTo(999);
    }

    @Test
    @DisplayName("should return book with longest title")
    void bookWithLongestTitle() {

        // when
        String result = bookService.bookWithLongestTitle();

        // then
        assertThat(result).isEqualTo("Harry Potter i Kamien Filozoficzny");
    }

    @Test
    @DisplayName("should return list of books by pages ascending")
    void sortBooksByPagesAsc() {

        // when
        List<Book> result = bookService.sortBooksByPagesAsc();

        // then
        assertThat(result.get(11).getPages()).isEqualTo(999);
    }

    @Test
    @DisplayName("should group books by category")
    public void groupBooksByCategory() {

        //when
        Map<Category, List<Book>> result = bookService.groupBooksByCategory();

        //then
        assertThat(result).hasSize(6);
    }

}