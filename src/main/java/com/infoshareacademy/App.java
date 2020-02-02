package com.infoshareacademy;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        Card nowaKarta = new Card();

        System.out.println("Wybór figury: ");
        System.out.println("1. As");
        System.out.println("2. Król");
        System.out.println("3. Królowa");
        System.out.println("4. Walet");
        int figura = scanner.nextInt();

        switch (figura){
            case 1:
                nowaKarta.setRank(RANKS.ACE);
                break;
            case 2:
                nowaKarta.setRank(RANKS.KING);
                break;
            case 3:
                nowaKarta.setRank(RANKS.QUEEN);
                break;
            case 4:
                nowaKarta.setRank(RANKS.JACK);
        }

        System.out.println("Wybór koloru: ");
        System.out.println("1. Karo");
        System.out.println("2. Kier");
        System.out.println("3. Pik");
        System.out.println("4. Trefl");
        int kolor = scanner.nextInt();

        switch (kolor){
            case 1:
                nowaKarta.setSuit(SUITS.DIAMONDS);
                break;
            case 2:
                nowaKarta.setSuit(SUITS.HEARTS);
                break;
            case 3:
                nowaKarta.setSuit(SUITS.SPADES);
                break;
            case 4:
                nowaKarta.setSuit(SUITS.CLUBS);
                break;
        }

        Card waletPik = new Card(RANKS.JACK, SUITS.SPADES);
        Card damaTrefl = new Card(RANKS.QUEEN, SUITS.CLUBS);
        Card krolKier = new Card(RANKS.KING, SUITS.HEARTS);
        Card asKaro = new Card(RANKS.ACE, SUITS.DIAMONDS);

        System.out.println(waletPik.getDescription());
        System.out.println(damaTrefl.getDescription());
        System.out.println(krolKier.getDescription());
        System.out.println(asKaro.getDescription());
        System.out.println(nowaKarta.getDescription());

    }
}