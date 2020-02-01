package kasia29;


import java.util.Scanner;

public  class Card {
    public Card(String x, String y) {
         this.x=x;
         this.y=y;
    }

    private enum Suit {
        DIAMONDS, CLUBS, HEARTS, SPADES;
    }

    private enum Rank {
        JACK, QUEEN, KING, ACE;
    }

    private Suit mSuit;
    private Rank mRank;


    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    private String x;
    private String y;

    public Card(Suit suit, Rank rank) {
        this.mSuit = suit;
        this.mRank = rank;
    }


    public Suit getSuit() {
        return mSuit;
    }

    public Rank getRank() {
        return mRank;
    }

    public String getDescription() {
        return getRank() + " - " + getSuit();
    }


    public void setSuit(Suit suit) {
        this.mSuit = suit;
    }


    public void setRank(Rank rank) {
        this.mRank = rank;
    }

     public String zKlawiatury(){
        return getX() +  "-" +  getY();



    }



    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("podaj figure");
        String x=scan.nextLine();
        System.out.println("podaj kolor");
        String y=scan.nextLine();

         Card zKlaw =new Card(x,y);

        System.out.println(zKlaw.zKlawiatury());
        System.out.println("*************************");


        Card nowa=new Card(Suit.DIAMONDS,Rank.ACE);
        Card nowa2=new Card(Suit.CLUBS,Rank.JACK);
        Card nowa3=new Card(Suit.HEARTS,Rank.KING);
        System.out.println(nowa.getDescription());
        System.out.println(nowa2.getDescription());
        System.out.println(nowa3.getDescription());
    }}

