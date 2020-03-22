package kasia74;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Matematyka {
    String quizQuestions, quizOptions, answer, enter;
    char ch;
    int i, correct=0;
    Quiz[] quiz=new Quiz[4];

    public void initialise() {

        for (int i = 0; i < 4; i++) {
            quiz[i] = new Quiz();

        }
    }


    public void quizQuestions() {
        try {
            quiz[0].quizQuestions = "Wieliki fizyk i matematyk Newton móglby się spotkać z :";
            quiz[1].quizQuestions = "Przekrój sześcianu i płaszczyzny nie może nigdy być:?";
            quiz[2].quizQuestions = "10!(dziesięć silnia)sekund to ?";
            quiz[3].quizQuestions = "Gdy baryłka jest w 30% pusta ,zawiera o 30 litrów więcej,niż gdy jest w 30% napełniona.Jaka jest pojemność baryłki\n";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
    }

    public void quizOptions() {
        try {
            quiz[0].quizOptions = "A:Juliszem Cezarem \nB:Karolem Wielkim\nC: Ludwikiem XIV\nD:Napoleonem Bonaparte ";
            quiz[1].quizOptions = "A:pieciokątem\nB:prostokątem,który nie jest kwadratem\nC:odcinkiem \nD: kołem";
            quiz[2].quizOptions = "A:24 godziny 30 minut i 20 sekund\nB:1 doba\nC:rok\nD: 6 tygodni";
            quiz[3].quizOptions = "A:60\nB:75 litrów:\nC:90 litrów \nD:120 litrów\n";

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
    }
    public void quizAnswers() {
        quiz[0].answer = "C";
        quiz[1].answer = "C";
        quiz[2].answer = "D";
        quiz[3].answer = "B";

    }

    public void play() {
        try {
            Scanner scan = new Scanner(System.in);
            String temp = "";
            Collections.shuffle(Arrays.asList(quiz));

            for (i = 0; i < 4; i++) {

                System.out.println("Pytanie " + (i + 1) + ": " + quiz[i].quizQuestions + "\nOptions:-\n" + quiz[i].quizOptions);

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
        System.out.println("Twoj wynik calkowity:- ");
        System.out.println("Odpowiedziales na 4 pytania " + correct + " prawidlowo i na " + (4 - correct) + " nieprawdiłowo");

    }
}







