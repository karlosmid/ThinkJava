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
    public static int findInElemCollection(int[] elementsCollection,
                                           int whatWeSearch){
        return findInElemCollectionRange(elementsCollection,whatWeSearch,0,
                                         elementsCollection.length - 1);
    }
    public static int findInElemCollectionRange(int[] elementsCollection,
                                                int whatWeSearch,
                                                int lowIndexOfRange,
                                                int highIndexOfRange){
        if (lowIndexOfRange == highIndexOfRange){
            if (elementsCollection[lowIndexOfRange] == whatWeSearch){
                return lowIndexOfRange;
            }
            return -1;
        }
        else{
            int halfIndexOfDividePoint = (highIndexOfRange - lowIndexOfRange)/2;
            int matchIndexInLow = findInElemCollectionRange(elementsCollection,
                                                            whatWeSearch,
                                                            lowIndexOfRange,
                                                            lowIndexOfRange +
                                                            halfIndexOfDividePoint);
            int matchIndexInHigh = findInElemCollectionRange(elementsCollection,
                                                             whatWeSearch,
                                                             lowIndexOfRange +
                                                             halfIndexOfDividePoint + 1,
                                                             highIndexOfRange);
            if (matchIndexInLow == -1 && matchIndexInHigh != -1){
                return matchIndexInHigh;
            }
            else if(matchIndexInLow != -1 && matchIndexInHigh == -1)
            {
                return matchIndexInLow;
            }
            else if(matchIndexInLow != -1 && matchIndexInHigh != -1)
            {
                return Math.min(matchIndexInLow,matchIndexInHigh);
            }
            else{
                return -1;
            }

        }
    }
    public static void main(String[] args){
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        System.out.println(findInElemCollection(a,-1));
    }

}
