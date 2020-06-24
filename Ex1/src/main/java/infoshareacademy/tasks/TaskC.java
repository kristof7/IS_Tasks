package infoshareacademy.tasks;

import infoshareacademy.tasks.cards.Card;
import infoshareacademy.tasks.cards.Rank;
import infoshareacademy.tasks.cards.Suit;

public class TaskC {
    public static void run() {
        Card card1 = new Card(Suit.SPADES, Rank.ACE);
        Card card2 = new Card(Suit.DIAMONDS, Rank.KING);
        Card card3 = new Card(Suit.CLUBS, Rank.QUEEN);

        System.out.println(card1.getDescription());
        System.out.println(card2.getDescription());
        System.out.println(card3.getDescription());
    }
}
