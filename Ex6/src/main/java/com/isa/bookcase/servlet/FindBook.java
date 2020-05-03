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
import java.util.*;

@WebServlet("/find-book")
public class FindBook extends HttpServlet {

    @Inject
    BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<html><body>");

        String author = req.getParameter("author");
        String title = req.getParameter("title");

        if (author == null || author.isEmpty() ) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        if (title == null || title.isEmpty()) {
            Set<Book> findedBooks = bookService.findByAuthor(author);
            for (Book book : findedBooks) {
                printWriter.println(book.getTitle() + "<br>");
                printWriter.println(book.getAuthor() + "<br>");
                printWriter.println(book.getCategory() + "<br>");
                printWriter.println(book.getPages() + "<br>");
                printWriter.println((book.isForKids() ? "Jest dla dzieci" : "nie dla dzieci") + "<br>");
                printWriter.println("<br><br>");
            }
        } else {
            Set<Book> findedBooks = bookService.findByTitleAndAuthor(title, author);
            for (Book book : findedBooks) {
                printWriter.println(book.getTitle() + "<br>");
                printWriter.println(book.getAuthor() + "<br>");
                printWriter.println(book.getCategory() + "<br>");
                printWriter.println(book.getPages() + "<br>");
                printWriter.println((book.isForKids() ? "Jest dla dzieci" : "nie dla dzieci") + "<br>");
                printWriter.println("<br><br>");
            }
        }
        resp.getWriter().println("</body></html>");

    }
}
