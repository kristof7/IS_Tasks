package com.infoshareacademy;

import Zadanie1.ZadanieC.Card;
import Zadanie1.ZadanieC.Ranks;
import Zadanie1.ZadanieC.Suits;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//--------------ZADANIE C---VERSION2-SCANNER----------------------


        Scanner scanner = new Scanner(System.in);
        //----This class shows the combination of a rank with a suit by entering the corresponding numbers
        System.out.println("This application displays the combination of a rank with a suit by entering the corresponding numbers.");
        System.out.println("You will be asked to input two numbers, first is for rank, second for suit.");
        System.out.println("Choose Card's rank (1-ACE , 2-KING, 3-QUEEN, 4-JACK):");
        //----Here user input rank value in number----
        int rank = scanner.nextInt();
        System.out.println("Choose Card's suit (1-CLUBS , 2-DIAMONDS, 3-HEARTS, 4-SPADES):");
        //----Here user input suit value in number----
        int suit = scanner.nextInt();

        Ranks[] ranks = Ranks.values();
        Suits[] suits = Suits.values();

        //----rank & suit are reduced by one to start counting from 1, not 0----
        rank = rank - 1;
        suit = suit - 1;

        System.out.println("The choosen card is: " + ranks[rank] + " of " + suits[suit]);


    }
}

