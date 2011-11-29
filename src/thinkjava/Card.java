/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Card
{
    int suit, rank;
    public Card () {
        this.suit = 0;
        this.rank = 0;
    }
    public Card (int suit, int rank) {
        this.suit = suit; this.rank = rank;
    }
    public String printCard (){
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
        "7", "8", "9", "10", "Jack", "Queen", "King" };
        System.out.println (ranks[this.rank] + " of " + suits[this.suit]);
        return ranks[this.rank] + " of " + suits[this.suit];

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
    public int cardValue(){
        if (this.rank > 9){
            return 10;
        }
        else{
            return this.rank;
        }
    }

}
