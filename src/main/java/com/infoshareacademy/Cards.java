package main.java.com.infoshareacademy;

import java.util.Scanner;

public class Cards {
    public Suits suit;
    public Ranks rank;

    public Suits getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public void getDescription() {
        suitOfCard();
        rankOfCard();
        System.out.println("Twoja karta to: " + rank + " - " + suit);
    }

    private void rankOfCard() {
        String figuraKarty = "";
        System.out.println("Napisz figurę karty (ACE, KING, QUEEN, JACK):");
        while (!(figuraKarty.equals("ACE")) || (figuraKarty.equals("KING")) || (figuraKarty.equals("QUEEN")) || (figuraKarty.equals("JACK"))) {
            Scanner scanner = new Scanner(System.in);
            figuraKarty = scanner.nextLine().toUpperCase();
            if ((figuraKarty.equals("ACE")) || (figuraKarty.equals("KING")) || (figuraKarty.equals("QUEEN")) || (figuraKarty.equals("JACK"))) {
                setRank(Ranks.valueOf(figuraKarty));
                break;
            } else {
                System.out.println("Nie wpisałeś poprawnej figury karty");
            }
        }
    }

    private void suitOfCard() {
        String kolorKarty = "";
        System.out.println("Napisz kolor karty (CLUBS, DIAMONDS, HEARTS, SPADES):");
        while (!(kolorKarty.equals("CLUBS")) || (kolorKarty.equals("DIAMONDS")) || (kolorKarty.equals("HEARTS")) || (kolorKarty.equals("SPADES"))) {
            Scanner scanner = new Scanner(System.in);
            kolorKarty = scanner.nextLine().toUpperCase();
            if ((kolorKarty.equals("CLUBS")) || (kolorKarty.equals("DIAMONDS")) || (kolorKarty.equals("HEARTS")) || (kolorKarty.equals("SPADES"))) {
                setSuit(Suits.valueOf(kolorKarty));
                break;
            } else {
                System.out.println("Nie wpisałeś poprawnego koloru karty");
            }
        }
    }
}
