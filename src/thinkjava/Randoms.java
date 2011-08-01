/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Randoms {
    public static void testArrayHist(){
        int [] numbers = {-100,-1,0,123,234,10,1,2,3,4,5,6,7,8,9,9};
        printArray(arrayHist(numbers));
    }
    public static int[] arrayHist(int [] numbers){
        int [] counts = new int[11];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= 0){
                counts[0]++;
            }
            else if (numbers[i] >= 10){
                counts[10]++;
            }
            else{
               counts[numbers[i]]++;
            }
        }
        return counts;
    }
    public static void testIndexOfTarget(){
        int target = 101;
        int [] numbers = {1,3,5,6,7,5};
        System.out.println(indexOfTarget(target, numbers));
    }
    public static int indexOfTarget(int target, int[] numbers){
       for (int i = 0; i < numbers.length; i++){
            if (target == numbers[i]){
                return i;
            }
        }
        return -1; 
    }
    public static void testAreFactors(){
        int number = 5;
        int [] numbers = {1,3};
        System.out.println(areFactors(number,numbers));
    }
    public static boolean areFactors(int n, int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (!isDivisible(n,numbers[i])){
                return false;
            }
        }
        return true;
    }
    public static boolean isDivisible(int n,int m){
        if (n%m == 0){
            return true;
        }
        else{
            return false;
        }
    }
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
        testArrayHist();
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
