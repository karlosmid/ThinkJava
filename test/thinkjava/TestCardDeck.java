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
        assertEquals("4 of Spades",c.printCard());
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
        String[] expectedDeck = {"Ace of Clubs","2 of Clubs","3 of Clubs","4 of Clubs","5 of Clubs",
                                 "6 of Clubs","7 of Clubs","8 of Clubs","9 of Clubs","10 of Clubs",
                                 "Jack of Clubs","Queen of Clubs","King of Clubs","Ace of Diamonds",
                                 "2 of Diamonds","3 of Diamonds","4 of Diamonds","5 of Diamonds",
                                 "6 of Diamonds","7 of Diamonds","8 of Diamonds","9 of Diamonds",
                                 "10 of Diamonds","Jack of Diamonds","Queen of Diamonds",
                                 "King of Diamonds","Ace of Hearts","2 of Hearts","3 of Hearts",
                                 "4 of Hearts","5 of Hearts","6 of Hearts","7 of Hearts","8 of Hearts",
                                 "9 of Hearts","10 of Hearts","Jack of Hearts","Queen of Hearts",
                                 "King of Hearts","Ace of Spades","2 of Spades","3 of Spades",
                                 "4 of Spades","5 of Spades","6 of Spades","7 of Spades","8 of Spades",
                                 "9 of Spades","10 of Spades","Jack of Spades","Queen of Spades",
                                 "King of Spades"};
        int i = 0;
        String[] acctualDeck = carddeck.printDeck();
        for (String cardString : expectedDeck){
            TestCardDeck.assertEquals(cardString,acctualDeck[i]);
            i = i + 1;
        }
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
    public void testCardValueJack(){
        Card card = new Card(0,11);
        TestCardDeck.assertEquals(10,card.cardValue());
    }
    public void testCardValueSix(){
        Card card = new Card(0,6);
        TestCardDeck.assertEquals(6,card.cardValue());
    }
    public void testHandCardScore(){
        CardDeck carddeck = new CardDeck();
        Card[] hand = {new Card(0,1), new Card(1,10), new Card(2,11)};
        TestCardDeck.assertEquals(21,carddeck.handScore(hand));
    }
    public void testStringIsof(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        TestCardDeck.assertEquals(true,carddeck.isThisOfString("of"));
    }
    public void testStringIsofUpperCase(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        TestCardDeck.assertEquals(true,carddeck.isThisOfString("OF"));
    }
    public void testStringIsofFail(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        TestCardDeck.assertEquals(false,carddeck.isThisOfString("cicarija"));
    }
    public void testCalcRankJack(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        TestCardDeck.assertEquals(11,carddeck.calculateRank("Jack"));
    }
    public void testCalcRank3(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        TestCardDeck.assertEquals(3,carddeck.calculateRank("3"));
    }
    public void testCalcRankJacck(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        try{
            int rank = carddeck.calculateRank("Jacck");
            fail();
        }
        catch(NumberFormatException e){
            ;
        }
    }
    public void testCalcSuiteHearts(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        TestCardDeck.assertEquals(2,carddeck.calculateSuite("Hearts"));
    }
    public void testCalcSuiteHarts(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        try{
            int suite = carddeck.calculateSuite("Harts");
            fail();
        }
        catch(NumberFormatException e){
            ;
        }
    }
    public void testParseCard(){
        CardDeck carddeck = new CardDeck();
        carddeck.buildDeck();
        String[] inputDeck = {"Ace of Clubs","2 of Clubs","3 of Clubs","4 of Clubs","5 of Clubs",
                                 "6 of Clubs","7 of Clubs","8 of Clubs","9 of Clubs","10 of Clubs",
                                 "Jack of Clubs","Queen of Clubs","King of Clubs","Ace of Diamonds",
                                 "2 of Diamonds","3 of Diamonds","4 of Diamonds","5 of Diamonds",
                                 "6 of Diamonds","7 of Diamonds","8 of Diamonds","9 of Diamonds",
                                 "10 of Diamonds","Jack of Diamonds","Queen of Diamonds",
                                 "King of Diamonds","Ace of Hearts","2 of Hearts","3 of Hearts",
                                 "4 of Hearts","5 of Hearts","6 of Hearts","7 of Hearts","8 of Hearts",
                                 "9 of Hearts","10 of Hearts","Jack of Hearts","Queen of Hearts",
                                 "King of Hearts","Ace of Spades","2 of Spades","3 of Spades",
                                 "4 of Spades","5 of Spades","6 of Spades","7 of Spades","8 of Spades",
                                 "9 of Spades","10 of Spades","Jack of Spades","Queen of Spades",
                                 "King of Spades"};
        int i = 0;
        Card[] expectedDeck = new Card[52];
        for (String cardString : inputDeck){
            expectedDeck[i] = carddeck.parseCard(cardString);
            i = i + 1;
        }
        i = 0;
        for (Card card : carddeck.deck){
            TestCardDeck.assertEquals(true,card.deepSameCard(expectedDeck[i]));
            i = i + 1;
        }
    }
}
