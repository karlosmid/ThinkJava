/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;
import java.math.BigInteger;

/**
 *
 * @author karlo
 */
public class Big {
    public static BigInteger pow (int x, int n) {
        if (n==0) return BigInteger.valueOf(1);
        // find x to the n/2 recursively
        BigInteger t = pow (x, n/2);
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n%2 == 0) {
            return t.multiply(t);
        } else {
            BigInteger bigX = BigInteger.valueOf(x);
            return t.multiply(t).multiply(bigX);
}
}

    public static void printFactorialTable30(){
        for (int i = 0;i<=30;i++){
            System.out.format("%d\t%d\n",i,factorial(i));
        }
    }
    public static BigInteger factorial(int n){
        long fact = -1;
        BigInteger bigFact = BigInteger.valueOf(fact);

        if (n < 0){
            bigFact = BigInteger.valueOf(-1);
        } else if (n == 0) {
            bigFact = BigInteger.valueOf(1);
        }else{
            bigFact = BigInteger.valueOf(1);
            BigInteger small = BigInteger.valueOf(1);
            for (int i =1;i<=n;i++){
                small = BigInteger.valueOf(i);
                bigFact = bigFact.multiply(small);
            }
        }
        return bigFact;
    }
    public static void main(String[] args){
//        System.out.println(factorial(5));
//        printFactorialTable30();
        System.out.println(pow(20000000,1000));
    }
}
