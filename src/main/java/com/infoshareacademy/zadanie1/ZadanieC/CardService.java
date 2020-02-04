package com.infoshareacademy.zadanie1.ZadanieC;

import java.util.Random;

public class CardService {
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

        int random = new Random().nextInt(Ranks.values().length);
        return Ranks.values()[random];
    }

    public static Suits getRandomSuit() {
        //generuje losowy suit dla karty

        int random = new Random().nextInt(Suits.values().length);
        return Suits.values()[random];
    }
}
