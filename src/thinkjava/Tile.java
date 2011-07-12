/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Tile {

    private char letter;

    /**
     * Get the value of letter
     *
     * @return the value of letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * Set the value of letter
     *
     * @param letter new value of letter
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }
    protected int value;

    /**
     * Get the value of value
     *
     * @return the value of value
     */
    public int getValue() {
        return value;
    }

    /**
     * Set the value of value
     *
     * @param value new value of value
     */
    public void setValue(int value) {
        this.value = value;
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    // <editor-fold defaultstate="collapsed" desc="comment">
    public void printTile(Tile t) {
        System.out.println("letter:" + t.getLetter() + " value: " + t.getValue());
    }// </editor-fold>
    public void testTile() {
        Tile t = new Tile('Z',10);
        this.printTile(t);
    }// </editor-fold>
    public static void main(String[] args){
        Tile t = new Tile(' ',0);
        t.testTile();
    }

}
