package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/books")
public class BookCase extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();
        List<Book> books = bookService.findAll();
        for (Book book: books) {
            printWriter.println(book);
        }
    }
}
