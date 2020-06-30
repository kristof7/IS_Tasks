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
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService bookService;

    private static final Logger logger = Logger.getLogger(BookServiceTest.class.getName());

    List<Book> books = new ArrayList<>();

    @BeforeEach
    public void createSampleBooks() {
        books.add(new Book("J.R.R. Tolkien", "The Hobbit or There and Back Again", Category.FANTASY, 310, true));
        books.add(new Book("Britton Paul", "Profil Mordercy", Category.CRIME, 528, false));
        books.add(new Book("Jo Nesbo", "Człowiek nietoperz. Harry Hole. Tom 1", Category.CRIME, 344, false));
        books.add(new Book("Alexander Freed", "Rogue One: A Star Wars Story", Category.SCI_FI, 323, false));
        books.add(new Book("Zahn Timothy", "Star Wars Thrawn. Dziedzic Imperium ", Category.SCI_FI, 400, false));
        books.add(new Book("Antoine de Saint Exupery", "Mały Książę", Category.STORY, 128, true));
    }

    @Test
    public void testIfFunctionFindBooksForKidsReturnValidOutput() {
        logger.info("Check if function find books for kids return books for kids");
        List<Book> booksForKids = books.stream()
                .filter(Book::isForKids)
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = bookService.findBooksForKids();

        assertThat(result).isNotNull()
                .isEqualTo(booksForKids)
                .hasSize(2);
    }

    @Test
    public void testIfFunctionFindBooksAuthorStartsWithReturnsValidOutput() {
        logger.info("Check if books author's name starts with inputted value");
        String prefix = "J";
        List<Book> booksStartsWithPrefix = books
                .stream()
                .filter(book -> book.getAuthor()
                        .startsWith(prefix))
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = bookService.findBooksAuthorStartsWith(prefix);

        assertThat(result).isNotNull()
                .isEqualTo(booksStartsWithPrefix)
                .contains(books.get(0), books.get(2))
                .hasSize(2);
    }

    @Test
    public void testIfFunctionFindBooksTitleContainsReturnsValidOutput() {
        logger.info("Check if books title contains inputted value");
        String fragment = "Star Wars";
        List<Book> booksContainsFragment = books
                .stream()
                .filter(book -> book.getTitle()
                        .contains(fragment))
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = bookService.findBooksTitleContains(fragment);

        assertThat(result).isNotNull()
                .isEqualTo(booksContainsFragment)
                .contains(books.get(3), books.get(4))
                .hasSize(2);
    }

    @Test
    public void testIfFunctionFindLongestBooksReturnsValidOutput() {
        logger.info("Check if function returns inputed number of the longest books");
        Integer maxSize = 2;
        List<Book> longestBooks = books
                .stream()
                .sorted(Comparator.comparing(Book::getPages)
                        .reversed())
                .limit(maxSize)
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = bookService.findLongestBooks(maxSize);

        assertThat(result).isNotNull()
                .isEqualTo(longestBooks)
                .contains(books.get(1), books.get(4))
                .hasSize(2);
    }

    @Test
    public void testIfFunctionBookWithLongestTitleReturnsValidOutput() {
        logger.info("Check if function returns book with longest title");
        String bookWithLongestTitle = books
                .stream()
                .max(Comparator.comparing(p -> p.getTitle()
                        .length()))
                .map(Book::getTitle)
                .get();

        when(bookDao.findAllBooks()).thenReturn(books);

        String result = bookService.bookWithLongestTitle();

        assertThat(result).isNotNull()
                .isEqualTo(bookWithLongestTitle)
                .contains("Człowiek nietoperz. Harry Hole. Tom 1")
                .hasSize(37);
    }

    @Test
    public void testIfFunctionSortBooksByPagesAscReturnsValidOutput() {
        logger.info("Check if function returns books sorted by number of pages ascending");
        List<Book> sortedBooksAsc = books
                .stream()
                .sorted(Comparator.comparing(Book::getPages))
                .collect(Collectors.toList());

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> result = bookService.sortBooksByPagesAsc();

        assertThat(result).isNotNull()
                .isEqualTo(sortedBooksAsc)
                .contains(books.get(5), books.get(0), books.get(3), books.get(2), books.get(4), books.get(1))
                .hasSize(6);
    }

    @Test
    public void testIfFunctionGroupBooksByCategoryReturnsValidOutput() {
        logger.info("Check if function returns books sorted by category");
        Map<Category, List<Book>> booksSortedByCategory = books
                .stream()
                .collect(Collectors.groupingBy(Book::getCategory));

        when(bookDao.findAllBooks()).thenReturn(books);

        Map<Category, List<Book>> result = bookService.groupBooksByCategory();

        assertThat(result).isNotNull()
                .isEqualTo(booksSortedByCategory)
                .hasSize(4);
    }

}