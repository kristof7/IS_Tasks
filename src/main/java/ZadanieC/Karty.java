package ZadanieC;

public class Karty {
    public static void main(String[] args) {

        Card card1= new Card();
        Card card2= new Card();
        Card card3= new Card();
        Card card4= new Card();
        Card card5= new Card();

        card1.setRank(RANKS.JACK);
        card2.setRank(RANKS.ACE);
        card3.setRank(RANKS.KING);
        card4.setRank(RANKS.QUEEN);
        card5.setRank(RANKS.ACE);

        card1.setSuit(SUITS.CLUBS);
        card2.setSuit(SUITS.DIAMONDS);
        card3.setSuit(SUITS.HEARTS);
        card4.setSuit(SUITS.SPADES);
        card5.setSuit(SUITS.DIAMONDS);

        card1.getDescription();
        card2.getDescription();
        card3.getDescription();
        card4.getDescription();
        card5.getDescription();


    }

}
