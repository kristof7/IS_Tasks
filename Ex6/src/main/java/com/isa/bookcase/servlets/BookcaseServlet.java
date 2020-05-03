package com.isa.bookcase.servlets;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.services.BookService;

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
public class BookcaseServlet extends HttpServlet {

    @Inject
    BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Book> books = bookService.getBooksRepository();
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<html>");
        printWriter.println("<body>");

        for ( Book book : books ) {
            bookService.printBookDetails(printWriter, book);
        }
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
