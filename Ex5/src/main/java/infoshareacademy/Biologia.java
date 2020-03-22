package kasia74;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Biologia {
    Quiz[] quiz=new Quiz[5];
    String quizQuestions, quizOptions, answer, enter;
    char ch;
    int i, correct=0;

    public void initialise() {

        for (i = 0; i < 5; i++) {
            quiz[i] = new Quiz();

        }
    }

    public void quizQuestions() {
        try {
            quiz[0].quizQuestions = "Dekarboksylacja ma miejsce";
            quiz[1].quizQuestions = "Nukleosom to?";
            quiz[2].quizQuestions = "Przedstawicielami orzęsków są?";
            quiz[3].quizQuestions = "Rośliny wytwarzajace nasiona pojawiły się najprawdopodobniej:?";
            quiz[4].quizQuestions = "Muszla mięczaków jest wytworem komórek?";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
    }

    public void quizOptions() {
        try {
            quiz[0].quizOptions = "A: tylko podczas glikolizy\nB: tylko w łańcuchu pokarmowym\nC: podczas przekształcania pirogronianu w czynny octan oraz w cyklu Krebsan\nD: w czasie glikolizy,cyklu Krebsa i w łancuchu oddechowym\n";
            quiz[1].quizOptions = "A: kompleks białek histonowych ,przez środek,ktorych przebiega DNA\nB: kompleks białek histonowych,na który nawinięty jest DNA\nC: kompleks białek niehistonowych ,przez środek,ktorych przebiega DNA\nD: kompleks białek niehistonowych ,na który nawinięty jest DNA";
            quiz[2].quizOptions = "A: euplotes,euglena,trąbik\nB: stylonychia,wirczyk,trąbik\nC: pantofelek,nocoświetlik,otwornice\nD: świdrowiec,bruzdnice,euglena\n";
            quiz[3].quizOptions = "A: w sylurze,nieco później niż psylofity\nB:w późnym dewonie,tj.okolo 360 mln lat temu \nC:w dolnym trasie ery mezofitycznej\nD:w srodkowej jurze\n";
            quiz[4].quizOptions = "A: nogi\nB:płaszcza \nC:głowy\nD: wszystkich wymienionych części ciała";

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
    }

    public void quizAnswers() {
        quiz[0].answer = "C";
        quiz[1].answer = "B";
        quiz[2].answer = "B";
        quiz[3].answer = "B";
        quiz[4].answer = "B";
    }

    public void play() {
        try {
            Scanner scan = new Scanner(System.in);
            String temp = "";
            Collections.shuffle(Arrays.asList(quiz));
            for (i = 0; i < 5; i++) {

                System.out.println("Pytanie " + (i + 1) + ": " + quiz[i].quizQuestions + "\nOpcje:-\n" + quiz[i].quizOptions);

                System.out.print("Twoja odpowiedz(A/B/C/D): ");
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
        System.out.println("Twoj calkowity wynik:- ");
        System.out.println("Odpowiedziales na 5 pytan z czego na" + correct + " prawdiłowo i na " + (5 - correct) + " nieprawdilowo!");

    }
}














