package Zadanie1.ZadanieC;


public class Card {
    private Ranks ranks;
    private Suits suits;

    public Card() {
    }

    public Ranks ranks() {
        return getRanks();
    }

    public Suits suits() {
        return getSuits();
    }
//----Setters & Getters-----

    public Ranks getRanks() {
        return ranks;
    }

    public void setRanks(Ranks ranks) {
        this.ranks = ranks;
    }

    public Suits getSuits() {
        return suits;
    }

    public void setSuits(Suits suits) {
        this.suits = suits;
    }

    //----GetDescription Method-----
    public static void getDescription(int i, int j) {
        Ranks[] ranks = Ranks.values();
        Suits[] suits = Suits.values();
        System.out.println("The choosen card is: " + ranks[i] + " of " + suits[j]);
    }
}
