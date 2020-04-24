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

@WebServlet("/find-book")
public class FindBook extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String authorParam = req.getParameter("author");

        if (authorParam == null || authorParam.isEmpty()){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        Book book = bookService.findByAuthor(authorParam);
        PrintWriter printWriter = resp.getWriter();

        if (book != null) {
            printWriter.println(book.getAuthor());
            printWriter.println(book.getTitle());
            printWriter.println(book.getPages());
            printWriter.println(book.getCategory());
            printWriter.println(book.isForKids());
        } else {
            printWriter.println("Author has not been found!");
        }
    }
}
