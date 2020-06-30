package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    void mockGetAllBooks() {
        List<Book> testBooks = Arrays.asList(
                new Book("Adam Małysz", "Skakańsko", Category.CRIME, 100, true),
                new Book("Magda Gesler", "Gotowańsko", Category.BIOGRAPHY, 10, true),
                new Book("Tomasz Hajto", "Kierowańsko", Category.DRAMA, 500, false),
                new Book("Szymon Majewski", "Heheszkiiiiiiiiiiiii", Category.HISTORICAL, 38, false),
                new Book("Szymon Majewski", "Inna Ksiazka", Category.FANTASY, 358, false)
        );
        when(bookDao.findAllBooks()).thenReturn(testBooks);
    }

    @Test
    void testFindBooksForKids() {
        //given
        List<Book> books = bookDao.findAllBooks();
        //when
        List<Book> result = bookService.findBooksForKids();
        //then
        assertThat(result).contains(books.get(0), books.get(1));
    }

    @Test
    void testFindAuthorsStartingWithCorrectLetter() {
        //given
        List<Book> books = bookDao.findAllBooks();
        //when
        List<Book> result = bookService.findBooksAuthorStartsWith("A");
        //then
        assertThat(result).contains(books.get(0));
    }

    @Test
    void testFindAuthorsStartingWithNotMatchingLetter() {
        List<Book> result = bookService.findBooksAuthorStartsWith("X");
        assertThat(result).isEmpty();
    }

    @Test
    void testFindMoreAuthorsStartingWithCorrectLetter() {
        //given
        List<Book> books = bookDao.findAllBooks();
        //when
        List<Book> result = bookService.findBooksAuthorStartsWith("S");
        //then
        assertThat(result).contains(
                books.get(3),
                books.get(4));
    }

    @Test
    void testFindAuthorsStartingWithNull() {
        assertThatNullPointerException().isThrownBy(() -> bookService.findBooksAuthorStartsWith(null));
    }

    @Test
    void testFindBooksTitleContainsCorrectString() {
        //given
        List<Book> books = bookDao.findAllBooks();
        //when
        List<Book> result = bookService.findBooksTitleContains("ańsko");
        //then
        assertThat(result).containsExactly(
                books.get(0),
                books.get(1),
                books.get(2)
        );
    }

    @Test
    void testFindLongestBooks() {
        //given
        List<Book> books = bookDao.findAllBooks();
        //when
        List<Book> result = bookService.findLongestBooks(2);
        //then
        assertEquals(2, result.size());
        assertThat(result).contains(
                books.get(2),
                books.get(4));
    }

    @Test
    void testFindBookWithLongestTitle() {
        //given
        List<Book> books = bookDao.findAllBooks();
        //when
        String result = bookService.bookWithLongestTitle();
        //then
        assertThat(result).isEqualTo(books.get(3).getTitle());
    }

    @Test
    void sortBooksByPagesAsc() {
        //given
        List<Book> books = bookDao.findAllBooks();
        //when
        List<Book> result = bookService.sortBooksByPagesAsc();
        //then
        assertThat(result).isSortedAccordingTo(Comparator.comparingInt(Book::getPages));
    }
}