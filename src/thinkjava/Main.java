/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Main {

    public static int countLetters(String s, char c){
        int counter = 0;
        int positionIndx = s.indexOf(c);
        if(positionIndx == -1){
            return counter;
        }
        else if(positionIndx < s.length()){            
            counter = counter + 1;
            positionIndx = s.indexOf(c,positionIndx+1);
            while(positionIndx < s.length()){                                
                if(positionIndx ==-1){
                    return counter;
                }
                else{
                    counter = counter + 1;
                }
                positionIndx = s.indexOf(c,positionIndx+1);                
            }
        }
        return counter;
         
    }

    public static void printReverse(String s){
        int index=s.length()-1;
        while (index > -1){
            System.out.print(s.charAt(index));
            index = index -1;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            printReverse("Karlo");
        }catch(java.lang.StringIndexOutOfBoundsException siobe){
            System.out.println("Eto nas!");
            siobe.printStackTrace();
        }
        System.out.println(countLetters("bannana",'a'));
    }

}
