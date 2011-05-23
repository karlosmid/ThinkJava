/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Test {
    public static void rarefy (int x) {
        if (x == 0) {
            return;
        } else {
            rarefy (x/2);
        }
        System.out.print (x%2);
    }


    public static void twoDigit(int number){
        int lastDigit = number%10;
        int firstDigit = number/10;
        System.out.format("%s%s",lastDigit,firstDigit);
    }

    public static void plusTable(){
        boolean b1 = true,b2 = false;
        int i1 = 1, i2 = 2;
        char c1 = 'a', c2 = 'b';
        String s1 = "Lolek", s2 = "Bolek";
//        System.out.println(b1+b2);
//        System.out.println(b1+i1);
//        System.out.println(b1+c1);
        System.out.println(b1+s1);

        System.out.println(c1+c2);
        System.out.println(c1+i1);
        System.out.println(c1+s1);
        
        System.out.println(i1+i1);
        System.out.println(i1+s1);
        
        System.out.println(s1+s2);

//        c1 = c1 +1;
//        System.out.println(c1);

    }
    public static void stringAndChar(){
        String s = "Karl";
        char c = 'o';
        char c1 = '2';
        System.out.println(s+c);
        System.out.println(3+s);
        System.out.println(3+c1);
    }

    public static void main(String[] args){
//        stringAndChar();
//        plusTable();
//        twoDigit(17);
        rarefy(5);
    }

}
