package com.infoshareacademy;

import java.util.Scanner;

public class Card {

    public enum Suit{
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    public enum Rank{
        ACE, KING, QUEEN, JACK
    }

    public Suit suit;
    public Rank rank;

    public String getDescription(){
        return suit + " - " + rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public void setSuit(Suit suit){
        this.suit = suit;
    }

    public Rank getRank(){
        return rank;
    }

    public void setRank(Rank rank){
        this.rank = rank;
    }

    public void podanyKolor(String suit){
        switch (suit.toUpperCase()){
            case "CLUBS": {
                setSuit(Suit.CLUBS);
                break;
            }
            case "DIAMONDS": {
                setSuit(Suit.DIAMONDS);
                break;
            }
            case "HEARTS": {
                setSuit(Suit.HEARTS);
                break;
            }
            case "SPADES": {
                setSuit(Suit.SPADES);
                break;
            }
            default: {
                System.out.println("Niepoprawny wybor, nie uda sie :)");
                break;
            }
        }
    }

    public void podanaFigura(String rank){
        switch (rank.toUpperCase()){
            case "ACE": {
                setRank(Rank.ACE);
                break;
            }
            case "KING": {
                setRank(Rank.KING);
                break;
            }
            case "QUEEN": {
                setRank(Rank.QUEEN);
                break;
            }
            case "JACK": {
                setRank(Rank.JACK);
                break;
            }
            default: {
                System.out.println("Niepoprawny wybor, nie uda sie :)");
                break;
            }
        }
    }

    public void wymienKarty(){
        Card card = new Card();
        Scanner wpiszKarte = new Scanner(System.in);
        System.out.println("Wprowadz kolor karty (CLUBS, DIAMONDS, HEARTS, SPADES)");
        String suit = wpiszKarte.nextLine();
        card.podanyKolor(suit);
        System.out.println("Wprowadz figure karty (ACE, KING, QUEEN, JACK))");
        String rank = wpiszKarte.nextLine();
        card.podanaFigura(rank);
        System.out.println(card.getDescription());
    }
}