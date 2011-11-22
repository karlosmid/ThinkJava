/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class CardDeck {
    Card[] deck = null;
    public CardDeck(){
        this.deck = new Card[52];
    }
    public void buildDeck(){
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.deck[index] = new Card (suit, rank);
                index++;
            }
        }
    }
    public void printDeck () {
        for (int i=0; i<this.deck.length; i++) {
        deck[i].printCard();
        }
    }
    public int findCardLinear (Card card) {
        for (int i = 0; i< this.deck.length; i++) {
            if (card.deepSameCard(deck[i])) return i;
        }
        return -1;
    }
    public int findCardBisect (Card card, int low, int high) {
        System.out.println (low + ", " + high);
        if (high < low) return -1;
        int mid = (high + low) / 2;
        int comp = card.compareCard (this.deck[mid]);
        if (comp == 0) {
            return mid;
        } else if (comp > 0) {
            return this.findCardBisect (card, low, mid-1);
        } else {
            return this.findCardBisect (card, mid+1, high);
        }
    }
}
class Card
{
    int suit, rank;
    public Card () {
        this.suit = 0;
        this.rank = 0;
    }
    public Card (int suit, int rank) {
        this.suit = suit; this.rank = rank;
    }
    public void printCard (){
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
        "7", "8", "9", "10", "Jack", "Queen", "King" };
        System.out.println (ranks[this.rank] + " of " + suits[this.suit]);

    }
    public boolean shallowSameCard(Card c){
        return c == this;
    }
    public boolean deepSameCard (Card c) {
        return (c.suit == this.suit && c.rank == this.rank);
    }
    public int compareCard(Card c){
        if (c.suit > this.suit) return 1;
        if (c.suit < this.suit) return -1;
        if (c.rank > this.rank) return 1;
        if (c.rank < this.rank) return -1;
        return 0;
    }

}

