package com.infoshareacademy;
import static com.infoshareacademy.Zadanie_1.Zadanie_A.FirstLetter.printFirstLetter;
import static com.infoshareacademy.Zadanie_1.Zadanie_B.Calculator.calculateData;
import static com.infoshareacademy.Zadanie_1.Zadanie_C.CardService.addNewCard;


public class App {
    public static void main( String[] args ) {
        System.out.println("JJDZ8 - homeworks!");

//        uncomment to test "Zadanie A"

        System.out.println("\nZadanie A:");
        printFirstLetter();

//        uncmoment to test "Zadanie B"

        System.out.println("\nZadanie B:");
        calculateData();

//        uncomment to test "Zadanie C"

        System.out.println("\nZadanie C:");
        addNewCard();
    }
}
