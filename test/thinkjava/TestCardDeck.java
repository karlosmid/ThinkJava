/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;
import junit.framework.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import thinkjava.CardDeck;
import thinkjava.Card;

/**
 *
 * @author karlo
 */
public class TestCardDeck extends TestCase{
    public TestCardDeck(String name){
        super(name);
    }
    public void testPrintCard(){
        Card c = new Card(3,4);
        c.printCard();
        assertTrue(true);
    }
    public void testShallowSameCardTrue(){
        Card c1 = new Card(3,4);
        Card c2 = new Card(3,5);
        c2 = c1;
        assertTrue(c1.shallowSameCard(c2));
    }
    public void testShallowSameCardFalse(){
        Card c1 = new Card(3,4);
        Card c2 = new Card(3,5);
        assertFalse(c1.shallowSameCard(c2));
    }
    public void testDeepSameCardTrue(){
        Card c1 = new Card(3,5);
        Card c2 = new Card(3,5);
        assertTrue(c1.deepSameCard(c2));
    }
    public void testDeepSameCardFalse(){
        Card c1 = new Card(3,4);
        Card c2 = new Card(3,5);
        assertFalse(c1.deepSameCard(c2));
    }
    public void testCompareCardInputGreaterInRank(){
        Card c1 = new Card(3,4);
        Card c2 = new Card(3,5);
        TestCardDeck.assertEquals(1,c1.compareCard(c2));
    }
    public void testCompareCardInputGreaterInSuite(){
        Card c1 = new Card(2,4);
        Card c2 = new Card(3,5);
        TestCardDeck.assertEquals(1,c1.compareCard(c2));
    }
    public void testCompareCardInputEqual(){
        Card c1 = new Card(3,5);
        Card c2 = new Card(3,5);
        TestCardDeck.assertEquals(0,c1.compareCard(c2));
    }
    public void testCompareCardInputLessInRank(){
        Card c1 = new Card(2,4);
        Card c2 = new Card(2,3);
        TestCardDeck.assertEquals(-1,c1.compareCard(c2));
    }
    public void testCompareCardInputLessInSuite(){
        Card c1 = new Card(2,4);
        Card c2 = new Card(1,5);
        TestCardDeck.assertEquals(-1,c1.compareCard(c2));
    }
    public void testbuildDeck(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        Card c1 = new Card(2,5);
        carddeck.deck[30].printCard();
        TestCardDeck.assertEquals(0,c1.compareCard(carddeck.deck[30]));
    }
    public void testPrintDeck(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        carddeck.printDeck();
    }
    public void testFindCardLinear(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        Card c = new Card(3,6);
        TestCardDeck.assertEquals(44, carddeck.findCardLinear(c));
    }
    public void testFindCardLinearFail(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        Card c = new Card(4,6);
        TestCardDeck.assertEquals(-1, carddeck.findCardLinear(c));
    }
    public void testFindCardBisec(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        Card c = new Card(3,6);
        TestCardDeck.assertEquals(44, carddeck.findCardBisect(c,0,carddeck.deck.length-1));
    }
    public void testFindCardBisecFail(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        Card c = new Card(3,14);
        TestCardDeck.assertEquals(-1, carddeck.findCardBisect(c,0,carddeck.deck.length-1));
    }
}
