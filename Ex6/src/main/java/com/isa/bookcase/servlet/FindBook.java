package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.service.FindBookService;
import htmlHelpers.HtmlPreparer;

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
    FindBookService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author = req.getParameter("author");
        String tittle = req.getParameter("tittle");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        if (requestHasNoParameters(tittle, author)) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        if (author != null && tittle != null) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        if (author != null && !author.isEmpty()) {
            searchByAuthor(resp, author);
        } else if (tittle != null && !tittle.isEmpty()) {
            searchByTittle(resp, tittle);
        }
        out.println("</table>");
        req.getRequestDispatcher("back-to-main.jsp").include(req, resp);
        out.println("</body>");
        out.println("</html>");
    }

    private boolean requestHasNoParameters(String tittle, String author) {
        return ((author == null || author.isEmpty()) && (tittle == null || tittle.isEmpty()));
    }

    private void searchByAuthor(HttpServletResponse resp, String author) throws IOException {
        List<Book> authorParameterBooks = service.findBookByAuthor(author);
        if (authorParameterBooks == null || authorParameterBooks.size() == 0) {
            resp.getWriter().println("There is no this author's book with " + author);
            return;
        }
        showSearchingBooks(resp, author);
    }

    private void searchByTittle(HttpServletResponse resp, String title) throws IOException {
        List<Book> tittleParameterBooks = service.findBookByTittle(title);
        if (tittleParameterBooks == null || tittleParameterBooks.size() == 0) {
            resp.getWriter().println("There is no book with title:" + title);
            return;
        }
        showAllBooksForTittle(resp, title);
    }

    private void showSearchingBooks(HttpServletResponse resp, String author) {
        service.findBookByAuthor(author).forEach(book -> printBooksInformation(resp, book));
    }

    private void showAllBooksForTittle(HttpServletResponse resp, String tittle) {
        service.findBookByTittle(tittle).forEach(book -> printBooksInformation(resp, book));
    }

    private void printBooksInformation(HttpServletResponse resp, Book book) {
        try {
            PrintWriter out = resp.getWriter();
            HtmlPreparer.tableHeaderRaw(out, "category", "author", "title", "pages");
            HtmlPreparer.tableOtherRaw(out, book.getCategory().toString(), book.getAuthor(), book.getTitle(), String.valueOf(book.getPages()));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
