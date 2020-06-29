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

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

List<Book> books = List.of();

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void beforeEach() {
        books = List.of(
                new Book("Hanya Yanagihara", "Male zycie", Category.STORY, 816, false),
                new Book("Maja Lunde", "Historia Pszczol", Category.STORY, 514, false),
                new Book("Leonie Swann", "Kroczac w ciemnosci", Category.STORY, 424, false),
                new Book("George R.R. Martin", "Gra o tron", Category.SCI_FI, 999, false),
                new Book("J. R. R. Tolkien", "Hobbit", Category.SCI_FI, 315, false),
                new Book("Simon Beckett", "Chemia smierci", Category.THRILLER, 352, false),
                new Book("Marc Elsberg", "Blackout", Category.THRILLER, 784, false),
                new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORICAL, 304, false),
                new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true),
                new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.STORY, 112, true),
                new Book("Jojo Moyes", "Zanim sie pojawiles", Category.ROMANCE, 382, false),
                new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.BIOGRAPHY, 490, false)
);
    }

    @AfterEach
    public void afterEach(){
        books = List.of();
    }

    @Test
    @DisplayName("Test - Sprawdzanie Książek autora na litere J")
    public void shouldGetBooksAuthorStartsWith() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);

        // when
        List<Book> resultGetBooksAuthorStartsWith = bookService.findBooksAuthorStartsWith("J");

        // then
        assertThat(resultGetBooksAuthorStartsWith).hasSize(4)
        .doesNotContain(
                new Book("Hanya Yanagihara", "Male zycie", Category.STORY, 816, false),
                new Book("Maja Lunde", "Historia Pszczol", Category.STORY, 514, false),
                new Book("Leonie Swann", "Kroczac w ciemnosci", Category.STORY, 424, false),
                new Book("George R.R. Martin", "Gra o tron", Category.SCI_FI, 999, false),
                new Book("Simon Beckett", "Chemia smierci", Category.THRILLER, 352, false),
                new Book("Marc Elsberg", "Blackout", Category.THRILLER, 784, false),
                new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.STORY, 112, true),
                new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.BIOGRAPHY, 490, false)
        );
    }

    @Test
    @DisplayName("Test - Sprawdzanie Książek dla dzieci")
    public void shouldGetBooksForKids() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);

        // when
        List<Book> resultGetBooksForKids = bookService.findBooksForKids();

        // then
        assertThat(resultGetBooksForKids).hasSize(2);
    }

    @Test
    @DisplayName("Test - Sprawdzanie Książek zawierającą fraze Harry")
    public void shouldGetBooksTitleContains() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);

        // when
        List<Book> resultGetBooksTitleContains = bookService.findBooksTitleContains("Harry");

        // then
        assertThat(resultGetBooksTitleContains).hasSize(1);
    }

    @Test
    @DisplayName("Test - Sprawdzanie najdłuższej książki w zbiorze")
    public void shouldGetLongestBooks() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);
        List<Book> sortedBooks = List.of(
                new Book("George R.R. Martin", "Gra o tron", Category.SCI_FI, 999, false)
        );

        // when
        List<Book> resultGetLongestBooks = bookService.findLongestBooks();

        // then
        assertThat(resultGetLongestBooks.equals(sortedBooks));

    }

    @Test
    @DisplayName("Test - Sprawdzanie najdłuższego tytułu w zbiorze")
    public void shouldGetBookWithLongestTitle() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);

        // when
        String resultGetBookWithLongestTitle = bookService.bookWithLongestTitle();

        // then
        assertThat(resultGetBookWithLongestTitle).isEqualTo("Harry Potter i Kamien Filozoficzny");
    }

    @Test
    @DisplayName("Test - Sprawdzanie dodania nowej książki do zbioru")
    void shouldAddNewBook() {

        Book newBook = new Book("testowy_autor", "testowy_tytul", Category.CLASSIC, 666, false);
        newBook.setAuthor("Nowy_autor");
        newBook.setTitle("Nowy_tytul");
        newBook.setCategory(Category.COMIC);
        newBook.setPages(1313);
        newBook.setForKids(true);

        assertNotEquals("testowy_autor", newBook.getAuthor());
        assertEquals("Nowy_autor", newBook.getAuthor());

        assertNotEquals("testowy_tytul", newBook.getTitle());
        assertEquals("Nowy_tytul", newBook.getTitle());

        assertNotEquals(Category.CLASSIC, newBook.getCategory());
        assertEquals(Category.COMIC, newBook.getCategory());

        assertNotEquals(666, newBook.getPages());
        assertEquals(1313, newBook.getPages());

        assertNotEquals(false, newBook.isForKids());
        assertEquals(true, newBook.isForKids());
    }
}