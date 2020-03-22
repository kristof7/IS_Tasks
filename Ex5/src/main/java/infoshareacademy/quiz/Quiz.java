package infoshareacademy.quiz;

import java.util.*;

public class Quiz {

    private static Set<Integer> randomNumbers = new LinkedHashSet<>();
    private static List<Integer> numbersForRandomQuestions = new ArrayList<>();
    private static Map<Integer, Question> questionsJava = new LinkedHashMap<>();
    private static Map<Integer, Question> questionsSql = new LinkedHashMap<>();
    private static int correctAnswers = 0;
    private static int wrongAnswers = 0;
    private static int numberOfQuestions = 4;
    private static int numberOfGoodAnswersToPass = 3;

    public static void quizQuestions() throws Exception {

        questionsJava = new LinkedHashMap<>();
        questionsJava.put(1, Questions.question1());
        questionsJava.put(2, Questions.question2());
        questionsJava.put(3, Questions.question3());
        questionsJava.put(4, Questions.question4());
        questionsJava.put(5, Questions.question5());
        questionsJava.put(6, Questions.question6());
        questionsJava.put(7, Questions.question14());

        questionsSql = new LinkedHashMap<>();
        questionsSql.put(1, Questions.question7());
        questionsSql.put(2, Questions.question8());
        questionsSql.put(3, Questions.question9());
        questionsSql.put(4, Questions.question10());
        questionsSql.put(5, Questions.question11());
        questionsSql.put(6, Questions.question12());
        questionsSql.put(7, Questions.question13());

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Choose category, input JAVA or SQL:");
        String chooseCategory = scanner.nextLine();

        if (chooseCategory.equalsIgnoreCase("java")) {
            for (int i = 0; i < questionsJava.size(); i++) {
                do {
                    randomNumbers.add(random.nextInt(questionsJava.size()) + 1);
                } while (randomNumbers.size() < questionsJava.size());
            }
            numbersForRandomQuestions.addAll(randomNumbers);
            System.out.println("Choosen category: JAVA");
            for (int i = 0; i < numberOfQuestions; i++) {
                questionJava(i);
                System.out.println("Naciśnij enter by kontynuować..");
                String cont = scanner.nextLine();
            }

        } else if (chooseCategory.equalsIgnoreCase("sql")) {
            for (int i = 0; i < questionsSql.size(); i++) {
                do {
                    randomNumbers.add(random.nextInt(questionsSql.size()) + 1);
                } while (randomNumbers.size() < questionsSql.size());
            }
            numbersForRandomQuestions.addAll(randomNumbers);
            System.out.println("Choosen category: SQL");
            for (int j = 0; j < numberOfQuestions; j++) {
                questionSql(j);
                System.out.println("Naciśnij enter by kontynuować..");
                String cont = scanner.nextLine();
            }
        } else Quiz.quizQuestions();

        if (correctAnswers >= numberOfGoodAnswersToPass) {
            System.out.println("DOBRA ROBOTA, UDALO CI SIĘ ZDAC EGZAMIN!");
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
        } else {
            System.out.println("NIESTETY NIE ZDALES! :<");
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
            System.out.println("Błędne odpowiedzi: " + wrongAnswers);
        }
    }

    public static void questionJava(int number) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Pytanie nr: " + (number + 1) + " / " + numberOfQuestions);
        System.out.println("Kategoria: " + questionsJava.get(numbersForRandomQuestions.get(number)).getCategory());
        System.out.println(questionsJava.get(numbersForRandomQuestions.get(number)).toString());


        List<String> selectedAnswers = new ArrayList<>();
        boolean tak = false;
        do {
            System.out.println("Wpisz odpowiedź a, b, c or d (może być jedna lub kilka poprawnych odpowiedzi):");
            String selectAnswer = scanner.nextLine();
            selectedAnswers.add(selectAnswer);
            System.out.println("wybrane odpowiedzi: " + selectedAnswers.toString() + "\n (wybieraj tylko pojedyncze litery, nie wpisuj ciągu znaków)");
            System.out.println("Zatwierdź (wciśnij enter) / zaznacz kolejną odpowiedź (z) / wyczyść odpowiedzi (c)");
            String isYes = scanner.nextLine();
            if (isYes.equalsIgnoreCase("z")) {
                tak = true;
            } else if (isYes.equalsIgnoreCase("c")) {
                tak = true;
                selectedAnswers.clear();
            } else tak = false;
        } while (tak);
        Collections.sort(selectedAnswers);
        System.out.println("wybrane odpowiedzi: " + selectedAnswers.toString());

        if (selectedAnswers.equals(questionsJava.get(numbersForRandomQuestions.get(number)).getTrueAnswer())) {
            correctAnswers++;
            System.out.println("Dobra odpowiedź!");
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
        } else {
            wrongAnswers++;
            System.out.println("Niestety, to jest zła odpowiedź");
            System.out.println("poprawna odpowiedź: " + questionsJava.get(numbersForRandomQuestions.get(number)).getTrueAnswer());
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
            System.out.println("Błędne odpowiedzi: " + wrongAnswers);
        }
        System.out.println("---------------------------------------------------------------------");
    }

    public static void questionSql(int number) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Pytanie nr: " + (number + 1) + " / " + numberOfQuestions);
        System.out.println("Kategoria: " + questionsSql.get(numbersForRandomQuestions.get(number)).getCategory());
        System.out.println(questionsSql.get(numbersForRandomQuestions.get(number)).toString());

        List<String> selectedAnswers = new ArrayList<>();
        boolean tak = false;
        do {
            System.out.println("Wpisz odpowiedź a, b, c or d (może być jedna lub kilka poprawnych odpowiedzi):");
            String selectAnswer = scanner.nextLine();
            selectedAnswers.add(selectAnswer);
            System.out.println("wybrane odpowiedzi: " + selectedAnswers.toString() + "\n (wybieraj tylko pojedyncze litery, nie wpisuj ciągu znaków)");
            System.out.println("Zatwierdź (wciśnij enter) / zaznacz kolejną odpowiedź (z) / wyczyść odpowiedzi (c)");
            String isYes = scanner.nextLine();
            if (isYes.equalsIgnoreCase("z")) {
                tak = true;
            } else if (isYes.equalsIgnoreCase("c")) {
                tak = true;
                selectedAnswers.clear();
            } else tak = false;
        } while (tak);
        Collections.sort(selectedAnswers);
        System.out.println("wybrane odpowiedzi: " + selectedAnswers.toString());

        if (selectedAnswers.equals(questionsSql.get(numbersForRandomQuestions.get(number)).getTrueAnswer())) {
            correctAnswers++;
            System.out.println("Dobra odpowiedź!");
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
        } else {
            wrongAnswers++;
            System.out.println("Niestety, to jest zła odpowiedź");
            System.out.println("poprawna odpowiedź: " + questionsSql.get(numbersForRandomQuestions.get(number)).getTrueAnswer());
            System.out.println("Twoje poprawne odpowiedzi: " + correctAnswers + " / " + numberOfQuestions);
            System.out.println("Błędne odpowiedzi: " + wrongAnswers);
        }
        System.out.println("---------------------------------------------------------------------");
    }
}
