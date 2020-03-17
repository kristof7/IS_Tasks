package infoshareacademy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserInterface extends QuestionBank {

    private final static Scanner scanner = new Scanner(System.in);
    public static Integer score = 0;

    void start() {
        addQuestionsToBank();
        printWelcomeMessage();
        printCategories();
        getQuestionsKeysFromPickedCategory(pickCategory());
        loopFiveQuestions();
        printScore();
    }

    private void loopFiveQuestions() {
        for (int i = 0; i < 5; i++) {
            checkAnswer(printRandomQuestionFromPickedCategory(), askUserForAnswer());
        }
    }

    protected Question printRandomQuestionFromPickedCategory() {
        Question question = questionsBank.get(generateRandomIntegerFromKeyList());
        System.out.println(question.getQuestionText());
        System.out.println("A:      " + question.getAnswers()[0]);
        System.out.println("B:      " + question.getAnswers()[1]);
        System.out.println("C:      " + question.getAnswers()[2]);
        System.out.println("D:      " + question.getAnswers()[3]);
        System.out.println("E:      " + question.getAnswers()[4]);
        return question;
    }

    private void checkAnswer(Question question, String answer) {
        char[] correctAnswerChar = question.getCorrect().toCharArray();
        Arrays.sort(correctAnswerChar);
        char[] answerChar = answer.toCharArray();
        Arrays.sort(answerChar);
        if (Arrays.equals(correctAnswerChar, answerChar)) {
            System.out.println("Gratulacje, poprawna odpowiedź!");
            System.out.println("___________________________________________");
            score++;
        } else {
            System.out.println("Błędna odpowiedź.");
            System.out.println("Poprawna odpowiedź to: " + question.getCorrect());
            System.out.println("___________________________________________");
        }
    }

    private void printWelcomeMessage() {
        System.out.println("______________________________________________________________________________________________");
        System.out.println("Witaj w Quizie zawierającym kradzione pytania z Internetu!");
        System.out.println("");
        System.out.println("Quiz składa się z pięciu samolosujących się pytań ABCDE");
        System.out.println("Aby udzielić odpowiedzi na pytanie, wprowadź litery odpowiadające poprawnym odpowiedziom");
        System.out.println("");
        System.out.println("Zaczynamy!");
        waitFourSeconds();
    }

    private void printCategories() {
        System.out.println("______________________________________________________________________________________________");
        System.out.println("Na początek wybierz kategorię:");
        System.out.println("#1: Biologia/Chemia         #2: Geografia/Astronomia        #3: Historia/WOS        #4: Miszmasz");
    }

    private void waitFourSeconds() {
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String askUserForAnswer() {
        return scanner.nextLine().toLowerCase().trim();
    }

    private Categories pickCategory() {
        Categories category = null;
        boolean isFinished = false;
        while (!isFinished) {
            switch (askUserForAnswer()) {
                case "1": {
                    System.out.println("Wybrano kategorię: Biologia/Chemia");
                    System.out.println("______________________________________________________________________________________________");
                    category = Categories.BIOLOGIA_CHEMIA;
                    isFinished = true;
                    break;
                }
                case "2": {
                    System.out.println("Wybrano kategorię: Geografia/Astronomia");
                    System.out.println("______________________________________________________________________________________________");
                    category = Categories.GEOGRAFIA_ASTRONOMIA;
                    isFinished = true;
                    break;
                }
                case "3": {
                    System.out.println("Wybrano kategorię: Historia/WOS");
                    System.out.println("______________________________________________________________________________________________");
                    category = Categories.HISTORIA_WOS;
                    isFinished = true;
                    break;
                }
                case "4": {
                    System.out.println("Wybrano kategorię: Miszmasz");
                    System.out.println("______________________________________________________________________________________________");
                    category = Categories.MISZMASZ;
                    isFinished = true;
                    break;
                }
                default: {
                    System.out.println("Wybrano nieprawidłową opcję, spróbuj jeszcze raz:");
                    break;
                }
            }
        }
        return category;
    }

    private void printScore() {
        System.out.println("Twój wynik to : " + score + "pkt.");
    }
}
