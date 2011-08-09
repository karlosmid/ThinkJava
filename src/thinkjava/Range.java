/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;
/**
 *
 * @author karlo
 */
public class Range {
    public static int maxInArray(int[] arrayOfInt){
        return maxInRange(arrayOfInt,0,arrayOfInt.length - 1);
    }
    public static int maxInRange(int[] arrayOfInt, int lowIndex, int highIndex){
        if (lowIndex == highIndex){
            return arrayOfInt[lowIndex];
        }
        else if (highIndex - lowIndex == 1){
            return Math.max(arrayOfInt[lowIndex],arrayOfInt[highIndex]);
        }
        else{
            int dividePoint = (highIndex+lowIndex)/2;            
            int[] lowerArrayOfInt = new int[dividePoint - lowIndex];
            int[] higherArrayOfInt = new int[highIndex - dividePoint + 1];
            System.arraycopy
                    (arrayOfInt,lowIndex,lowerArrayOfInt,0,dividePoint - lowIndex);
            System.arraycopy
                    (arrayOfInt,dividePoint,higherArrayOfInt,0,highIndex - dividePoint + 1);
            int maxInLow = maxInRange(lowerArrayOfInt,0,lowerArrayOfInt.length - 1);
            int maxInHigh = maxInRange(higherArrayOfInt,0,higherArrayOfInt.length - 1);
            return Math.max(maxInLow,maxInHigh);
        }
    }
    public static void main(String[] args){
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        System.out.println(maxInRange(a,2,5));
    }

}