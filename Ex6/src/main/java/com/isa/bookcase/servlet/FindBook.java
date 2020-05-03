package com.isa.bookcase.servlet;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;
import com.isa.bookcase.service.BookService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

@WebServlet("/find-book")
public class FindBook extends HttpServlet {
    /*
   1. Zaimplementuj wyszukiwanie książki po zadanym w
   request parametrze author,
   2. Jeśli parametr author nie został podany w request,
   zwróć status BAD_REQUEST (wykorzystaj klasę HttpServletResponse),
   3. Jeśli jako wartość parametru została podana np.
   tylko litera "A", powinny się wyświetlić wszystkie
   książki z imieniem lub nazwiskiem autora rozpoczynającym się
   na literę "A"
   4. Zaimplementuj wyszukiwanie książki po zadanym w request
   parametrze title,
   5. W przypadku parametru title wyszukiwanie powinno działać w ten sam sposób jak dla parametru author (można podać dowolny ciąg znaków).
     */
    @Inject
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        //zapisanie requestu w lokalnych zmiennych
        String author = req.getParameter("author");
        String title = req.getParameter("title");

        //odpowiedz do author:
        if (author == null || author.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            writer.println(bookService.findByAuthor(author));
        }

        //odpowiedz do title:
        if (title == null || title.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {

            writer.println(bookService.findByTitle(title));
        }
    }
}
