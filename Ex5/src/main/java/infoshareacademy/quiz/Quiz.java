package infoshareacademy.quiz;

import java.util.*;

public class Quiz {

    private static Set<Integer> randomNumbers = new LinkedHashSet<>();
    private static List<Integer> numbersForRandomQuestions = new ArrayList<>();
    private static Map<Integer, Question> questions = new LinkedHashMap<>();
    private static int correctAnswers = 0;
    private static int wrongAnswers = 0;
    private static int numberOfQuestions = 4;
    private static int numberOfGoodAnswersToPass = 3;

    public static void quizQuestions() throws Exception {

        Question question1 = new Question();
        question1.setQuestionText("Wybierz poprawne stwierdzenie dotyczące Tablic w Javie:");
        question1.setAnswer1("a. Posiadają zawsze posortowane elementy.");
        question1.setAnswer2("b. Rozmiar tablicy jest stały.");
        question1.setAnswer3("c. Tablicę można poszerzyć za pomocą metody expand().");
        question1.setTrueAnswer("b");
        question1.setCategory(Category.JAVA);

        Question question2 = new Question();
        question2.setQuestionText("Jak wywołać metodę w klasie podrzędnej z klasy nadrzędnej?:");
        question2.setAnswer1("a. super.nameMethod()");
        question2.setAnswer2("b. self.nameMethod()");
        question2.setAnswer3("c. this.selfMethod()");
        question2.setTrueAnswer("a");
        question2.setCategory(Category.JAVA);

        Question question3 = new Question();
        question3.setQuestionText("Który z poniższych opisów pokrycia instrukcji kodu jest POPRAWNY?");
        question3.setAnswer1("a. Pokrycie instrukcji kodu to miara określająca liczbę wierszy kodu źródłowego\n" +
                "   (z wyłączeniem komentarzy), które zostały wykonane przez testy. ");
        question3.setAnswer2("b. Pokrycie instrukcji kodu to miara określająca odsetek wierszy kodu źródłowego, które\n" +
                "   zostały wykonane przez testy.");
        question3.setAnswer3("c. Pokrycie instrukcji kodu to miara określająca odsetek instrukcji wykonywalnych\n" +
                "   w kodzie źródłowym, które zostały wykonane przez testy. ");
        question3.setTrueAnswer("b");
        question3.setCategory(Category.ISTQB);

        Question question4 = new Question();
        question4.setQuestionText("Jak pobrać pojedynczy znak z obiektu String?");
        question4.setAnswer1("a. metodą getChar");
        question4.setAnswer2("b. metodą codePointAt");
        question4.setAnswer3("c. poprzez uzycie indexu np. str[5]");
        question4.setTrueAnswer("c");
        question4.setCategory(Category.JAVA);

        Question question5 = new Question();
        question5.setQuestionText("Jak można przerwać działanie pętli for ?");
        question5.setAnswer1("a. rzucając wyjątek");
        question5.setAnswer2("b. używając continue");
        question5.setAnswer3("c. używając goto");
        question5.setTrueAnswer("b");
        question5.setCategory(Category.JAVA);

        Question question6 = new Question();
        question6.setQuestionText("Jaka jest różnica pomiędzy Set a List?");
        question6.setAnswer1("a. Nie ma znaczącej różnicy, kwestia jaka jest implementacja");
        question6.setAnswer2("b. List zawiera elementy posortowane a Set ich nie sortuje");
        question6.setAnswer3("c. List może zawierać duplikaty, Set nie zawiera duplikatów");
        question6.setTrueAnswer("c");
        question6.setCategory(Category.JAVA);

        Question question7 = new Question();
        question7.setQuestionText("Jaki symbol oznacza wybranie danych z wszystkich kolumn tabeli?");
        question7.setAnswer1("a.  ?");
        question7.setAnswer2("b. *");
        question7.setAnswer3("c. ALL");
        question7.setTrueAnswer("b");
        question7.setCategory(Category.SQL);

        questions = new LinkedHashMap<>();
        questions.put(1, question1);
        questions.put(2, question2);
        questions.put(3, question3);
        questions.put(4, question4);
        questions.put(5, question5);
        questions.put(6, question6);
        questions.put(7, question7);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < questions.size(); i++) {
            do {
                randomNumbers.add(random.nextInt(questions.size()) + 1);
            } while (randomNumbers.size() < questions.size());
        }
        numbersForRandomQuestions.addAll(randomNumbers);


        for (int i = 0; i < numberOfQuestions; i++) {
            question(i);
            System.out.println("Naciśnij enter by kontynuować..");
            String cont = scanner.nextLine();
        }

        if (correctAnswers >= numberOfGoodAnswersToPass) {
            System.out.println("DOBRA ROBOTA, UDALO CI SIĘ ZDAC EGZAMIN!");
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
        } else {
            System.out.println("NIESTETY NIE ZDALES! :<");
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
            System.out.println("Błędne odpowiedzi: " + wrongAnswers);
        }
    }

    public static void question(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Pytanie nr: " + (number + 1));
        System.out.println("Kategoria: " + questions.get(numbersForRandomQuestions.get(number)).getCategory());
        System.out.println(questions.get(numbersForRandomQuestions.get(number)).toString());
        System.out.println("Wpisz odpowiedź a, b or c :");
        String selectAnswer = scanner.nextLine();

        if (selectAnswer.equals(questions.get(numbersForRandomQuestions.get(number)).getTrueAnswer())) {
            correctAnswers++;
            System.out.println("Dobra odpowiedź!");
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
        } else {
            wrongAnswers++;
            System.out.println("Niestety, to jest zła odpowiedź");
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
            System.out.println("Błędne odpowiedzi: " + wrongAnswers);
        }
    }
}
