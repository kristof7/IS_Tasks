package com.infoshareacademy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Card> cards = Arrays.asList(
                new Card(Suits.CLUBS, Ranks.ACE),
                new Card(Suits.DIAMONDS, Ranks.KING),
                new Card(Suits.HEARTS, Ranks.QUEEN),
                new Card(Suits.SPADES, Ranks.JACK)
        );
        for (Card card : cards) {
                System.out.println(card.getRanks() + " -  " + card.getSuits());
            }

    }

}