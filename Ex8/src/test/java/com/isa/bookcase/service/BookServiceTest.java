package com.isa.bookcase.service;

import com.isa.bookcase.entity.Book;
import com.isa.bookcase.entity.Category;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import static com.isa.bookcase.entity.Category.*;
import static org.assertj.core.api.Assertions.assertThat;

//import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BookServiceTest {

    private static final Logger logger = Logger.getLogger(PointTest.class.getName());
    List<Book> inputList;

    @BeforeEach
    public void beforeEach() {
        logger.info("This is @BeforeEach method");
        inputList = new LinkedList<Book>();
//            public Book(String author, String title, Category category, int pages, boolean forKids) {
//            this.author = author;
//            this.title = title;
//            this.category = category;
//            this.pages = pages;
//            this.forKids = forKids;
        inputList.add(new Book("Steve McConnell", "Code Complete", ACTION, 128, false));
        inputList.add(new Book("Cay S. Horstmann", "Core Java Volume I – Fundamentals", SCI_FI, 154, true));
        inputList.add(new Book("Joshua Bloch", "Effective Java", CLASSIC, 230, false));
        inputList.add(new Book("Herbert Schildt", "Java: A Beginner’s Guide", STORY, 76, true));
        inputList.add(new Book("Herbert Schildt", "Java - The Complete Reference", THRILLER, 210, false));
        inputList.add(new Book("Kathy Sierra & Bert Bates", "Head First Java", HORROR, 189, false));
        inputList.add(new Book("Brian Goetz", "Java Concurrency in Practice", DRAMA, 348, false));
        inputList.add(new Book("Lasse Koskela", "Test-Driven: TDD and Acceptance TDD for Java Developers", CRIME, 195, false));
        inputList.add(new Book("Brett D. McLaughlin", "Head First Object-Oriented Analysis Design", BIOGRAPHY, 78, true));
        inputList.add(new Book("Scott Oaks", "Java Performance: The Definite Guide", COMIC, 143, true));
        inputList.add(new Book("Robert Cecil Martin", "Clean Code – A Handbook of Agile Software Craftsmanship", HISTORICAL, 190, false));
    }

    @AfterEach
    public void afterEach() {
        logger.info("This is @AfterEach method");
        inputList = null;
    }

    @BeforeAll
    public static void beforeAll() {
        logger.info("This is @BeforeEach method");
    }

    @AfterAll
    public static void afterAll() {
        logger.info("This is @AfterAll method");
    }

    @Test
    @DisplayName("Checks sorting")
    public void testIfLongestBooksSortedDescending() {

        ByNumberOfPages() {
            // given
            List<Book> =new ArrayList<>();
            // when

            // then
        }
    }

    @Test
    @DisplayName("Checks if author from the list of books starts with given prefix")
    testIfBookAuthorStartsWithGivenPrefix() {
        // given
        Book book = new Book("Konopnicka", "Dym", Category.FANTASY, 3, true);

        // when
        // then
        assertThat(book.getAuthor()).isNotNull
                .startsWith("Ko");
    }


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


}