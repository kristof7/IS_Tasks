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

@WebServlet("/find-book")
public class FindBook extends HttpServlet {

    @Inject
    private BookService bookService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String authorParam = req.getParameter("author");
        String titleParam = req.getParameter("title");
        PrintWriter printWriter = resp.getWriter();

        if (authorParam == null || authorParam.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        List<Book> booksByAuthor = bookService.getBooksListByAuthor(authorParam);
        Book bookByAuthor = bookService.getBookByAuthor(authorParam);

        resp.setContentType("text/html;charset=UTF-8");
        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<body>");

        if (bookByAuthor != null) {
            for (Book bookFromList : booksByAuthor) {
                printWriter.println(bookFromList + "<br>");
                printWriter.println("</body>");
                printWriter.println("</html>");
            }
        } else {
            printWriter.println("Book of this author doesn't exist<br>");
        }

        if (titleParam == null || titleParam.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        List<Book> booksByTitle = bookService.getBooksListByTitle(titleParam);
        Book bookByTitle = bookService.getBookByTitle(titleParam);

        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<body>");

        if (bookByTitle != null) {
            for (Book bookFromList : booksByTitle) {
                printWriter.println(bookFromList + "<br>");

                printWriter.println("</body>");
                printWriter.println("</html>");
            }
        } else {
            printWriter.println("Book with this title doesn't exist<br>");
        }
    }
}

