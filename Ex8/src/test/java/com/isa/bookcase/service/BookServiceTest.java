package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    void shouldGetAllBooks() {
        List<Book> testBooks = Arrays.asList(
                new Book("Adam Małysz", "Skakańsko", Category.CRIME, 100, true),
                new Book("Magda Gesler", "Gotowańsko", Category.BIOGRAPHY, 10, true),
                new Book("Tomasz Hajto", "Kierowańsko", Category.DRAMA, 500, false),
                new Book("Szymon Majewski", "Heheszki", Category.HISTORICAL, 38, false),
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
        List<Book> result = bookService.findBooksAuthorStartsWith("S");
        assertThat(result).contains(
                bookDao.findAllBooks().get(3),
                bookDao.findAllBooks().get(4));
    }

    @Test
    void testFindAuthorsStartingWithNull() {
        assertThatNullPointerException().isThrownBy(() -> bookService.findBooksAuthorStartsWith(null));
    }

    @Test
    void findBooksTitleContains() {
        //given

        //when

        //then
    }

    @Test
    void findLongestBooks() {
        //given

        //when

        //then

    }

    @Test
    void bookWithLongestTitle() {
        //given

        //when

        //then

    }

    @Test
    void sortBooksByPagesAsc() {
        //given

        //when

        //then

    }

    @Test
    void groupBooksByCategory() {
        //given

        //when

        //then

    }
}