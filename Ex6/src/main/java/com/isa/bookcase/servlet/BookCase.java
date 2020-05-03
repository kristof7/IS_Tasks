package com.isa.bookcase.servlet;


import com.isa.bookcase.service.BooksService;
import htmlHelpers.HtmlPreparer;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/books")
public class BookCase extends HttpServlet {

    @Inject
    BooksService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HtmlPreparer.tableHeaderRaw(out, "category", "author", "title", "pages");
        showAllBooks(resp);
        out.println("</table>");
        req.getRequestDispatcher("back-to-main.jsp").include(req, resp);
        out.println("</body>");
        out.println("</html>");
        resp.setStatus(HttpServletResponse.SC_ACCEPTED);
    }

    private void showAllBooks(HttpServletResponse resp) {
        service.showAllBooks().forEach(book -> {
            try {
                PrintWriter out = resp.getWriter();
                HtmlPreparer.tableOtherRaw(out, book.getCategory().toString(), book.getAuthor(), book.getTitle(), String.valueOf(book.getPages()));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }
}
