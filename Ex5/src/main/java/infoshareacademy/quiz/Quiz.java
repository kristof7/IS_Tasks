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

        questions = new LinkedHashMap<>();
        questions.put(1, Questions.question1());
        questions.put(2, Questions.question2());
        questions.put(3, Questions.question3());
        questions.put(4, Questions.question4());
        questions.put(5, Questions.question5());
        questions.put(6, Questions.question6());
        questions.put(7, Questions.question7());
        questions.put(8, Questions.question8());
        questions.put(9, Questions.question9());
        questions.put(10, Questions.question10());
        questions.put(11, Questions.question11());
        questions.put(12, Questions.question12());
        questions.put(13, Questions.question13());

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


        List<String> selectedAnswers = new ArrayList<>();
        boolean tak = false;
        do {
            System.out.println("Wpisz odpowiedź a, b, c or d (może być jedna lub kilka poprawnych odpowiedzi):");
            String selectAnswer = scanner.nextLine();
            selectedAnswers.add(selectAnswer);
            System.out.println("wybrane odpowiedzi: " + selectedAnswers.toString());
            System.out.println("wybrać kolejną odpowiedź? (t/n) albo wyczyść odpowiedzi (c)");
            String isYes = scanner.nextLine();
            if (isYes.equalsIgnoreCase("t")) {
                tak = true;
            } else if (isYes.equalsIgnoreCase("c")) {
                tak = true;
                selectedAnswers.clear();
            } else tak = false;
        } while (tak);
        Collections.sort(selectedAnswers);
        System.out.println("wybrane odpowiedzi: " + selectedAnswers.toString());

        if (selectedAnswers.equals(questions.get(numbersForRandomQuestions.get(number)).getTrueAnswer())) {
            correctAnswers++;
            System.out.println("Dobra odpowiedź!");
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
        } else {
            wrongAnswers++;
            System.out.println("Niestety, to jest zła odpowiedź");
            System.out.println("poprawna odpowiedź: " + questions.get(numbersForRandomQuestions.get(number)).getTrueAnswer());
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
            System.out.println("Błędne odpowiedzi: " + wrongAnswers);
        }
        System.out.println("---------------------------------------------------------------------");
    }
}
