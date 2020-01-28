package com.infoshareacademy.zadanie1.ZadanieC;

import java.util.Random;

public class Card {

    private Suits suit;
    private Ranks rank;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public String getDescription(Card card) {

        return card.getSuit().toString() + " - " + card.getRank().toString();
    }

    public static Suits createCustomSuit(String scannerSuit) {
        Suits customSuit = null;


            switch (scannerSuit) {
                case "c": {
                    customSuit = Suits.CLUBS;
                    break;
                }
                case "d": {
                    customSuit = Suits.DIAMONDS;
                    break;
                }
                case "h": {
                    customSuit = Suits.HEARTS;
                    break;
                }
                case "s": {
                    customSuit = Suits.SPADES;
                    break;
                }
                default: {
                    System.out.println("!!!!!!!!!!");
                    System.out.println("Wybrano błędną literkę");
                    System.out.println("!!!!!!!!!!");
                    break;
                }
            }
        return customSuit;
    }

    public static Ranks createCustomRank(String scannerSuit) {
        Ranks customRank = null;

            switch (scannerSuit) {
                case "a": {
                    customRank = Ranks.ACE;
                    break;
                }
                case "j": {
                    customRank = Ranks.JACK;
                    break;
                }
                case "k": {
                    customRank = Ranks.KING;
                    break;
                }
                case "q": {
                    customRank = Ranks.QUEEN;
                    break;
                }
                default: {
                    System.out.println("!!!!!!!!!!");
                    System.out.println("Wybrano błędną literkę");
                    System.out.println("!!!!!!!!!!");
                    break;
                }
            }
        return customRank;
    }


    public static Ranks getRandomRank() {
        //generuje losowy rank dla karty

        Ranks[] ranks = new Ranks[]{Ranks.ACE, Ranks.JACK, Ranks.KING, Ranks.QUEEN};
        int random = new Random().nextInt(ranks.length);
        return ranks[random];
    }

    public static Suits getRandomSuit() {
        //generuje losowy suit dla karty

        Suits[] suits = new Suits[]{Suits.CLUBS, Suits.DIAMONDS, Suits.HEARTS, Suits.SPADES};
        int random = new Random().nextInt(suits.length);
        return suits[random];
    }

}

