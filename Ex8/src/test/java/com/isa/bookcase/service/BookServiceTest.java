package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.dao.BookDaoImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    BookDaoImpl bookDao;

    BookService bookService;

    @BeforeEach
    public void setUp(){
        bookService = new BookService();
    }



    @Test
    public void dummyTest() {
        assertTrue(true);
    }
}