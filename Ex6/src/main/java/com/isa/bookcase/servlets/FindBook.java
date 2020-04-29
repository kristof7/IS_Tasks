package com.isa.bookcase.servlets;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/find-book")
public class FindBook extends HttpServlet {
    @Inject
    BookService bookService;

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author = req.getParameter("author");
        if (author == null || author.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        resp.getWriter().println("<!DOCTYPE html>");
        if (author == null) {
            resp.getWriter().println("author not fund " + author);
        } else {
            resp.getWriter().println(bookService.findBookForAuthor(author.toString()));
        }
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");

    }
}

