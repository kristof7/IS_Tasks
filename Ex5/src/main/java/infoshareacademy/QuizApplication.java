package infoshareacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizApplication {

    public static void appStart(ArrayList<Question> questions) {

        Integer userScore = 0;
        Collections.shuffle(questions);
        for (int i = 0; i < 3 ; i++) {
            String userAnswer = " ";
            System.out.println("");
            System.out.println(questions.get(i).getContent());
            for (String answer : questions.get(i).getAnswers()) {
                System.out.println(answer);
            }
            while (!userAnswer.equals("a") && !userAnswer.equals("b") && !userAnswer.equals("c")) {
                    System.out.println("Podaj odpowiedz (a, b lub c):");
                    Scanner scanner = new Scanner(System.in);
                    userAnswer = scanner.nextLine().toLowerCase();
            }
            if (userAnswer.equals(questions.get(i).getCorrectAnswer())) {
                    System.out.println("Podana odpowiedz jest prawidlowa :)");
                    userScore = userScore + 1;
            }
            else {
                    System.out.println("Podana odpowiedz jest nieprawidlowa :(, poprawna odpowiedz to: " + questions.get(i).getCorrectAnswer());
            }
        }
        System.out.println("");
        System.out.println("Quiz zakonczony, Twoj wynik to: " + userScore +"/3");
    }
}
