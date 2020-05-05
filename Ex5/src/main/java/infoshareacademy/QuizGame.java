package infoshareacademy;

import category.CategoryName;
import printer.Printer;
import questions.Question;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class QuizGame extends Printer {

    Scanner scanner = new Scanner(System.in);

    void start() throws InterruptedException {
        addQuestionsToList();
        printWelcomeMessage();
        printCategories();
        getQuestionsFromCategory(pickCategory());
        loopQuestions();
        printScore();
        info();
    }

    private void loopQuestions() {
        for (int i = 0; i < 4; i++) {
            checkAnswer(printRandomQuestion(), askForAnswer());
        }
    }

    protected void checkAnswer(Question question, String answer) {
        char[] correctAnswerChar = question.getCorrectAnswer().toCharArray();
        Arrays.sort(correctAnswerChar);
        char[] answerChar = answer.toCharArray();
        Arrays.sort(answerChar);
        if (Arrays.equals(correctAnswerChar, answerChar)) {
            out.println("Gratulacje, poprawna odpowiedź!");
            out.println(LINE);
            points++;
        } else {
            out.println("Błędna odpowiedź.");
            out.println("Poprawna odpowiedź to: " + question.getCorrectAnswer());
            out.println(LINE);
        }
    }

    protected String askForAnswer() {
        return scanner.nextLine().toLowerCase().trim();
    }

    private CategoryName pickCategory() {
        CategoryName category = null;
        boolean isFinished = false;
        while (!isFinished) {
            switch (askForAnswer()) {
                case "1":
                    out.println(CATEGORY + CategoryName.PROGRAMOWANIE.toString());
                    out.println(LINE);
                    category = CategoryName.PROGRAMOWANIE;
                    isFinished = true;
                    break;
                case "2":
                    out.println(CATEGORY + CategoryName.EKONOMIA.toString());
                    out.println(LINE);
                    category = CategoryName.EKONOMIA;
                    isFinished = true;
                    break;
                case "3":
                    out.println(CATEGORY + CategoryName.WIEDZA_OGÓLNA.toString());
                    out.println(LINE);
                    category = CategoryName.WIEDZA_OGÓLNA;
                    isFinished = true;
                    break;
                default:
                    out.println("Błędny wybór. Spróbuj ponownie.");
                    break;
            }
        }
        return category;
    }
}
