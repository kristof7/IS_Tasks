package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.inject.Inject;
import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Mock
    private BookDao bookDao;
    @Inject
    BookService bookService;

    @Test
    public void dummyTest() {
        assertTrue(true);

    }
    private List<Book>books=new ArrayList<>();
    @BeforeEach
    public void createListBook(){
        books.add(new Book("Hanya Yanagihara", "Male zycie", Category.ROMANCE, 816, false));
        books.add(new Book("Maja Lunde", "Historia Pszczol", Category.STORY, 514, false));
        books.add(new Book("Leonie Swann", "Kroczac w ciemnosci", Category.ACTION, 424, false));
        books.add(new Book("George R.R. Martin", "Gra o tron", Category.FANTASY, 999, false));
        books.add(new Book("J. R. R. Tolkien", "Hobbit", Category.FANTASY, 315, false));
        books.add(new Book("Simon Beckett", "Chemia smierci", Category.THRILLER, 352, false));
        books.add(new Book("Marc Elsberg", "Blackout", Category.THRILLER, 784, false));
        books.add(new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORICAL, 304, false));
        books.add(new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.SCI_FI, 328, true));
        books.add(new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.FANTASY, 112, true));
        books.add(new Book("Jojo Moyes", "Zanim sie pojawiles", Category.STORY, 382, false));
        books.add(new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.BIOGRAPHY, 490, false));
    }
}