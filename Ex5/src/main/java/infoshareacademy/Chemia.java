package kasia74;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chemia {
    Quiz[] quiz=new Quiz[2];
    String quizQuestions, quizOptions, answer, enter;
    char ch;
    int i, correct=0;

    public void quizQuestions() {
        try {
            quiz[0].quizQuestions = "Wulkanizacja kauczuku polega na?";
            quiz[1].quizQuestions = "W odniesieniu do energii aktywacji prawdziwe jest stwierdzenie:";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
    }

    public void quizOptions() {
        try {
            quiz[0].quizOptions = "A: katalitycznym uwodornieniu kauczuku\nB:kondensacji kauczuku z formalina \nC:włączeniu siarki do układu cząstek stanowiących kauczuk \nD: chlorowaniu kauczuku w podwyższonej temperaturze";
            quiz[1].quizOptions = "A: jest na ogół jednakowa dla reakcj iw jednym kierunku i odwrotnej\nB:zmniejsza się w obecności kataliztora\nC:wzrasta ze zwiększeniem stężenia reagentów\nD:jest bardzo wysoka w przypadku reakcji przebiegającyh szybko";

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Occur!\n" + e.getMessage());
            System.exit(0);
        }
    }

    public void quizAnswers() {
        quiz[0].answer = "D";
        quiz[1].answer = "B";

    }

    public void initialise() {

        for (i = 0; i < 2; i++) {
            quiz[i] = new Quiz();

        }
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
        System.out.println("Twój całkowity wynik- ");
        System.out.println("Odpowiedziales na 2 pyania z czego dobrze na  " + correct + " pytan i  na " + (2 - correct) + " zle");

    }
}







