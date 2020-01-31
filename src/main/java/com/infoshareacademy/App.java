package com.infoshareacademy;

import Zadanie1.ZadanieC.Card;
import Zadanie1.ZadanieC.Ranks;
import Zadanie1.ZadanieC.Suits;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

//--------------ZADANIE C---VERSION1-LOOP----------------------

        List<Card> cards = Arrays.asList(
                new Card(Suits.SPADES, Ranks.ACE),
                new Card(Suits.CLUBS, Ranks.KING)
        );

        Ranks[] ranks = Ranks.values();
        Suits[] suits = Suits.values();

        //----This loop displays all (Suits -> Ranks) combinations----
        for (int r = 0; r < ranks.length; r++) {
            for (int s = 0; s < suits.length; s++) {
                System.out.println(ranks[r] + " - " + suits[s]);
            }
        }
    }
}
