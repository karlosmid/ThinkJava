/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;
import java.lang.Math;

/**
 *
 * @author karlo
 */
public class Randoms {
    public static void testScoreHist(){
        int numValues = 100;
        int [] scores = randomArray (numValues);
        int [] scoreHist = scoreHist(scores,10);
        printArray (scoreHist);
        System.out.println(sumScoreHist(scoreHist));
    }
    public static void testRandomIntArray(){
        int numValues = 8;
        int[] array = randomArray (numValues);
        printArray (array);

    }
    public static void testRandomDouble(){
        int i = 0;
        double low = 5;
        double high = 10;
        while(i<10){
            double r = randomDouble(low,high);
            System.out.println(r);
            i += 1;
        }
    }
    public static void testRandomInt(){
        int i = 0;
        int low = 5;
        int high = 10;
        while(i<10){
            int r = randomInt(low,high);
            System.out.println(r);
            i += 1;
        }
    }
    public static void main(String[] args){
        testScoreHist();
    }
    public static int sumScoreHist(int [] scoreHist){
        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum = sum + scoreHist[i];
        }
        return sum;
    }
    public static int[] scoreHist(int [] scores, int NoOfScoreClasses){
        int[] counts = new int [NoOfScoreClasses];
        for (int i = 0; i < scores.length; i++) {
            int index = scores[i]/10;
            if (index == 10){
                index = index -1;
            }
            counts[index]++;
        }
        return counts;
    }
    public static void printArray (int[] a) {
        for (int i = 0; i<a.length; i++) {
            System.out.println (a[i]);
        }
    }

    public static int[] randomArray (int n) {
        int[] a = new int[n];
        for (int i = 0; i<a.length; i++) {
            a[i] = randomInt (0, 100);
        }
        return a;
    }
    public static int randomInt(int low, int high){
        double x = Math.ceil(((high - low) * Math.random())) + low;
        return (int)x;
    }
    public static double randomDouble(double low, double high){
        double x = ((high - low) * Math.random()) + low;
        return x;
    }

}
