package Zadanie1.ZadanieA;

import java.util.Scanner;

public class ExerciseA {

    public void gameA() {
        //--------------ZADANIE A--------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word.., program will display first letter of the world:");
        String charWord = scanner.nextLine();
        System.out.println(charWord + " - " + ExerciseA.stringToChar(charWord));
        //--------------------------------------------------
    }

    public static char stringToChar(String word) {
        char actualValue = word.charAt(0);
        return actualValue;
    }
}
