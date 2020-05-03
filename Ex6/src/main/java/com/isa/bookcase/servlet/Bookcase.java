package com.isa.bookcase.servlet;
//Wszystkie książki

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.repository.Books;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/books")
public class Bookcase extends HttpServlet {
  Books books = new Books();
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter printWriter = resp.getWriter();
    String childFriendly;
    for (Book book: books.getBooks()) {
        if (book.isForKids()){
          childFriendly = " Ta ksiazka jest dla dzieci";
        }
        else {
          childFriendly = " Ta ksiazka <b>nie</b> jest dla dzieci";
        }
      printWriter.println(book.toString() + childFriendly);
    }
  }
}
