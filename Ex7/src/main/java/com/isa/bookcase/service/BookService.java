package com.isa.bookcase.service;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;
import com.isa.bookcase.repository.Books;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookService {

    private final List<Book> books = new Books().getBooks();


    public List<Book> booksForKids() {
        return books.stream().filter(book -> book.isForKids())
                .collect(Collectors.toList());
    }

    public List<Book> booksAuthorStartsWithChar() {
        return  books.stream().filter(book ->  book.getAuthor().startsWith("J"))
            .collect(Collectors.toList());

        }
    public List<Book> booksTitleWithFragment() {
        return  books.
                stream().filter(book ->  book.getTitle().contains("ci"))
                .collect(Collectors.toList());

    }
     public Integer sumOfPages() {
            return books.stream()
            .map(book ->book.getPages())
                    .reduce(0, Integer::sum);


    }
    public  List<Book> threeShortestBooks(){
       return books.stream()
                .sorted(Comparator.comparing(Book::getPages))
               .limit(3)
                .collect(Collectors.toList());}

   public List<String> titlesOfThreeLongestBooks(){
      return   books.stream()
              .sorted(Comparator.comparingInt(Book::getPages).reversed())
              .limit(3)
              .map(Book::getTitle)
              .collect(Collectors.toList());
    }
   public String bookWithLongestTitle(){
    return books.stream(). max(Comparator.comparingInt(a ->
               a.getTitle().length()))
               .map(Book::getTitle)
               .orElse(""); //defaulting to 0
    }
         public List<Book> booksSortedByPagesAsc(){
          return  books.stream().sorted(Comparator.comparing(Book::getPages))
          .collect(Collectors.toList());
}
        public Map<Category, List<Book>> booksByCategory(){
        return books.stream().collect(Collectors.groupingBy(Book::getCategory));

}

  public   Map<Category, Optional<Book>> longestBookInEachCategory(){
      Comparator<Book> pagesComparator = (u1, u2) -> u1.getPages() - u2.getPages();
      return books.stream().map(book->book.getCategory()).distinct().collect(Collectors.toMap(category -> category ,category->books.stream()
              .filter(book->book.getCategory()==category).max(pagesComparator)));
  }


}














