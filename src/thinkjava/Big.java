/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Big {
    public static void printTable30(){
        for (int i = 0;i<=30;i++){
            System.out.format("%d\t%d\n",i,factorial(i));
        }
    }
    public static long factorial(int n){
        long fact = -1;
        if (n < 0){
            fact = -1;
        } else if (n == 0) {
            fact = 1;
        }else{
            fact = 1;
            for (int i =1;i<=n;i++){
                fact = fact * i;
            }
        }
        return fact;
    }
    public static void main(String[] args){
//        System.out.println(factorial(5));
        printTable30();
    }
}
