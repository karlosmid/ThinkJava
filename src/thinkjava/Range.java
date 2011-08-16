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
    public static boolean testWord(String tiles,String word,boolean useStarsAsWildChars){
        int[] tilesHist = letterHist(tiles);
        int noOfStars = 0;
        if (useStarsAsWildChars){
            for (int i = 0;i <= tiles.length() -1;i++){
                if (tiles.charAt(i) == '*'){
                    noOfStars++;
                }
            }
        }
        String wordInLowerCase = word.toLowerCase();
        String englishAlphabet = "abcdefghijklmnopqrstuvwxyz";
         for (int i = 0;i <= wordInLowerCase.length() - 1;i++){
             int indexOfHist = englishAlphabet.indexOf(wordInLowerCase.charAt(i));
             if (tilesHist[indexOfHist] == 0){
                 if(noOfStars == 0){
                     return false;    
                 }
                 else{
                     noOfStars--;
                 }
             }
         }
         return true;
    }
    public static boolean isDoubloon(String word){
         int[] wordHist = letterHist(word);
         for (int i = 0;i <= wordHist.length - 1;i++){
             if (wordHist[i] !=2 && wordHist[i] != 0){
                 return false;
             }
         }
         return true;
    }
    public static int[] letterHist(String letters){
        String lettersInLowerCase = letters.toLowerCase();        
        String englishAlphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] letterHist = new int[26];
        for (int i = 0;i<=lettersInLowerCase.length() - 1;i++){
            int indexOfHist = englishAlphabet.indexOf(lettersInLowerCase.charAt(i));
            if ( indexOfHist != -1){
                letterHist[indexOfHist]++;
            }
        }
        return letterHist;
        
    }
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
        String input = "Abba";
        boolean result = Range.isDoubloon(input);
    }

}
