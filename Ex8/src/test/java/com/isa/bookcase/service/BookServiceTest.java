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

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService service;

    private List<Book> books = new ArrayList<>();

    @BeforeEach
    public void createBookList() {
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
    public void checkThatMethodReturnAllBooksForKids() {
        List<Book> booksForKids = books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.findBooksForKids();

        assertThat(result).isEqualTo(booksForKids)
                .hasSize(booksForKids.size())
                .contains(new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.FANTASTYKA_SCIENCE_FICTION, 328, true),
                        new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.LITERATURA_PIEKNA, 112, true));
    }

    @Test
    public void checkThatMethodSortBooksByPagesASC() {
        List<Book> sortedListByPages = books
                .stream()
                .sorted(Comparator.comparing(Book::getPages))
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.sortBooksByPagesAsc();

        assertThat(result).isEqualTo(sortedListByPages)
                .contains(new Book("George R.R. Martin", "Gra o tron", Category.FANTASTYKA_SCIENCE_FICTION, 999, false), sortedListByPages.get(0));
    }

    @Test
    public void CheckThatMethodIsGroupingBooksByCategory() {
        Map<Category, List<Book>> booksGropingByCategory = books
                .stream()
                .collect(Collectors.groupingBy(Book::getCategory));

        when(bookDao.findAllBooks()).thenReturn(books);

        Map<Category, List<Book>> result = service.groupBooksByCategory();

        assertThat(result).isEqualTo(booksGropingByCategory)
                .hasSize(6)
                .containsKeys(Category.FANTASTYKA_SCIENCE_FICTION, Category.LITERATURA_PIEKNA,
                        Category.KRYMINAL_SENSACJA_THRILLER, Category.HISTORYCZNA, Category.OBYCZAJOWA_ROMANS, Category.PUBLICYSTYKA_BIOGRAFIA);
    }

    @Test
    public void checkThatIsMethodReturningBooksWithAuthorStartsWithPrefix() {
        List<Book> booksStartsWithGeor = books
                .stream()
                .filter(book -> book.getAuthor()
                        .startsWith("Geor"))
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.findBooksAuthorStartsWith("Geor");

        assertThat(result).isEqualTo(booksStartsWithGeor)
                .contains(new Book("George R.R. Martin", "Gra o tron", Category.FANTASTYKA_SCIENCE_FICTION, 999, false))
                .hasSize(1);
    }

    @Test
    public void checkThatMethodIsThrowNPEwhenGivenIsNullAsPrefix() {
        when(bookDao.findAllBooks()).thenReturn(books);

        assertThrows(NullPointerException.class, () -> service.findBooksAuthorStartsWith(null));
    }

    @Test
    public void checkThatMethodIsReturningAllBooksWhenEmptyStringIsGivenAsPrefix() {
        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.findBooksAuthorStartsWith("");

        assertThat(result).isEqualTo(books);
    }

    @Test
    public void checkThatEmptyListIsReturningWhenIsGivenAsPrefixStringNonExistingInList() {
        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.findBooksTitleContains("sialalala");

        assertThat(result).isNotNull()
                .hasSize(0);
    }


    @Test
    public void checkThatIsMethodReturningBooksContainsExactFragmentOfTittle() {
        List<Book> searchingBooks = books.stream()
                .filter(book -> book.getTitle().contains("Gra"))
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.findBooksTitleContains("Gra");

        assertThat(result).hasSize(1)
                .isEqualTo(searchingBooks);

    }

    @Test
    public void checkThatMethodIsThrowNPEwhenGivenIsNullToSearchByPartOfTittle() {
        when(bookDao.findAllBooks()).thenReturn(books);

        assertThrows(NullPointerException.class, () -> service.findBooksTitleContains(null));
    }

    @Test
    public void checkThatMethodIsReturningAllBooksWhenEmptyStringToSearchByPartOfTittle() {
        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.findBooksTitleContains("");

        assertThat(result).isEqualTo(books);
    }

    @Test
    public void checkThatMethodReturnBookWithLongestTittle() {
        Book longestBook = new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.FANTASTYKA_SCIENCE_FICTION, 328, true);
        String longestTittle = longestBook.getTitle();

        when(bookDao.findAllBooks()).thenReturn(books);

        String result = service.bookWithLongestTitle();

        assertThat(result).isEqualTo(longestTittle)
                .hasSameSizeAs(longestTittle);
    }

    @Test
    public void sortBookByPagesAndReturnToListExactLimitOfBooksWhenLimitIsEqualBooksListSize() {
        int limit = books.size();

        List<Book> booksWhichLimit12 = books
                .stream()
                .sorted(Comparator.comparing(Book::getPages).reversed())
                .limit(limit)
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.findLongestBooks(limit);

        assertThat(result).isEqualTo(booksWhichLimit12)
                .hasSize(limit);
    }

    @Test
    public void sortBookByPagesAndReturnToListExactLimitOfBooksWhenLimitIsHigherBooksListSize() {
        when(bookDao.findAllBooks()).thenReturn(books);
        List<Book> sortedBooks = books
                .stream()
                .sorted(Comparator.comparing(Book::getPages).reversed())
                .collect(Collectors.toList());

        List<Book> result = service.findLongestBooks(20);

        assertThat(result).isEqualTo(sortedBooks)
                .hasSize(books.size());
    }

    @Test
    public void sortBookByPagesAndReturnToListExactLimitOfBooksWhenLimitIsInRangeBooksListSize() {
        int limit = ThreadLocalRandom.current().nextInt(0, books.size());

        List<Book> booksWhichLimit12 = books
                .stream()
                .sorted(Comparator.comparing(Book::getPages).reversed())
                .limit(limit)
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.findLongestBooks(limit);

        assertThat(result).isEqualTo(booksWhichLimit12)
                .hasSize(limit);
    }

    @Test
    public void sortBookByPagesAndReturnToListExactLimitOfBooksWhenLimitIsZero() {
        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = service.findLongestBooks(0);

        assertThat(result).isNotNull()
                .hasSize(0);
    }

    @Test
    public void sortBookByPagesAndReturnToListExactLimitOfBooksWhenLimitIsBelowZero() {
        when(bookDao.findAllBooks()).thenReturn(books);

        assertThrows(IllegalArgumentException.class, () -> service.findLongestBooks(-2));
    }

    @Test
    public void sortBookByPagesAndReturnToListExactLimitOfBooksWhenLimitIsNull() {
        when(bookDao.findAllBooks()).thenReturn(books);

        assertThrows(NullPointerException.class, () -> service.findLongestBooks(null));
    }

}