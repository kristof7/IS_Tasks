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


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Mock
    private BookDao bookDao;

    @InjectMocks
    BookService bookService;

    private List<Book> books = new ArrayList<>();

    @BeforeEach
    public void createListBook() {
        books.add(new Book("Hanya Yanagihara", "Male zycie", Category.LITERATURA_PIEKNA, 816, false));
        books.add(new Book("Maja Lunde", "Historia Pszczol", Category.LITERATURA_PIEKNA, 514, false));
        books.add(new Book("Leonie Swann", "Kroczac w ciemnosci", Category.LITERATURA_PIEKNA, 424, false));
        books.add(new Book("George R.R. Martin", "Gra o tron", Category.FANTASTYKA_SCIENCE_FICTION, 999, false));
        books.add(new Book("J. R. R. Tolkien", "Hobbit", Category.FANTASTYKA_SCIENCE_FICTION, 315, false));
        books.add(new Book("Simon Beckett", "Chemia smierci", Category.KRYMINAL_SENSACJA_THRILLER, 352, false));
        books.add(new Book("Marc Elsberg", "Blackout", Category.KRYMINAL_SENSACJA_THRILLER, 784, false));
        books.add(new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORYCZNA, 304, false));
        books.add(new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.FANTASTYKA_SCIENCE_FICTION, 328, true));
        books.add(new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.LITERATURA_PIEKNA, 112, true));
        books.add(new Book("Jojo Moyes", "Zanim sie pojawiles", Category.OBYCZAJOWA_ROMANS, 382, false));
        books.add(new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.PUBLICYSTYKA_BIOGRAFIA, 490, false));
    }

    @Test
    public void checkMethodFindBooksForKids() {

        List<Book> booksForKids = books
                .stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = bookService.findBooksForKids();

        assertThat(result)
                .isEqualTo(booksForKids)
                .hasSize(booksForKids.size())
                .contains(new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.LITERATURA_PIEKNA, 112, true),
                        new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.FANTASTYKA_SCIENCE_FICTION, 328, true));
    }

    @Test
    public void checkMethodFindBookAuthorStarWith() {
        //given
        List<Book> authorStarWith = books
                .stream().filter(book -> book.getAuthor()
                        .startsWith("Jo"))
                .collect(Collectors.toList());

        //when

        when(bookDao.findAllBooks()).thenReturn(books);
        List<Book> result = bookService.findBooksAuthorStartsWith("Jo");

        //then
        assertThat(result).isEqualTo(authorStarWith)
                .contains(new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORYCZNA, 304, false),
                        new Book("Jojo Moyes", "Zanim sie pojawiles", Category.OBYCZAJOWA_ROMANS, 382, false)
                ).hasSize(1);
    }

    @Test
    public void checkWhenFndBooksTitleContains() {
        //given
        List<Book> resarchingBook = books
                .stream()
                .filter(book -> book.getTitle().contains("iles"))
                .collect(Collectors.toList());
//when
        when(bookDao.findAllBooks()).thenReturn(books);
        List<Book> result = bookService.findBooksTitleContains("iles");
//then
        assertThat(result).isEqualTo(resarchingBook);
    }

    @Test
    public void checkMethodfindLongestBooks() {
        //given
        List<Book> longestBooks = books.stream()
                .sorted(Comparator.comparing(Book::getPages)
                        .reversed())
                .limit(1000)
                .collect(Collectors.toList());
        //when

        when(bookDao.findAllBooks()).thenReturn(books);
        List<Book> result = bookService.findLongestBooks(1000);

        //then
        assertThat(result).isEqualTo(longestBooks).hasSameSizeAs(longestBooks);

    }

    @Test
    public void checkBookWithLongestTitle() {
        //given

        String longestBooks = books.stream()
                .max(Comparator.comparing(p -> p.getTitle()
                        .length()))
                .map(Book::getTitle)
                .get();
        //when

        when(bookDao.findAllBooks()).thenReturn(books);
        String bookWithLongestTitle = bookService.bookWithLongestTitle();

        //then

        assertThat(bookWithLongestTitle)
                .isEqualTo(longestBooks)
                .hasSameSizeAs(bookWithLongestTitle);
    }

    @Test
    public void checkExeptionMethodwhenTitleIsNull() {
        when(bookDao.findAllBooks()).thenReturn(books);

        assertThrows(NullPointerException.class, () -> bookService.findBooksTitleContains(null));

    }
}