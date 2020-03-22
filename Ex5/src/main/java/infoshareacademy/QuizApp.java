package infoshareacademy;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner inputAsInt = new Scanner(System.in);
        Scanner inputAsString = new Scanner(System.in);

        String yourChoiceOfAnswer;
        int sumOfPoints = 0;
        int yourChoiceOfCategory = 0;
        boolean quizToRepeat = false;



        System.out.println("--------------------------------------------------------");
        System.out.println("WELCOME TO OUR QUIZ!");
        System.out.println("--------------------------------------------------------");
        System.out.println("The rules of the quiz are simple:\nYou get 3 questions from your favourite category," +
                " but be careful... if all your answers will be wrong you have to repeat this quiz!\nAre you ready?" +
                " Let's start the game!");

        Quiz quiz = new Quiz();

        while (!quizToRepeat) {
            System.out.println("Choose a category of the quiz:\n\nPress 1, if you " +
                    "want SPORT QUIZ,\nPress 2, if you want CAPITAL_CITY QUIZ, \nPress 3, if you want HISTORY QUIZ.\n");

            try {

                yourChoiceOfCategory = inputAsInt.nextInt();
                switch (yourChoiceOfCategory) {
                    case 1:
                        System.out.println("You have chosen... " + (Category.SPORT) + ".\n");
                        break;
                    case 2:
                        System.out.println("You have chosen... " + (Category.CAPITAL_CITY) + ".\n");
                        break;
                    case 3:
                        System.out.println("You have chosen... " + (Category.HISTORY) + ".\n");
                        break;
                    default:
                        System.out.println("You haven't chosen correct number, so you will have random category of " +
                                "questions.\n");
                }

            } catch (Exception e) {
                System.out.println("You haven't chosen correct number! You will have random category of questions.\n");
            }

            for (int i = 1; i < 4; i++) {

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                if (yourChoiceOfCategory == 1) {
                    quiz.addSportQuestionsToList();
                    quiz.getRandomSportQuestions();
                } else if (yourChoiceOfCategory == 2) {
                    quiz.addCapitalCityQuestions();
                    quiz.getRandomCapitalCityQuestions();
                } else if (yourChoiceOfCategory == 3) {
                    quiz.addHistoryQuestion();
                    quiz.getRandomHistoryQuestions();
                } else {
                    quiz.putAllQuestionsIntoMap();
                    quiz.getRandomQuestionsFromListOfMapValues();
                }

                System.out.println("Choose your answer: a, b or c ???");
                yourChoiceOfAnswer = inputAsString.nextLine();

                if (yourChoiceOfAnswer.toLowerCase().matches("a")) {
                    System.out.println("That's correct!");
                } else {
                    System.out.println("That's wrong answer");
                    System.out.println("The correct answer is...");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    System.out.println("A\n");
                }

                if (yourChoiceOfAnswer.toLowerCase().matches("a")) {
                    int countOfQuestions = 0;
                    countOfQuestions++;
                    sumOfPoints += countOfQuestions;
                }

            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            if (sumOfPoints == 3) {
                System.out.println("Congratulation!!! You have scored: " + sumOfPoints + " point(s) and answered all " +
                        "questions correctly! Thank you for attending the quiz!");
                quizToRepeat = true;
            } else if (sumOfPoints == 2 || sumOfPoints == 1) {
                System.out.println("You have scored: " + sumOfPoints + " point(s). Thank you for attending the quiz!");
                quizToRepeat = true;
            } else {
                System.out.println("You have scored: " + sumOfPoints + " point(s), you HAVE to try one more time!\n");
            }
        }
    }
}

