package com.isa.bookcase.service;

import com.isa.bookcase.dao.BookDao;
import com.isa.bookcase.entity.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.isa.bookcase.entity.Category.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    //    private static final Logger logger = Logger.getLogger(BookServiceTest.class.getName());
    List<Book> books;

    @Mock
    private BookDao bookDao;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void beforeEach() {
        books = List.of(
                new Book("Steve McConnell", "Code Complete", ACTION, 128, false),
                new Book("Cay S. Horstmann", "Core Java Volume I – Fundamentals", SCI_FI, 154, true),
                new Book("Joshua Bloch", "Effective Java", CLASSIC, 230, false),
                new Book("Herbert Schildt", "Java: A Beginner’s Guide", STORY, 76, true),
                new Book("Herbert Schildt", "Java - The Complete Reference", THRILLER, 210, false),
                new Book("Kathy Sierra & Bert Bates", "Head First Java", HORROR, 189, false),
                new Book("Brian Goetz", "Java Concurrency in Practice", DRAMA, 348, false),
                new Book("Lasse Koskela", "Test-Driven: TDD and Acceptance TDD for Java Developers", CRIME, 195, false),
                new Book("Brett D. McLaughlin", "Head First Object-Oriented Analysis Design", BIOGRAPHY, 78, true),
                new Book("Scott Oaks", "Java Performance: The Definite Guide", COMIC, 143, true),
                new Book("Robert Cecil Martin", "Clean Code – A Handbook of Agile Software Craftsmanship", HISTORICAL, 190, false));
    }

    @AfterEach
    public void afterEach() {
        books = null;
    }

//    List<Book> inputList;
//    Book book;

//    @BeforeEach
//    public void beforeEachLogger() {
//        logger.info("This is @BeforeEach method");

//    public void mockitoSetUp() {
//        bookDao = mock(BookDao.class);
//        bookService = new BookService(bookDao);
//    }
//
//    inputList=new LinkedList<Book>();
////            public Book(String author, String title, Category category, int pages, boolean forKids) {
////            this.author = author;
//            this.title = title;
//            this.category = category;
//            this.pages = pages;
////            this.forKids = forKids;
//        inputList.add(new
//


//    @AfterEach
//    public void afterEach() {
//        logger.info("This is @AfterEach method");
//    }
//
//    @BeforeAll
//    public static void beforeAll() {
//        logger.info("This is @BeforeEach method");
//    }
//
//    @AfterAll
//    public static void afterAll() {
//        logger.info("This is @AfterAll method");
//    }
///-------------------------------------------------------

//    @Test
//    @DisplayName("Check of what mock returns")
//    public void returnFromMock() {
//        List<Book> allBooksResult = bookService.findAllBooks();
//        System.out.println(allBooksResult);
//    }


//    @Test
//    @DisplayName("Checks sorting")
//    public void testIfLongestBooksSortedDescending() {
//
//        ByNumberOfPages() {
//            // given
//            List<Book> =new ArrayList<>();
//            // when
//
//            // then
//        }
//    }

//    @Test
//    @DisplayName("Checks if books from:'for kids' caegory filtered properly")
//    public void testIfBooksForKidsFiltered() {
//    }


    //        List<Book> booksResult = bookService.findBooksForKids();
//        System.out.println(booksResult);
    @Test
    @DisplayName("Checks if method findAllBooks successfully retrieves all books from the list")
    public void testIfAllBooksListed() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);
//        System.out.println(bookDao.findAllBooks());

        // when
        List<Book> result = bookService.findAllBooks();

        // then
        assertThat(result)
                .hasSize(11)
                .isEqualTo(books);
    }

    @Test
    @DisplayName("Checks if books from:'for kids' category filtered properly")
    void testIfFindBooksForKids() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);

        // when
        List<Book> result = bookService.findBooksForKids();
        System.out.println(result);

        // then
        assertThat(result)
                .hasSize(2)
                .isNotSameAs(books)
                .contains(books.get(1));
    }

    @Test
    @DisplayName("Checks if author's name with prefix retrieved")
    void testIfFindBooksAuthorStartsWith() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);

        // when
        List<Book> result = bookService.findBooksAuthorStartsWith("S");
//        System.out.println(result);

        // then
        assertThat(result)
                .hasSize(2)
                .isNotSameAs(books)
                .contains(books.get(0),books.get(9));
    }

    @Test
    @DisplayName("Checks if books' retrieved with titles that contain indicated fragment")
    void testIfFindBooksTitleContains() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);

        // when
        List<Book> result = bookService.findBooksTitleContains("Java");

        // then
        assertThat(result)
                .hasSize(8)
                .isNotSameAs(books)
                .contains(books.get(1),books.get(2), books.get(3),
                        books.get(4), books.get(5), books.get(7), books.get(2));
    }

    @Test
    void findLongestBooks() {
        // given
        when(bookDao.findAllBooks()).thenReturn(books);

        // when
        List<Book> result = bookService.findLongestBooks(220);

        // then
        assertThat(result)
                .isNotSameAs(books)
                .contains(books.get(2),books.get(6))
                .doesNotContain(new Book("Herbert Schildt", "Java: A Beginner’s Guide", STORY, 76, true));

    }

    @Test
    void bookWithLongestTitle() {
        // given

        // when

        // then

    }

    @Test
    void sortBooksByPagesAsc() {
        // given

        // when

        // then

    }

    @Test
    void groupBooksByCategory() {
        // given

        // when

        // then

    }
}
//
//    @Test
//    @DisplayName("Checks if author from the list of books starts with given prefix")
//    testIfBookAuthorStartsWithGivenPrefix() {
//        // given
//
//
//        // when
//        // then
//        assertThat(book.getAuthor()).isNotNull
//                .startsWith("Ko");
//    }


//    public class MapSorterTest {
//        private static final Logger logger = Logger.getLogger(MapSorterTest.class.getName());
//        LinkedHashMap<Integer, String> inputMap;
//
//        @BeforeEach
//        public void beforeEach() {
//            logger.info("This is @BeforeEach method");
//            inputMap = new LinkedHashMap<>();
//            inputMap.put(1, "Frodo");
//            inputMap.put(4, "Gandalf");
//            inputMap.put(3, "Legolas");
//            inputMap.put(7, "Boromir");
//            inputMap.put(2, "Gimli");
//            inputMap.put(6, "Alateja");
//            inputMap.put(5, "Peragrin");
//        }
//
//        @AfterEach
//        public void afterEach() {
//            inputMap = null;
//        }
//
//        @Test
//        @DisplayName("Checks if sorting by value works accordingly")
//        public void testIfSortsByValue() {
//            // given
//            LinkedHashMap<Integer, String> expectedSortedMapByValue = new LinkedHashMap<>();
//            expectedSortedMapByValue.put(6, "Alateja");
//            expectedSortedMapByValue.put(7, "Boromir");
//            expectedSortedMapByValue.put(1, "Frodo");
//            expectedSortedMapByValue.put(4, "Gandalf");
//            expectedSortedMapByValue.put(2, "Gimli");
//            expectedSortedMapByValue.put(3, "Legolas");
//            expectedSortedMapByValue.put(5, "Peragrin");
//            // when
//            Map<Integer, String> result = MapSorter.sortByValue(inputMap);
//
//            // then
//            assertThat(result).containsExactlyEntriesOf(expectedSortedMapByValue)
//                    .isEqualTo(expectedSortedMapByValue)
//                    .isNotSameAs(inputMap)
//                    .hasSameSizeAs(inputMap);
//        }
//
//        @Test
//        @DisplayName("Checks if sorting by key works accordingly")
//        public void testIfSortsByKey() {
//            // given
//            LinkedHashMap<Integer, String> expectedSortedMapByKey = new LinkedHashMap<>();
//            expectedSortedMapByKey.put(1, "Frodo");
//            expectedSortedMapByKey.put(2, "Gimli");
//            expectedSortedMapByKey.put(3, "Legolas");
//            expectedSortedMapByKey.put(4, "Gandalf");
//            expectedSortedMapByKey.put(5, "Peragrin");
//            expectedSortedMapByKey.put(6, "Alateja");
//            expectedSortedMapByKey.put(7, "Boromir");
//
//            // when
//            Map<Integer, String> result = MapSorter.sortByKey(inputMap);
//
//            // then
//            assertThat(result).containsExactlyEntriesOf(expectedSortedMapByKey)
//                    .isEqualTo(expectedSortedMapByKey)
//                    .isNotSameAs(inputMap)
//                    .hasSameSizeAs(inputMap);
//        }