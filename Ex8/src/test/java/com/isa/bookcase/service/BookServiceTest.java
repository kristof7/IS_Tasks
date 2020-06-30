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
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    BookDao bookDao;

    @InjectMocks
    BookService bookService;

    List<Book> listOfBooks = new ArrayList<>();

    @BeforeEach
    public void beforeEach() {
        //given
        List<Book> listOfBooks = List.of(
                new Book("Szymon Hołownia", "Jak nie zostałem prezydentem", Category.COMIC, 555, false),
                new Book("Szymon Nowak", "Jak zostałem surferem", Category.FANTASY, 201, false),
                new Book("Elżbieta Grzywa", "Rzęsy Monalisy", Category.ROMANCE, 85, false),
                new Book("Paweł Emen", "MMA moja pasja", Category.BIOGRAPHY, 125, false),
                new Book("Julian Tuwim", "Bajki na dobranoc", Category.CLASSIC, 420, true),
                new Book("Eminem", "Pasja życiowa RAP", Category.CRIME, 654, false),
                new Book("Dżesika Mercedes", "Bla Bla Bla", Category.HISTORICAL, 35, true),
                new Book("Czesław Niemen", "Czerwone Korale", Category.SCI_FI, 999, true)
        );
        when(bookDao.findAllBooks()).thenReturn(listOfBooks);
    }

    @AfterEach
    public void AfterEach() {
        listOfBooks = null;
    }

    @Test
    public void isBookForChildren() {
        //when
        List<Book> result = bookService.findBooksForKids();
        //then
        assertThat(result).hasSize(3);
    }

    @Test
    public void allBooksAuthorStartsWith() {
        //when
        List<Book> result = bookService.findBooksAuthorStartsWith("Szy");
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void allBooksAuthorNotStartsWith() {
        //when
        List<Book> result = bookService.findBooksAuthorStartsWith("ABC");
        //then
        assertThat(result).isEmpty();
    }

    @Test
    public void allBooksAuthorStartsWithNull() {
        assertThrows(NullPointerException.class, () -> bookService.findBooksAuthorStartsWith(null));
    }

    @Test
    public void allBooksTitleContains() {
        //when
        List<Book> result = bookService.findBooksTitleContains("Jak");
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void allBooksTitleNotContains() {
        //when
        List<Book> result = bookService.findBooksTitleContains("XXX");
        //then
        assertThat(result).isNotNull().hasSize(0);
    }

    @Test
    public void allBooksTitleContainsNull() {
        assertThrows(NullPointerException.class, () -> bookService.findBooksTitleContains(null));
    }

    @Test
    public void isLongestBook() {
        //when
        List<Book> result = bookService.findLongestBooks(1);
        //then
        assertThat(result.get(0).getPages()).isEqualTo(999);
    }

    @Test
    public void isLongestBookWithNull() {
        //when
        List<Book> listOfBooks = null;
        when(bookDao.findAllBooks()).thenReturn(listOfBooks);
        //then
        assertThrows(NullPointerException.class, () -> bookService.findLongestBooks(1));
    }

    @Test
    public void isLongestBookTitle() {
        //when
        String result = bookService.bookWithLongestTitle();
        //then
        assertThat(result).isEqualTo("Jak nie zostałem prezydentem");
    }

    @Test
    public void isLongestBookTitleWithNull() {
        //when
        List<Book> listOfBooks = null;
        when(bookDao.findAllBooks()).thenReturn(listOfBooks);
        //then
        assertThrows(NullPointerException.class, () -> bookService.bookWithLongestTitle());
    }

    @Test
    public void booksSortedByPagesAsc() {
        //when
        List<Book> result = bookService.sortBooksByPagesAsc();
        //then
        assertThat(result.get(7).getPages()).isEqualTo(999);
    }



    @Test
    public void booksGroupedByCategory() {
        //when
        Map<Category, List<Book>> result = bookService.groupBooksByCategory();
        //then
        assertThat(result).hasSize(8);
    }

    @Test
    public void booksGroupedByCategoryWithoutList() {
        //when
        List<Book> listOfBooks = null;
        when(bookDao.findAllBooks()).thenReturn(listOfBooks);
        //then
        assertThrows(NullPointerException.class, () -> bookService.groupBooksByCategory());
    }

}