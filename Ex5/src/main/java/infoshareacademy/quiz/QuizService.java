package infoshareacademy.quiz;

import infoshareacademy.userInputDownloader.UserInput;

public class QuizService {

    public static void playAgain() {
        System.out.println("Do you want try again? Yes/No");
        String choice = UserInput.uploadString();
        while (true) {
            if (choice.equalsIgnoreCase("yes")) {
                Quiz quiz = new Quiz();
                quiz.play();
            }
            if (choice.equalsIgnoreCase("No")) {
                System.out.println("Thanks for your game !");

                return;
            }
            System.out.println("please enter yes/no");
            choice = UserInput.uploadString();
        }
    }
}
