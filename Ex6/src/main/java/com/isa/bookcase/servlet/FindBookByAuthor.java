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

@WebServlet("/find-book-by-author")
public class FindBookByAuthor extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String authorParam = req.getParameter("author");
        PrintWriter printWriter = resp.getWriter();


        if ((authorParam == null) || (authorParam.isEmpty())) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        List<Book> books = bookService.getBooksListByAuthor(authorParam);
        Book book = bookService.getBookByAuthor(authorParam);

        resp.setContentType("text/html;charset=UTF-8");
        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<body>");

        if (book != null) {
            for (Book bookFromList : books) {
                printWriter.println(bookFromList + "<br>");
                printWriter.println("</body>");
                printWriter.println("</html>");
            }
        } else {
            printWriter.println("Book doesn't exist");
        }
    }
}
