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

@WebServlet("/book-for-today")
public class RandomBook extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html><body>");
        resp.setContentType("text/html;charset=UTF-8");
        Book book = bookService.findRandomBook();
        resp.getWriter().println(book.getTitle() + "<br>");
        resp.getWriter().println(book.getAuthor() + "<br>");
        resp.getWriter().println(book.getCategory() + "<br>");
        resp.getWriter().println(book.getPages() + "<br>");
        resp.getWriter().println((book.isForKids() ? "Jest dla dzieci" : "nie dla dzieci") + "<br>");
        resp.getWriter().println("<br><br>");
        resp.getWriter().println("</body></html>");
    }
}
