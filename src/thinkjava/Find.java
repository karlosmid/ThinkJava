/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Find {    
    public static int findInArray(int[] arrayOfInt, int whatWeSearch){
        if (arrayOfInt.length == 1){
            if (arrayOfInt[0] == whatWeSearch){
                return 0;
            }
            return -1;
        }
        else{
            int dividePoint = arrayOfInt.length/2;
            int[] lowerArrayOfInt = new int[dividePoint];
            int[] higherArrayOfInt = new int[arrayOfInt.length - dividePoint];
            System.arraycopy
                    (arrayOfInt,dividePoint,higherArrayOfInt,0,
                     arrayOfInt.length - dividePoint);
            System.arraycopy
                    (arrayOfInt,0,lowerArrayOfInt,0,dividePoint);            
            int indexInLow = findInArray(lowerArrayOfInt,whatWeSearch);
            int indexInHigh = findInArray(higherArrayOfInt,whatWeSearch);
            if (indexInLow == -1 && indexInHigh != -1){
                return indexInHigh + dividePoint;
            }
            else if(indexInLow != -1 && indexInHigh == -1)
            {
                return indexInLow;
            }
            else if(indexInLow != -1 && indexInHigh != -1)
            {
                return Math.min(indexInLow,indexInHigh);
            }
            else{
                return -1;
            }

        }
    }
    public static void main(String[] args){
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        System.out.println(findInArray(a,-1));
    }

}
