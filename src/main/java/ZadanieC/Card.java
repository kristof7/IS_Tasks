package ZadanieC;

public class Card {
    SUITS suit;
    RANKS rank;

    public SUITS getSuit() {
        return suit;
    }

    public void setSuit(SUITS suit) {
        this.suit = suit;
    }

    public RANKS getRank() {
        return rank;
    }

    public void setRank(RANKS rank) {
        this.rank = rank;
    }

    public void getDescription(){
        suit=this.suit;
        rank=this.rank;
        System.out.println(rank+" - "+suit);
    }



}
