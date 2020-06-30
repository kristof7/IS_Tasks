package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService bookService;

    @Test
    public void dummyTest() {
        assertTrue(true);
    }

    @Test
    public void findBooksForKidsWithOnlyForKidsListOfBooksTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor2", "title2", Category.COMIC, 101, true),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, true),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksForKids();
        assertThat(result).hasSize(4);
    }

    @Test
    public void findBooksForKidsWithNotForKidsListOfBooksTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, false),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, false));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksForKids();
        assertThat(result).hasSize(0);
    }

    @Test
    public void findBooksForKidsWithRandomListOfBooksTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksForKids();
        assertThat(result).hasSize(2);
    }

    @Test
    public void findBooksForKidsWithEmptyListOfBooksTest() {
        List<Book> booksList = Arrays.asList();
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksForKids();
        assertThat(result).hasSize(0);
    }

    @Test
    public void findBooksForKidsWithNoListOfBooksTest() {
        List<Book> booksList = null;
        when(bookDao.findAllBooks()).thenReturn(booksList);
        assertThrows(NullPointerException.class, () -> bookService.findBooksForKids());
    }

    @Test
    public void findBooksAuthorStartsWithButTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksAuthorStartsWith("but");
        assertThat(result).hasSize(1);
        assertThat(result).contains(booksList.get(1));
    }

    @Test
    public void findBooksAuthorStartsWithCutTest() {
        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksAuthorStartsWith("cut");
        assertThat(result).hasSize(2);
        assertThat(result).contains(booksList.get(2), booksList.get(3));
    }

    @Test
    public void findBooksAuthorStartsWithAsdTest() {
        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksAuthorStartsWith("asd");
        assertThat(result).hasSize(0);
        assertThat(result).isEmpty();
    }

    @Test
    public void findBooksAuthorStartsWithCutForEmptyListTest() {
        List<Book> booksList = Arrays.asList();
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksAuthorStartsWith("cut");
        assertThat(result).hasSize(0);
    }

    @Test
    public void findBooksAuthorStartsWithCutForNoListTest() {
        List<Book> booksList = null;
        when(bookDao.findAllBooks()).thenReturn(booksList);
        assertThrows(NullPointerException.class, () -> bookService.findBooksAuthorStartsWith("cut"));
    }

    @Test
    public void findBooksTitleContainsE2Test() {
        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksTitleContains("e2");
        assertThat(result).hasSize(1);
        assertThat(result).contains(booksList.get(1));
    }

    @Test
    public void findBooksTitleContainsTleTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksTitleContains("tle");
        assertThat(result).hasSize(4);
        assertThat(result).contains(booksList.get(0), booksList.get(1), booksList.get(2), booksList.get(3));
    }

    @Test
    public void findBooksTitleContainsATest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksTitleContains("a");
        assertThat(result).hasSize(0);
        assertThat(result).isEmpty();
    }

    @Test
    public void findBooksTitleContainsTleForEmptyListTest() {

        List<Book> booksList = Arrays.asList();
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findBooksTitleContains("a");
        assertThat(result).hasSize(0);
        assertThat(result).isEmpty();
    }

    @Test
    public void findBooksTitleContainsTleForNoListTest() {

        List<Book> booksList = null;
        when(bookDao.findAllBooks()).thenReturn(booksList);
        assertThrows(NullPointerException.class, () -> bookService.findBooksTitleContains("tle"));
    }

    @Test
    public void findLongestBooksForMaxSize1Test() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 102, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findLongestBooks(1);
        assertThat(result).hasSize(1);
        assertThat(result).contains(booksList.get(3));

    }

    @Test
    public void findLongestBooksForMaxSize4Test() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 101, true),
                new Book("buthor2", "title2", Category.COMIC, 100, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 103, false),
                new Book("cuthor4", "title4", Category.CRIME, 102, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findLongestBooks(4);
        assertThat(result).hasSize(4);
        assertThat(result).containsExactly(booksList.get(2), booksList.get(3), booksList.get(0), booksList.get(1));
    }
    @Test
    public void findLongestBooksForTwoSameSizeBooksWithMaxSize1Test() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 103, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 100, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findLongestBooks(1);
        assertThat(result).hasSize(1);
        assertThat(result).containsExactly(booksList.get(0));
    }

    @Test
    public void findLongestBooksForTwoSameSizeBooksWithMaxSize2Test() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 103, true),
                new Book("buthor2", "title2", Category.COMIC, 101, false),
                new Book("cuthor3", "title3", Category.BIOGRAPHY, 100, false),
                new Book("cuthor4", "title4", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findLongestBooks(2);
        assertThat(result).hasSize(2);
        assertThat(result).containsExactly(booksList.get(0), booksList.get(3));
    }

    @Test
    public void findLongestBooksForEmptyListTest() {

        List<Book> booksList = Arrays.asList();
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.findLongestBooks(4);
        assertThat(result).hasSize(0);
        assertThat(result).isEmpty();

    }
    @Test
    public void findLongestBooksForNoListTest() {

        List<Book> booksList = null;
        when(bookDao.findAllBooks()).thenReturn(booksList);
        assertThrows(NullPointerException.class, () -> bookService.findLongestBooks(4));

    }
    @Test
    public void bookWithLongestTitleForOneLongestBookTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, false),
                new Book("buthor1", "title12", Category.COMIC, 101, false),
                new Book("cuthor1", "title123", Category.BIOGRAPHY, 102, false),
                new Book("cuthor1", "title1234", Category.CRIME, 103, false));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        String result = bookService.bookWithLongestTitle();
        assertThat(result).isEqualTo("title1234");
    }

    @Test
    public void bookWithLongestTitleForManyBooksWithLongestTitleTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, true),
                new Book("buthor1", "title12", Category.COMIC, 101, false),
                new Book("cuthor1", "title1234", Category.BIOGRAPHY, 102, false),
                new Book("cuthor1", "title5678", Category.CRIME, 103, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        String result = bookService.bookWithLongestTitle();
        assertThat(result).isEqualTo("title1234");

    }

    @Test
    public void bookWithLongestTitleForEmptyListTest() {

        List<Book> booksList = Arrays.asList();
        when(bookDao.findAllBooks()).thenReturn(booksList);
        assertThrows(NoSuchElementException.class, () -> bookService.bookWithLongestTitle());

    }
    @Test
    public void bookWithLongestTitleForNoListTest() {

        List<Book> booksList = null;
        when(bookDao.findAllBooks()).thenReturn(booksList);
        assertThrows(NullPointerException.class, () -> bookService.bookWithLongestTitle());

    }

    @Test
    public void sortBooksByPagesAscForRandomBooksListTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 101, true),
                new Book("buthor1", "title12", Category.COMIC, 103, false),
                new Book("cuthor1", "title123", Category.BIOGRAPHY, 100, false),
                new Book("cuthor1", "title1234", Category.CRIME, 104, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.sortBooksByPagesAsc();
        assertThat(result).hasSize(4);
        assertThat(result).containsExactly(booksList.get(2), booksList.get(0), booksList.get(1), booksList.get(3));
    }

    @Test
    public void sortBooksByPagesAscForTwoSameSizeBooksTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, false),
                new Book("buthor1", "title12", Category.COMIC, 100, true));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.sortBooksByPagesAsc();
        assertThat(result).hasSize(2);
        assertThat(result).containsExactly(booksList.get(0), booksList.get(1));
    }

    @Test
    public void sortBooksByPagesAscForEmptyListTest() {

        List<Book> booksList = Arrays.asList();
        when(bookDao.findAllBooks()).thenReturn(booksList);
        List<Book> result = bookService.sortBooksByPagesAsc();
        assertThat(result).hasSize(0);
    }
    @Test
    public void sortBooksByPagesAscForNoListTest() {

        List<Book> booksList = null;
        when(bookDao.findAllBooks()).thenReturn(booksList);
        assertThrows(NullPointerException.class, () -> bookService.sortBooksByPagesAsc());
    }
    @Test
    public void groupBooksByCategoryForEachDiffrentCategoryTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, false),
                new Book("buthor1", "title12", Category.BIOGRAPHY, 101, false),
                new Book("cuthor1", "title123", Category.COMIC, 102, false),
                new Book("cuthor1", "title1234", Category.CRIME, 103, false));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        Map<Category, List<Book>> result = bookService.groupBooksByCategory();
        assertThat(result).hasSize(4);
        assertThat(result).containsKeys(Category.ACTION, Category.BIOGRAPHY, Category.COMIC, Category.CRIME);
        assertThat(result).containsValues(Arrays.asList(booksList.get(0)), Arrays.asList(booksList.get(1)), Arrays.asList(booksList.get(2)), Arrays.asList(booksList.get(3)));
    }
    @Test
    public void groupBooksByCategoryForSameCategoryTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.BIOGRAPHY, 100, false),
                new Book("buthor1", "title12", Category.BIOGRAPHY, 101, false),
                new Book("cuthor1", "title123", Category.BIOGRAPHY, 102, false),
                new Book("cuthor1", "title1234", Category.BIOGRAPHY, 103, false));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        Map<Category, List<Book>> result = bookService.groupBooksByCategory();
        assertThat(result).hasSize(1);
        assertThat(result).containsKeys(Category.BIOGRAPHY);
        assertThat(result).containsValues(Arrays.asList(booksList.get(0), booksList.get(1), booksList.get(2), booksList.get(3)));
    }
    @Test
    public void groupBooksByCategoryForRandomCategoryTest() {

        List<Book> booksList = Arrays.asList(
                new Book("author1", "title1", Category.ACTION, 100, false),
                new Book("buthor1", "title12", Category.BIOGRAPHY, 101, false),
                new Book("cuthor1", "title123", Category.BIOGRAPHY, 102, false),
                new Book("cuthor1", "title1234", Category.CRIME, 103, false));
        when(bookDao.findAllBooks()).thenReturn(booksList);
        Map<Category, List<Book>> result = bookService.groupBooksByCategory();
        assertThat(result).hasSize(3);
        assertThat(result).containsKeys(Category.ACTION, Category.BIOGRAPHY, Category.CRIME);
        assertThat(result).containsValues(Arrays.asList(booksList.get(0)), Arrays.asList(booksList.get(1), booksList.get(2)), Arrays.asList(booksList.get(3)));
    }

    @Test
    public void groupBooksByCategoryForEmptyListTest() {

        List<Book> booksList = Arrays.asList();
        when(bookDao.findAllBooks()).thenReturn(booksList);
        Map<Category, List<Book>> result = bookService.groupBooksByCategory();
        assertThat(result).hasSize(0);
        assertThat(result).containsKeys().isEmpty();
        assertThat(result).containsValues().isEmpty();
    }

    @Test
    public void groupBooksByCategoryForNoListTest() {

        List<Book> booksList = null;
        when(bookDao.findAllBooks()).thenReturn(booksList);
        assertThrows(NullPointerException.class, () -> bookService.groupBooksByCategory());
    }
}