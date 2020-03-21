package infoshareacademy.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questions {


    public static Question question1() {
        Question question1 = new Question();
        question1.setQuestionText("Wybierz poprawne stwierdzenie dotyczące Tablic w Javie:");
        question1.setAnswer1("a. Posiadają zawsze posortowane elementy.");
        question1.setAnswer2("b. Używają indeksów liczbowych do dostępu do poszczególnych elementów.");
        question1.setAnswer3("c. Rozmiar tablicy jest stały.");
        question1.setAnswer4("d. Tablicę można poszerzyć za pomocą metody expand().");
        List<String> question1Answers = new ArrayList<>();
        question1Answers.add("b");
        question1Answers.add("c");
        question1.setTrueAnswer(question1Answers);
        Collections.sort(question1Answers);
        question1.setCategory(Category.JAVA);
        return question1;
    }

    public static Question question2() {
        Question question2 = new Question();
        question2.setQuestionText("Jak wywołać metodę w klasie podrzędnej z klasy nadrzędnej?:");
        question2.setAnswer1("a. super.nameMethod()");
        question2.setAnswer2("b. self.nameMethod()");
        question2.setAnswer3("c. this.selfMethod()");
        question2.setAnswer3("d. name.nameMethod()");
        List<String> question2Answers = new ArrayList<>();
        question2Answers.add("a");
        question2.setTrueAnswer(question2Answers);
        Collections.sort(question2Answers);
        question2.setCategory(Category.JAVA);
        return question2;
    }

    public static Question question3() {
        Question question3 = new Question();
        question3.setQuestionText("Który z poniższych opisów pokrycia instrukcji kodu jest POPRAWNY?");
        question3.setAnswer1("a. Pokrycie instrukcji kodu to miara określająca liczbę wierszy kodu źródłowego\n" +
                "   (z wyłączeniem komentarzy), które zostały wykonane przez testy. ");
        question3.setAnswer2("b. Pokrycie instrukcji kodu to miara określająca odsetek wierszy kodu źródłowego, które\n" +
                "   zostały wykonane przez testy.");
        question3.setAnswer3("c. Pokrycie instrukcji kodu to miara określająca odsetek instrukcji wykonywalnych\n" +
                "   w kodzie źródłowym, które zostały wykonane przez testy. ");
        question3.setAnswer4("d. Żadna z powyższych odpowiedzi nie jet poprawna");
        List<String> question3Answers = new ArrayList<>();
        question3Answers.add("b");
        question3.setTrueAnswer(question3Answers);
        Collections.sort(question3Answers);
        question3.setCategory(Category.ISTQB);
        return question3;
    }

    public static Question question4() {
        Question question4 = new Question();
        question4.setQuestionText("Jak pobrać pojedynczy znak z obiektu String?");
        question4.setAnswer1("a. metodą getChar");
        question4.setAnswer2("b. metodą codePointAt");
        question4.setAnswer3("c. poprzez uzycie indexu np. str[5]");
        question4.setAnswer4("d. Żadna z powyższych odpowiedzi nie jet poprawna");
        List<String> question4Answers = new ArrayList<>();
        question4Answers.add("c");
        question4.setTrueAnswer(question4Answers);
        Collections.sort(question4Answers);
        question4.setCategory(Category.JAVA);
        return question4;
    }

    public static Question question5() {
        Question question5 = new Question();
        question5.setQuestionText("Jak można przerwać działanie pętli for ?");
        question5.setAnswer1("a. rzucając wyjątek");
        question5.setAnswer2("b. używając continue");
        question5.setAnswer3("c. używając goto");
        question5.setAnswer4("d. Żadna z powyższych odpowiedzi nie jet poprawna");
        List<String> question5Answers = new ArrayList<>();
        question5Answers.add("b");
        question5.setTrueAnswer(question5Answers);
        Collections.sort(question5Answers);
        question5.setCategory(Category.JAVA);
        return question5;
    }

    public static Question question6() {

        Question question6 = new Question();
        question6.setQuestionText("Jaka jest różnica pomiędzy Set a List?");
        question6.setAnswer1("a. Nie ma znaczącej różnicy, kwestia jaka jest implementacja");
        question6.setAnswer2("b. List zawiera elementy posortowane a Set ich nie sortuje");
        question6.setAnswer3("c. List może zawierać duplikaty, Set nie zawiera duplikatów");
        question6.setAnswer4("d. Żadna z powyższych odpowiedzi nie jet poprawna");
        List<String> question6Answers = new ArrayList<>();
        question6Answers.add("c");
        question6.setTrueAnswer(question6Answers);
        Collections.sort(question6Answers);
        question6.setCategory(Category.JAVA);
        return question6;
    }

    public static Question question7() {

        Question question7 = new Question();
        question7.setQuestionText("Jaki symbol oznacza wybranie danych z wszystkich kolumn tabeli?");
        question7.setAnswer1("a.  ?");
        question7.setAnswer2("b. *");
        question7.setAnswer3("c. ALL");
        question7.setAnswer4("d. Żadna z powyższych odpowiedzi nie jet poprawna");
        List<String> question7Answers = new ArrayList<>();
        question7Answers.add("b");
        question7.setTrueAnswer(question7Answers);
        Collections.sort(question7Answers);
        question7.setCategory(Category.SQL);
        return question7;
    }

    public static Question question8() {

        Question question8 = new Question();
        question8.setQuestionText("Akronim SQL pochodzi ze słów:");
        question8.setAnswer1("a.  Standard Query Language");
        question8.setAnswer2("b. Structured Query Language");
        question8.setAnswer3("c. Standard Query Library");
        question8.setAnswer4("d. Static Query Language");
        List<String> question8Answers = new ArrayList<>();
        question8Answers.add("b");
        question8.setTrueAnswer(question8Answers);
        Collections.sort(question8Answers);
        question8.setCategory(Category.SQL);
        return question8;
    }

    public static Question question9() {

        Question question9 = new Question();
        question9.setQuestionText("Wybierz poprawne stwierdzenia:");
        question9.setAnswer1("a. SQL jest językiem programowania wysokiego poziomu");
        question9.setAnswer2("b. SQL jest językiem zapytań służącym do komunikacji z bazą danych");
        question9.setAnswer3("c. SQL pozwala na tworzenie własnych funkcji i procedur operujących na tabelach w bazie danych");
        question9.setAnswer4("d. SQL pozwala zmieniać strukturę relacyjnych baz danych");
        List<String> question9Answers = new ArrayList<>();
        question9Answers.add("b");
        question9Answers.add("d");
        question9.setTrueAnswer(question9Answers);
        Collections.sort(question9Answers);
        question9.setCategory(Category.SQL);
        return question9;
    }

    public static Question question10() {
        Question question10 = new Question();
        question10.setQuestionText("W których systemach baz danych można korzystać z języka SQL?:");
        question10.setAnswer1("a. MySQL");
        question10.setAnswer2("b. PostgreSQL");
        question10.setAnswer3("c. Oracle");
        question10.setAnswer4("d. DB2");
        List<String> question10Answers = new ArrayList<>();
        question10Answers.add("a");
        question10Answers.add("b");
        question10Answers.add("c");
        question10Answers.add("d");
        question10.setTrueAnswer(question10Answers);
        Collections.sort(question10Answers);
        question10.setCategory(Category.SQL);
        return question10;
    }

    public static Question question11() {
        Question question11 = new Question();
        question11.setQuestionText("Które z poniższych słów nie są słowami kluczowymi języka SQL?:");
        question11.setAnswer1("a. LIKE");
        question11.setAnswer2("b. IF");
        question11.setAnswer3("c. FOR");
        question11.setAnswer4("d. AS");
        List<String> question11Answers = new ArrayList<>();
        question11Answers.add("b");
        question11Answers.add("c");
        question11.setTrueAnswer(question11Answers);
        Collections.sort(question11Answers);
        question11.setCategory(Category.SQL);
        return question11;
    }

    public static Question question12() {
        Question question12 = new Question();
        question12.setQuestionText("Argumentem funkcji MAX() może być kolumna, w której znajdują się dane typu:");
        question12.setAnswer1("a. Liczby naturalne");
        question12.setAnswer2("b. Ciągi znaków");
        question12.setAnswer3("c. Data");
        question12.setAnswer4("d. Czas");
        List<String> question12Answers = new ArrayList<>();
        question12Answers.add("a");
        question12Answers.add("b");
        question12Answers.add("c");
        question12Answers.add("d");
        question12.setTrueAnswer(question12Answers);
        Collections.sort(question12Answers);
        question12.setCategory(Category.SQL);
        return question12;
    }

    public static Question question13() {
        Question question13 = new Question();
        question13.setQuestionText("Które z wymienionych funkcji są zdefiniowane w języku SQL?");
        question13.setAnswer1("a. AVG()");
        question13.setAnswer2("b. MODE()");
        question13.setAnswer3("c. MEDIANA()");
        question13.setAnswer4("d. SUMA()");
        List<String> question13Answers = new ArrayList<>();
        question13Answers.add("a");
        question13.setTrueAnswer(question13Answers);
        Collections.sort(question13Answers);
        question13.setCategory(Category.SQL);
        return question13;
    }


}
