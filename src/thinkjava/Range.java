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
    public static void sortElemCollection(int[] elementsCollection){
        for (int i = 0;i<= elementsCollection.length -1;i++){
            int maxIndex = indexOfMaxElemInRange(elementsCollection,i,
                                                 elementsCollection.length -1);
            swapElements(elementsCollection, i, maxIndex);
        }
    }
    public static void swapElements(int[] elementsCollection,
                                    int firstIndex,
                                    int secondIndex){
        int tempElementSpace = elementsCollection[firstIndex];
        elementsCollection[firstIndex] = elementsCollection[secondIndex];
        elementsCollection[secondIndex] = tempElementSpace;
    }
    public static int maxElemInCollection(int[] elementsCollection){
        return maxElemInCollectionRange(elementsCollection,0,
                                        elementsCollection.length - 1);
    }
    private static int graterOfTwoElem(int[] elementsCollection,
                                       int firstIndex,
                                       int secondIndex){
        if (elementsCollection[firstIndex] >=
                elementsCollection[secondIndex]){
                return firstIndex;
            }
            else{
                return secondIndex;
            }    
    }
    public static int indexOfMaxElemInRange(int[] elementsCollection,
                                            int lowIndexOfRange,
                                            int highIndexOfRange){
        if (lowIndexOfRange == highIndexOfRange){
            return lowIndexOfRange;
        }
        else if (highIndexOfRange - lowIndexOfRange == 1){
            return graterOfTwoElem(elementsCollection,
                            lowIndexOfRange,
                            highIndexOfRange);
        }
        else{
            int halfIndexPoint = (highIndexOfRange+lowIndexOfRange)/2;
            int indexOfMaxInLow = indexOfMaxElemInRange(elementsCollection,
                                                        lowIndexOfRange,
                                                        halfIndexPoint);
            int indexOfMaxInHigh = indexOfMaxElemInRange(elementsCollection,
                                                         halfIndexPoint,
                                                         highIndexOfRange);
            return graterOfTwoElem(elementsCollection,
                                   indexOfMaxInLow,
                                   indexOfMaxInHigh);
        }
    }
    public static int maxElemInCollectionRange(int[] elementsCollection,
                                               int lowIndexOfRange,
                                               int highIndexOfRange){
        if (lowIndexOfRange == highIndexOfRange){
            return elementsCollection[lowIndexOfRange];
        }
        else if (highIndexOfRange - lowIndexOfRange == 1){
            return Math.max(elementsCollection[lowIndexOfRange],
                            elementsCollection[highIndexOfRange]);
        }
        else{
            int halfIndexPoint = (highIndexOfRange+lowIndexOfRange)/2;
            int maxElemInLow = maxElemInCollectionRange(elementsCollection,
                                                        lowIndexOfRange,
                                                        halfIndexPoint);
            int maxElemInHigh = maxElemInCollectionRange(elementsCollection,
                                                         halfIndexPoint,
                                                         highIndexOfRange);
            return Math.max(maxElemInLow,maxElemInHigh);
        }
    }
    public static void main(String[] args){
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        System.out.println(maxElemInCollectionRange(a,2,5));
    }

}
