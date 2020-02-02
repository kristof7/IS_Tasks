import ExerciseB.Calculator;
import ExerciseC.Card;
import com.infoshareacademy.ExerciseA.ExerciseA;

import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
/*
------------------------------------------------------
      ZADANIE 1 - C
------------------------------------------------------
*/
        Card.getDescription();



/*

------------------------------------------------------
       ZADANIE 1 - B
------------------------------------------------------

        try {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();

            System.out.println("Podaj pierwszą liczbę/Enter first number: ");
            calculator.liczba1 = scanner.nextDouble();

            System.out.println("Podaj drugą liczbę/Enter second number: ");
            calculator.liczba2 = scanner.nextDouble();

            System.out.println("Jakie działanie chcesz wykonać/What action do you want to apply (+, -, *, /) ?");
            Scanner scanner1 = new Scanner(System.in);
            calculator.znak = scanner1.nextLine();

            double wynik = calculator.obliczenia(calculator.liczba1, calculator.liczba2, calculator.znak);
            System.out.println("Twoj wynik to/ Your score is : ");
            System.out.println(calculator.liczba1 + " " + calculator.znak + " " + calculator.liczba2 + " = " + wynik);
        }
        catch (Exception e) {
            System.out.println("Coś poszło nie tak ! Spróbuj jeszcze raz !");
        }
*/

/*
------------------------------------------------------
        ZADANIE 1 - A
------------------------------------------------------

        System.out.println("Zadanie 1 - A : ");

        ExerciseA zadanie1A = new ExerciseA();

        System.out.println("Podaj jakis wyraz : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char letter = zadanie1A.firstChar(input);

        System.out.println(input + " - " + letter);
 */

    }
}
