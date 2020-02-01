package com.infoshareacademy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Integer cardsQuantity = null;

        System.out.println("Podaj liczbe kart do utworzenia: ");

        while (cardsQuantity == null) {
            try {
                Scanner sc = new Scanner(System.in);
                cardsQuantity = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Podana wartosc jest nieprawidlowa");

            }
        }
        for (int i = 0; i < cardsQuantity; i++) {
            Ranks rank = null;
            Suits suit = null;


            System.out.println("Podaj jedna z figur (ACE/QUEEN/JACK/KING): ");
            while (rank == null) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    rank = Ranks.valueOf(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Podana wartosc jest nieprawidlowa, sprobuj ponownie");
                }
            }

            System.out.println("Podaj jeden z kolorow (CLUBS/DIAMONDS/HEARTS/SPADES): ");
            while (suit == null) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    suit = Suits.valueOf(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Podana wartosc jest nieprawidlowa, sprobuj ponownie");
                }
            }

            Card card = new Card(rank, suit);
            System.out.println("\n" + card.getDescription() + "\n");
        }

    }
}
