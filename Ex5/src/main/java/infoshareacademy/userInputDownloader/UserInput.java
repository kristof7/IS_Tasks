package infoshareacademy.userInputDownloader;

import java.util.Scanner;

public class UserInput {

    public static int uploadCorrectUserInput(int maxRange) {
        System.out.println("Please choose one");
        int userChoice = UserInput.upLoadInt();
        while (userChoice < 1 || userChoice > maxRange) {
            System.out.println("Incorrect choice. Try again with number between 1-" + maxRange);
            userChoice = UserInput.upLoadInt();
        }

        return userChoice;
    }

    private static int upLoadInt() {
        int userChoice = 0;
        boolean isCorrect = false;
        while (isCorrect == false) {
            try {
                Scanner scanner = new Scanner(System.in);
                userChoice = scanner.nextInt();
                isCorrect = true;
            } catch (Exception e) {
                System.out.println("Incorrect format. Please try again");
            }
        }

        return userChoice;
    }

    public static String uploadString() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
