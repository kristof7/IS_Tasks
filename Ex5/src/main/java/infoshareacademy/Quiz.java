package kasia74;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public  class Quiz {
    String quizQuestions, quizOptions, answer, enter;
    char ch;
    int i, correct=0;
    Quiz[] quiz=new Quiz[7];

    public void initialise() {

        for (i = 0; i < 7; i++) {
            quiz[i] = new Quiz();

        }
    }

    public void quizQuestions() {
        try {
            quiz[0].quizQuestions = "Kto wynalazl Jave?";
            quiz[1].quizQuestions = "Jak nazywala się  Java na początku?";

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
    }

    public void quizOptions() {
        try {
            quiz[0].quizOptions = "A: Charles Babbage\nB: Lady Ada Lovelace\nC: Tim Berners-Lee\nD: James Gosling";
            quiz[1].quizOptions = "A: C++\nB: Groovey\nC: Oak\nD: HTML";

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
    }

    public void quizAnswers() {
        quiz[0].answer = "D";
        quiz[1].answer = "C";

            }

    public void play() {
        try {
            Scanner scan = new Scanner(System.in);
            String temp = "";
            Collections.shuffle(Arrays.asList(quiz));

            for (i = 0; i < 2; i++) {

                System.out.println("Pytanie " + (i + 1) + ": " + quiz[i].quizQuestions + "\nOpcje:-\n" + quiz[i].quizOptions);

                System.out.print("Twoja odpowiedz (A/B/C/D): ");
                temp = scan.next();
                ch = temp.charAt(0);
                temp = Character.toString(ch);
                System.out.println("\n\n");
                if (temp.equalsIgnoreCase(quiz[i].answer)) {
                    System.out.println("* * * Dobrze! * * *");
                    correct++;
                } else {
                    System.out.println("* * * Zle! * * *");
                }
                System.out.println("Odpowiedz: " + quiz[i].answer);
                System.out.println("\n\n");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        } catch (InputMismatchException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
    }

    public void result() {
        System.out.println("Twoj calkowity wynik- ");
        System.out.println("Opowiedziales na 20 pytan z czego na  " + correct + " dobrze i na  " + (20 - correct) + " zle!");

    }
}
