package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void beforeEach(){
        //given
        List<Book> books = List.of(
        new Book("Hanya Yanagihara", "Male zycie", Category.ROMANCE, 816, false),
        new Book("Maja Lunde", "Historia Pszczol", Category.ROMANCE, 514, false),
        new Book("Leonie Swann", "Kroczac w ciemnosci", Category.ROMANCE, 424, false),
        new Book("George R.R. Martin", "Gra o tron", Category.SCI_FI, 999, false),
        new Book("J. R. R. Tolkien", "Hobbit", Category.SCI_FI, 315, false),
        new Book("Simon Beckett", "Chemia smierci", Category.CRIME, 352, false),
        new Book("Marc Elsberg", "Blackout", Category.CRIME, 784, false),
        new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORICAL, 304, false),
        new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true),
        new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.ROMANCE, 112, true),
        new Book("Jojo Moyes", "Zanim sie pojawiles", Category.CLASSIC, 382, false),
        new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.BIOGRAPHY, 490, false)
        );

        when(bookDao.findAllBooks()).thenReturn(books);
    }




    @Test
    public void shouldGetAllBooksForKids() {
        //when
        List<Book> result = bookService.findBooksForKids();
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldGetAllBooksWhereAuthorStartsWith() {
        //when
        List<Book> result = bookService.findBooksAuthorStartsWith("Eli");
        //then
        assertThat(result).hasSize(1);
    }

    @Test
    public void shouldGetAllBooksTitleContainsFragment(){
        //when
        List<Book> result = bookService.findBooksTitleContains("mi");
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldGetTheLongestBooks(){
        //when
        List<Book> result = bookService.findLongestBooks();
        //then
        List<Book> expectedBook = List.of(
                new Book("George R.R. Martin", "Gra o tron", Category.SCI_FI, 999, false),
                new Book("Hanya Yanagihara", "Male zycie", Category.ROMANCE, 816, false),
                new Book("Marc Elsberg", "Blackout", Category.CRIME, 784, false)
        );
        assertThat(result.equals(expectedBook));
    }

    @Test
    public void shouldGetBookWithTheLongestTittle(){
        //when
        String result = bookService.bookWithLongestTitle();
        //then
        assertThat(result).isEqualTo("Harry Potter i Kamien Filozoficzny");
    }

    @Test
    public void shouldSortBooksByPages(){
        //when
        List<Book> result = bookService.sortBooksByPagesAsc();
        //then
        assertThat(result).isSortedAccordingTo(Comparator.comparing(Book::getPages));

   }

}