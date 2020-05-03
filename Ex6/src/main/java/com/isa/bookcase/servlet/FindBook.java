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


@WebServlet("find-book")
public class FindBook extends HttpServlet {

  @Inject
  private BookService bookService;
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter printWriter = resp.getWriter();

    if (req.getParameter("author") == null || req.getParameter("author").isEmpty()) {
      resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
      return;
    }
    String authorName = req.getParameter("author");
    String bookTitle = req.getParameter("title");
    printWriter.println("Znalezione ksiazki: \n");
    for (Book book : bookService.getBooks()) {
      boolean authorFlag = false;
      boolean titleFlag = false;
      authorFlag = isIncludedInRepository(authorName,book.getAuthor());
      if (bookTitle != null && !(bookTitle.isEmpty())) {
      titleFlag = isIncludedInRepository(bookTitle, book.getTitle());
      } else titleFlag = true;
     if (authorFlag && titleFlag) printBookInformation(book, printWriter);
    }
  }
  public boolean findByIncompleteName(String nameFromUser, String nameFromRepository) {
    return nameFromUser.equalsIgnoreCase(nameFromRepository.substring(0, nameFromUser.length()));
  }
  public void printBookInformation(Book book, PrintWriter pw){
    pw.println(book.toString());
  }

  public boolean isIncludedInRepository(String nameFromUser, String nameFromRepository){
    boolean result = false;
    if (nameFromUser.equalsIgnoreCase(nameFromRepository)) result = true;
    else {
      String[] nameFromRepositoryArray = nameFromRepository.split("\\s");
      for (String s : nameFromRepositoryArray) {
        if (nameFromUser.length() > s.length()) continue;
        else if (findByIncompleteName(nameFromUser, s)) result = true;
      }
    }
    return result;
  }
}
