package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/books")
public class Bookcase extends HttpServlet {

    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pw = resp.getWriter();

        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<body>");

        List<Book> books = bookService.findAll();
        int index = 0;
        for (Book book : books) {
            pw.println("<br>" + (++index) + "." + "<br>");
            pw.println(book.printBookDetails(book) + "<br>");
        }

        pw.println("</body>");
        pw.println("</html>");

    }
}
