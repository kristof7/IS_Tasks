package com.isa.bookcase.repository;

import com.isa.bookcase.domain.Book;
import com.isa.bookcase.domain.Category;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Stateless
public class Books implements BooksRepository {

    private List<Book> books;

    public Books() {
        this.books = importBooks();
    }

    public List<Book> getBooks() {
        return books;
    }

    private static List<Book> importBooks() {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Hanya Yanagihara", "Male zycie", Category.LITERATURA_PIEKNA, 816, false));
        books.add(new Book("Maja Lunde", "Historia Pszczol", Category.LITERATURA_PIEKNA, 514, false));
        books.add(new Book("Leonie Swann", "Kroczac w ciemnosci", Category.LITERATURA_PIEKNA, 424, false));
        books.add(new Book("George R.R. Martin", "Gra o tron", Category.FANTASTYKA_SCIENCE_FICTION, 999, false));
        books.add(new Book("J. R. R. Tolkien", "Hobbit", Category.FANTASTYKA_SCIENCE_FICTION, 315, false));
        books.add(new Book("Simon Beckett", "Chemia smierci", Category.KRYMINAL_SENSACJA_THRILLER, 352, false));
        books.add(new Book("Marc Elsberg", "Blackout", Category.KRYMINAL_SENSACJA_THRILLER, 784, false));
        books.add(new Book("Jozef Ignacy Kraszewski", "Stara basn", Category.HISTORYCZNA, 304, false));
        books.add(new Book("J. K. Rowling", "Harry Potter i Kamien Filozoficzny", Category.FANTASTYKA_SCIENCE_FICTION, 328, true));
        books.add(new Book("Antoine de Saint-Exupery", "Maly Ksiaze", Category.LITERATURA_PIEKNA, 112, true));
        books.add(new Book("Jojo Moyes", "Zanim się pojawiłeś", Category.OBYCZAJOWA_ROMANS, 382, false));
        books.add(new Book("Elizabeth Gilbert", "Jedz, modl sie, kochaj", Category.PUBLICYSTYKA_BIOGRAFIA, 490, false));

        return books;
    }

    @Override
    public List<Book> findAll() {
        return importBooks();
    }

    @Override
    public List<Book> writeRandomBook() {
       Collections.shuffle(books);
        return getBooks();

    }

    @Override
    public Optional<Book> findBookForAuthor(String author) {
        return findAll().stream()
                .filter(book -> book.getAuthor().equals(author)).findAny();
    }
}
