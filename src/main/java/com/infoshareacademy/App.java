package com.infoshareacademy;

import java.util.Scanner;

public class App {
 //@Homework3
 public static void main(String[] args) {

     Card card1 = new Card();
     Card card2 = new Card();

     card1.setRank(Ranks.ACE);
     card1.setSuit(Suits.CLUBS);
     System.out.println(card1.getDescription(card1.getSuit(), card1.getRank()));

     card2.setRank((Ranks.JACK));
     card2.setSuit(Suits.SPADES);
     System.out.println(card2.getDescription(card2.getSuit(),card2.getRank()));
 }
    public enum Suits {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;
    }
    public enum Ranks {
        ACE,
        KING,
        QUEEN,
        JACK;
    }
}
