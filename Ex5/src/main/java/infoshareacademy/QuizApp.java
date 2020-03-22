package infoshareacademy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.exit;

public class QuizApp {

    public static void main(String[] args) {
        try {
            int numberOfQuestionsToDraw = 3;
            int numberOfDrawnQuestions = 0;
            int numberOfRightAnswers = 0;
            Set<String> categoriesSet = new HashSet<>();
            categoriesSet.add(Category.biology.getCategoryDescription());
            categoriesSet.add(Category.film.getCategoryDescription());
            categoriesSet.add(Category.finance.getCategoryDescription());
            categoriesSet.add(Category.geography.getCategoryDescription());
            categoriesSet.add(Category.history.getCategoryDescription());
            System.out.println("Witaj w quizie. Pytania beda losowane sposrod nastepujacych kategorii:");
            for (String categoryName : categoriesSet) {
                System.out.println(categoryName);
            }
            System.out.println("");
            Thread.sleep(1000);
            Quiz quiz = new Quiz();
            if (quiz.questionsArray.size() < numberOfQuestionsToDraw) {
                System.out.println("BLAD: ZBYT MALO PYTAN BY PRZEPROWADZIC QUIZ");
                exit(0);
            }
            Scanner scanner = new Scanner(System.in);
            Question currentQuestion;
            for (int i = 1; i <= numberOfQuestionsToDraw; i++) {
                System.out.println("Pytanie " + i + ":");
                currentQuestion = quiz.drawQuestion();
                currentQuestion.printQuestion();
                numberOfDrawnQuestions++;
                if (currentQuestion.isCorrectAnswer(quiz.getAnswer(currentQuestion, scanner))) {
                    System.out.println("\nBrawo! To prawidlowa odpowiedz.\n");
                    numberOfRightAnswers++;
                } else {
                    System.out.println("Nie tym razem! Prawidlowa odpowiedz to " + currentQuestion.correctAnswer + ".\n");
                }
                quiz.questionsArray.remove(currentQuestion);
                Thread.sleep(1000);
            }
            System.out.println("Twoj wynik to: " + numberOfRightAnswers + " / " + numberOfDrawnQuestions);
            if(numberOfRightAnswers == numberOfDrawnQuestions) {
                System.out.println("Brawo! Wszystkie odpowiedzi byly poprawne!");
            }
        } catch (Exception InterruptedException) {
            InterruptedException.getMessage();
        }
    }
}