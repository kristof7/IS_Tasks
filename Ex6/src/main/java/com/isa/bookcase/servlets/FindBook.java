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
import java.util.List;

@WebServlet("/find-book")
public class FindBook extends HttpServlet {
    @Inject
    BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramAuthor = req.getParameter("author");
        String title = req.getParameter("title");
        if (paramAuthor == null || paramAuthor.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<!DOCTYPE html>");

        List<Book> booksForAuthor = bookService.findBookForAuthor(paramAuthor);
        resp.getWriter().println("<body>");
        if (booksForAuthor.size() == 0) {
            resp.getWriter().println("author not fund " + paramAuthor);
        } else {
            resp.getWriter().println(bookService.findBookForAuthor(paramAuthor.toString()));
        }
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
    }
}


