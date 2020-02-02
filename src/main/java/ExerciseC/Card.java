package ExerciseC;

public class Card {
    private Ranks ranks;
    private Suits suits;

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

    public Card (Ranks ranks, Suits suits ) {
        this.ranks = ranks;
        this.suits = suits;
    }

    public static void getDescription() {
        Card card1 = new Card(Ranks.JACK, Suits.HEARTS);
        Card card2 = new Card(Ranks.KING, Suits.SPADES);
        Card card3 = new Card(Ranks.ACE, Suits.DIAMONDS);
        System.out.println(card1.ranks + " - " + card1.suits);
        System.out.println(card2.ranks + " - " + card2.suits);
        System.out.println(card3.ranks + " - " + card3.suits);

    }

}
