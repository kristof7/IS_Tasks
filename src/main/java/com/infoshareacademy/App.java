package com.infoshareacademy;

public class App {
    public static void main(String[] args) {

        Card card1 = new Card();
        Card card2 = new Card();

        card1.setRank(Ranks.ACE);
        card1.setSuit(Suits.HEARTS);
        card1.getDescription();

        card1.setRank(Ranks.KING);
        card1.setSuit(Suits.DIAMONDS);
        card1.getDescription();

        card2.setRank(Ranks.QUEEN);
        card2.setSuit(Suits.CLUBS);
        card2.getDescription();

        card2.setRank(Ranks.JACK);
        card2.setSuit(Suits.SPADES);
        card2.getDescription();
    }
}

