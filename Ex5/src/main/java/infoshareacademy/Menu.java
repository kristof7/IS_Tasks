package main.java.infoshareacademy;

import java.util.*;

public class Menu {
    private static int points = 0;
    private static int counter = 1;
    private static String csvFile;

    public static void quizAppStart() {
        chooseCategory();
        QuizCreator quizCreator = new QuizCreator();
        quizCreator.creatingQuestionsAndAnswers(csvFile);
    }

    private static void chooseCategory() {
        System.out.println("*********************************************************************");
        System.out.println("Wybierz kategorię: ");
        System.out.println("a. Java SE");
        System.out.println("b. Stolice");
        System.out.println("c. Piłka nożna");
        switch (inputChar()) {
            case 'a': {
                csvFile = "Java SE";
                break;
            }
            case 'b': {
                csvFile = "Stolice";
                break;
            }
            case 'c': {
                csvFile = "Pilka nozna";
                break;
            }
            default: {
                System.out.println("Nie ma takiej kategorii");
                chooseCategory();
                break;
            }
        }
    }

    private static char inputChar() {
        Scanner scanner = new Scanner(System.in);
        char input = '0';
        try {
            input = scanner.nextLine().toLowerCase().charAt(0);
        } catch(StringIndexOutOfBoundsException siobe) {
            System.out.println("Źle wpisałeś!");
        }
        return input;
    }

    public static void writeQuestion(Questions questions, int number) {
        System.out.println("*********************************************************************");
        System.out.println("Pytanie nr: " + counter++);
        System.out.println("Kategoria: " + csvFile);
        System.out.println("Treść pytania: " + questions.getQuestions().get(number).getQuestionText());
    }

    public static void writeAnswers(Map<Character, String> answerMap, int number) {
        System.out.println("Odpowiedzi:" );
        for(Map.Entry<Character, String> answer: answerMap.entrySet()){
            System.out.println(answer.getKey() + ". " + answer.getValue());
        }
    }

    public static void checkAnswer(Answers answers, Map<Character, String> answerMap, int number) {
        char choosedAnswer = inputChar();
        if (answerMap.get(choosedAnswer).equals(answers.getAnswers().get(number).getCorrectAnswer())) {
            System.out.println("Poprawna odpowiedź!");
            addPoint();
        } else {
            System.out.println("Zła odpowiedź. Poprawna to: ");
            System.out.println(answers.getAnswers().get(number).getCorrectAnswer());
        }
    }

    public static void addPoint() {
        points++;
    }

    public static void showPoints() {
        System.out.println("*********************************************************************");
        System.out.println("Twój wynik: " + points + "/3");
    }
}
