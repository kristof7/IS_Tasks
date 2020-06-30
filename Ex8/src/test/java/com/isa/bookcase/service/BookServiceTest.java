package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.isa.bookcase.entity.Category.CLASSIC;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Mock
    private BookDao bookDao;
    @InjectMocks
    private BookService bookService;

    @Test
    public void findBooksForKidsShouldReturOnlyBookForKids() {
        //Given
        Book malyKsiaze = new Book("Antoine de Saint-exupery", "maly ksiaze", CLASSIC, 112, true);
        Book harryPotter = new Book("J.K.ROwling", "Harry Potter i kamien filozficzny", Category.FANTASY, 328, true);
        Book chemiaSmierci = new Book("Simon Beckett", "CHemia smierci", Category.CRIME, 352, false);

        when(bookDao.findAllBooks()).thenReturn(List.of(malyKsiaze, harryPotter, chemiaSmierci));
        //when
        List<Book> result = bookService.findBooksForKids();
        //then
        assertThat(result).hasSize(2)
                .containsExactly(malyKsiaze, harryPotter);
    }

    @Test
    public void dummyTest() {
        assertTrue(true);
    }

    @Test
    void findBooksAuthorStartsWith() {
        //given
        List<Book> books = List.of(
                new Book("Hanya Yanagihara", "Male zycie", Category.ACTION, 816, false),
                new Book("Maja Lunde", "Historia Pszczol", CLASSIC, 514, false),
                new Book("Leonie Swann", "Kroczac w ciemnosci", CLASSIC, 424, false),
                new Book("George R.R. Martin", "Gra o tron", Category.FANTASY, 999, false));
        when(bookDao.findAllBooks()).thenReturn(books);
        //when
        List<Book> result = bookService.findBooksAuthorStartsWith("Le");
        List<Book> result6=bookService.findBooksAuthorStartsWith("");
        //then
        assertThat(result).hasSize(1).contains(books.get(2));
        assertThat(result6).isEqualTo(books);

    }

    @Test
    public void FindIfBookwhichTitleContainingFragment() {
        List<Book> books = List.of(
                new Book("J. R. R. Tolkien", "Hobbit", Category.FANTASY, 315, false),
                new Book("Simon Beckett", "Chemia smierci", Category.CRIME, 352, false),
                new Book("Marc Elsberg", "Blackout", Category.CRIME, 784, false),
                new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORICAL, 304, false),
                new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true));

        when(bookDao.findAllBooks()).thenReturn(books);
        //when
        List<Book> result2 = bookService.findBooksTitleContains("Chem");
        //then
        assertThat(result2).hasSize(1).contains(books.get(1));

    }


    @Test
    public void findifBookHaslongestTitle() {
        // given
        List<Book> books2 = List.of(
                new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true),
                new Book("Antoine de Saint-Exupery", "Maly Ksiaze", CLASSIC, 112, true),
                new Book("Jojo Moyes", "Zanim sie pojawiles", Category.ROMANCE, 382, false),
                new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.BIOGRAPHY, 490, false));
        Book thelongestbook = new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true);
        String thelongestTitle = thelongestbook.getTitle();
        //when
        when(bookDao.findAllBooks()).thenReturn(books2);
        String result2 = bookService.bookWithLongestTitle();
        System.out.println(result2);

        //then
        assertThat(result2).isEqualTo(thelongestTitle).hasSameSizeAs(thelongestTitle);
        assertEquals("Harry Potter i Kamien Filozoficzny", result2);

    }


    @Test
    void FindIfBookIsTheLongest() {
        final Optional<Book> listaLongest = Optional.of(new Book("Jojo Moyes", "Zanim sie pojawiles", Category.ROMANCE, 382, false));


        final List<Book> lista = List.of(
                new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true),
                new Book("Antoine de Saint-Exupery", "Maly Ksiaze", CLASSIC, 112, true),
                new Book("Jojo Moyes", "Zanim sie pojawiles", Category.ROMANCE, 382, false));


        final List<Book> expected = List.of(
                new Book("Jojo Moyes", "Zanim sie pojawiles", Category.ROMANCE, 382, false),
                new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true),
                new Book("Antoine de Saint-Exupery", "Maly Ksiaze", CLASSIC, 112, true));

        when(bookDao.findAllBooks()).thenReturn(lista);
        //when
        List<Book> result2 = bookService.findLongestBooks(40);

        result2.sort(Comparator.comparing(Book::getPages).reversed());
        List<Book> result3 = bookService.findLongestBooks(400);
        //then
        Assertions.assertEquals(expected, result2);
        assertThat(result2).hasSize(3);

        int limit = 200;
        Assertions.assertEquals(listaLongest, result3.stream().limit(400).filter(book -> book.getPages() > 100).max(Comparator.comparingInt(Book::getPages)));
    }

    @Test
    public void ifBookIsSortedWithAscendingOrder() {
        //given
        final List<Book> lista = List.of(
                new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true),
                new Book("Antoine de Saint-Exupery", "Maly Ksiaze", CLASSIC, 112, true),
                new Book("Jojo Moyes", "Zanim sie pojawiles", Category.ROMANCE, 382, false));


        final List<Book> expected = List.of(
                new Book("Antoine de Saint-Exupery", "Maly Ksiaze", CLASSIC, 112, true),
                new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true),
                new Book("Jojo Moyes", "Zanim sie pojawiles", Category.ROMANCE, 382, false));


        when(bookDao.findAllBooks()).thenReturn(lista);
        //when
        List<Book> result2 = bookService.sortBooksByPagesAsc();
        result2.sort(Comparator.comparing(Book::getPages));
        //then
        Assertions.assertEquals(expected, result2);
        assertThat(expected.get(2).getPages()).isEqualTo(382);
        assertThat(result2).hasSize(3);
    }

    @Test
    public void ifBooksAreGroupedByCategory() {
        //given
        final List<Book> lista = List.of(
                new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true),
                new Book("Antoine de Saint-Exupery", "Maly Ksiaze", CLASSIC, 112, true),
                new Book("Jojo Moyes", "Zanim sie pojawiles", Category.ROMANCE, 382, false),
                new Book("Simon Beckett", "Chemia smierci", Category.CRIME, 352, false),
                new Book("Marc Elsberg", "Blackout", Category.CRIME, 784, false));
        Map<Category, List<Book>> result4 = lista.stream().collect(Collectors.groupingBy(Book::getCategory));

        //when
        when(bookDao.findAllBooks()).thenReturn(lista);
        Map<Category, List<Book>> result5 = bookService.groupBooksByCategory();
        //then
        assertThat(result5).isEqualTo(result4).hasSize(4).containsKeys(Category.CLASSIC, Category.CRIME, Category.SCI_FI, Category.ROMANCE);
        assertThat(result4.keySet().size()).isEqualTo(4);
    }
}