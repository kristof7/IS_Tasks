package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

//    private BookDao bookDao;
//    private BookService bookService;

    @Mock
    BookDao bookDao;

    @InjectMocks
    BookService bookService;

    private List<Book> prepareMockData() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Hanya Yanagihara", "Male zycie", Category.DRAMA, 816, false));
        books.add(new Book("Maja Lunde", "Historia Pszczol", Category.SCI_FI, 514, false));
        books.add(new Book("Leonie Swann", "Kroczac w ciemnosci", Category.STORY, 424, false));
        books.add(new Book("George R.R. Martin", "Gra o tron", Category.FANTASY, 999, false));
        books.add(new Book("J. R. R. Tolkien", "Hobbit", Category.FANTASY, 315, false));
        books.add(new Book("Simon Beckett", "Chemia smierci", Category.CRIME, 352, false));
        books.add(new Book("Marc Elsberg", "Blackout", Category.ACTION, 784, false));
        books.add(new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORICAL, 304, false));
        books.add(new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.FANTASY, 328, true));
        books.add(new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.CLASSIC, 112, true));
        books.add(new Book("Jojo Moyes", "Zanim się pojawiłeś", Category.ROMANCE, 382, false));
        books.add(new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.BIOGRAPHY, 490, false));
        return books;
    }

//    @BeforeAll
//    public void beforeAll() {
//        when(bookDao.findAllBooks()).thenReturn(prepareMockData());
//    }

    @BeforeEach
    public void beforeEach() {
        given(bookDao.findAllBooks()).willReturn(prepareMockData());
    }

    @Test
    void findBooksForKids() {
        // when
        List<Book> findBooksForKidsResult = bookService.findBooksForKids();

        // then
        assertThat(findBooksForKidsResult).hasSize(2);
    }

    @Test
    void findBooksAuthorStartsWith() {
        // when
        List<Book> findBooksAuthorStartsWith = bookService.findBooksAuthorStartsWith("J");

        // then
        assertThat(findBooksAuthorStartsWith).hasSize(4);
    }

    @Test
    void findBooksTitleContains() {
        // when
        List<Book> findBooksTitleContains = bookService.findBooksTitleContains("Mal");

        // then
        assertThat(findBooksTitleContains).hasSize(2);
    }

    @Test
    void findLongestBooks() {
        //given
        //List<Book> longestBooks = new ArrayList<>().add(new Book("George R.R. Martin", "Gra o tron", Category.FANTASY, 999, false));
        Book longestBook = new Book("George R.R. Martin", "Gra o tron", Category.FANTASY, 999, false);
        List<Book> longestBooks = new ArrayList<>();
        longestBooks.add(longestBook);


        // when
        List<Book> findLongestBooks = bookService.findLongestBooks(1);

        // then
        System.out.println(findLongestBooks);
        System.out.println(longestBook);
        assertThat(findLongestBooks).isEqualTo(longestBooks);

    }

    @Test
    void bookWithLongestTitle() {
        // when
        String bookWithLongestTitle = bookService.bookWithLongestTitle();

        // then
        assertThat(bookWithLongestTitle).isEqualTo("Harry Potter i Kamien Filozoficzny");
    }

    @Test
    void sortBooksByPagesAsc() {
        // when
        List<Book> sortBooksByPagesAsc = bookService.sortBooksByPagesAsc();

        // then
        assertThat(sortBooksByPagesAsc).startsWith(new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.CLASSIC, 112, true));
    }

    @Test
    void groupBooksByCategory() {
        // when
        Map<Category, List<Book>> groupBooksByCategory = bookService.groupBooksByCategory();

        // then
        assertThat(groupBooksByCategory.keySet().size()).isEqualTo(10);
    }
}