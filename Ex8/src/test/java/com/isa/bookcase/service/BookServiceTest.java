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

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookDao bookDao;
    @InjectMocks
    private BookService bookService;

    List<Book> result;

    Book smith = new Book("J. Kowalski", "Rzecz o kowalach", Category.HISTORICAL, 123, false);
    Book bumblebee = new Book("B. Nowak", "Trzmielik Majek", Category.DRAMA, 321, true);
    Book cherry = new Book("M. Wisniewska","Napoleon od kuchni", Category.BIOGRAPHY, 543, false);
    Book advocate = new Book("G. Wójcik","Wielcy wójtowie przez wieki",Category.HISTORICAL,345,false);

    @BeforeEach
    public void setBookDao() {
        List<Book> books = List.of(smith,bumblebee,cherry,advocate);
        when(bookDao.findAllBooks()).thenReturn(books);
    }

    @Test
    public void shouldReturnOnlyBooksForKids() {
        result = bookService.findBooksForKids();
        assertThat(result).hasSize(1).contains(bumblebee);
    }

    @Test
    public void shouldReturnAuthor() {
        result = bookService.findBooksAuthorStartsWith("J");
        assertThat(result).isNotEmpty().isEqualTo(List.of(smith));
    }

    @Test
    public void shouldReturnBookTitle(){
        result = bookService.findBooksTitleContains("owal");
        assertThat(result).isNotEmpty().contains(smith);
    }

    @Test
    public void shouldThrowExceptionWhenParameterIsNull() {
        assertThrows(RuntimeException.class, () -> bookService.findBooksAuthorStartsWith(null));
        assertThrows(NullPointerException.class, () -> bookService.findBooksTitleContains(null));
        assertThrows(NullPointerException.class, () -> bookService.findLongestBooks(null));

    }
    @Test
    public void shouldReturnEverythingWhenStringParameterIsEmpty(){
        result = bookService.findBooksTitleContains("");
        assertThat(result).hasSize(4);
        result = bookService.findBooksAuthorStartsWith("");
        assertThat(result).hasSize(4);
    }
    @Test
    public void shouldReturnEmptyListWhenStringParameterDoesNotMatch(){
        result = bookService.findBooksTitleContains("x");
        assertThat(result).isEmpty();
        result = bookService.findBooksAuthorStartsWith("x");
        assertThat(result).isEmpty();
    }
    @Test
    public void shouldReturnLongestTitle(){
        String actualTitle = bookService.bookWithLongestTitle();
        assertThat(actualTitle).isEqualTo(advocate.getTitle());
    }
    @Test
    public void shouldSortBooksByAscendingOrderOfPages(){
        result = bookService.sortBooksByPagesAsc();
        assertThat(result.get(0)).isEqualTo(smith);
        assertThat(result.get(3)).isEqualTo(cherry);
    }
    @Test
    public void shouldGroupBooksByCategory(){
        Map<Category, List<Book>> actualMap = bookService.groupBooksByCategory();
        Map<Category, List<Book>> expectedMap = Map.of(smith.getCategory(),List.of(smith,advocate),
                bumblebee.getCategory(),List.of(bumblebee),
                cherry.getCategory(),List.of(cherry));
        assertThat(actualMap).isEqualTo(expectedMap);
    }
    @Test
    public void shouldReturnLongestBookTitle(){
        assertThat(bookService.bookWithLongestTitle()).isEqualTo(advocate.getTitle());
    }
    @Test
    public void shouldReturnTwoLongestBooks(){
        assertThat(bookService.findLongestBooks(2)).isEqualTo(List.of(cherry,advocate));
    }

    @Test
    public void shouldReturnEmptyMapWhenBookListIsEmpty(){
        when(bookDao.findAllBooks()).thenReturn(List.of());
        Map<Category,List<Book>> map = bookService.groupBooksByCategory();
        assertThat(map).isEmpty();
    }
    @Test
    public void shouldReturnEmptyListWhenBookListIsEmpty(){
        when(bookDao.findAllBooks()).thenReturn(List.of());
        assertThat(bookService.findLongestBooks(1)).isEmpty();
        assertThat(bookService.findBooksAuthorStartsWith("K")).isEmpty();
        assertThat(bookService.findBooksForKids()).isEmpty();
        assertThat(bookService.findBooksTitleContains("owal")).isEmpty();
        assertThat(bookService.sortBooksByPagesAsc()).isEmpty();
    }
    @Test
    public void shouldReturnNullIfBookListIsEmpty(){
        when(bookDao.findAllBooks()).thenReturn(List.of());
        String title = bookService.bookWithLongestTitle();
        assertThat(title).isEqualTo(null);
    }

    @Test
    public void shouldThrowExceptionWhenBookListIsNull(){
        when(bookDao.findAllBooks()).thenReturn(null);
        assertThrows(RuntimeException.class, () -> bookService.findBooksAuthorStartsWith("test"));
        assertThrows(RuntimeException.class, () -> bookService.findBooksTitleContains("test"));
        assertThrows(RuntimeException.class, () -> bookService.findLongestBooks(2));
        assertThrows(RuntimeException.class, () -> bookService.findBooksForKids());
        assertThrows(RuntimeException.class, () -> bookService.bookWithLongestTitle());
        assertThrows(RuntimeException.class, () -> bookService.sortBooksByPagesAsc());
        assertThrows(RuntimeException.class, () -> bookService.groupBooksByCategory());
    }

}