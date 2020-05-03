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
            resp.setContentType("text/html;charset=UTF-8");
            printWriter.println("author: " + book.getAuthor() + "<br>");
            printWriter.println("title: "  + book.getTitle() + "<br>");
            printWriter.println("category: " + book.getCategory().getCategoryDescription() + "<br>");
            printWriter.println("pages: " + book.getPages() + "<br>");
            printWriter.println("for kids: " + (book.isForKids()? "yes" : "no") + "<br>");
            printWriter.println("<br>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
    }
}
