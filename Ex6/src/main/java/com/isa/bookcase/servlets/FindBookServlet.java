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
import java.util.Optional;

@WebServlet("/find-book")
public class FindBookServlet extends HttpServlet {

    @Inject
    BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Optional<List<Book>> filteredBooks;
        String authorSearchPhrase = req.getParameter("author");
        String titleSearchPhrase = req.getParameter("title");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();

        if ( authorSearchPhrase == null || authorSearchPhrase.isEmpty() ) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        printWriter.println("<html>");
        printWriter.println("<body>");


        if ( authorSearchPhrase.matches(".*\\d.*") ){
            printWriter.println("Author cannot contain digits");
            printWriter.println("</body>");
            printWriter.println("</html>");
            return;
        }

        if ( titleSearchPhrase == null || titleSearchPhrase.isEmpty() ){
            filteredBooks = bookService.findByAuthor(authorSearchPhrase);
        } else {
            filteredBooks = bookService.findByAuthorAndTitle(authorSearchPhrase, titleSearchPhrase);
        }

        if ( filteredBooks.isEmpty() ){
            printWriter.println("Book has not been found");
            printWriter.println("</body>");
            printWriter.println("</html>");
            return;
        }
        for ( Book filteredBook : filteredBooks.get() ) {
            bookService.printBookDetails(printWriter, filteredBook);
        }

        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
