/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class CapitanCrunch {

    static String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
    static String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static char transform(char in,String alphabet,int ring){
        int outIndex = alphabet.indexOf(in)+ring%26;
        if (outIndex<0){
            outIndex = 26 + outIndex;
        }
        return alphabet.charAt(outIndex%26);
    }
    public static String encode(String input,int ring){
        char[] output = new char[input.length()];
        for (int i = 0;i<input.length();i++){
            if(input.charAt(i)!=' '){
                if('a'<=input.charAt(i) && input.charAt(i)<='z'){
                    output[i] = transform(input.charAt(i),alphabetLower,ring);
                }
                else{
                    output[i] = transform(input.charAt(i),alphabetUpper,ring);
                }
            }else{
                output[i] = input.charAt(i);
            }
        }
        return new String(output);
    }

    public static void main(String [] args){
        for (int i = 1;i<=5200;i++){
            System.out.format("%d %s",i,encode(encode("abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ",-i),i).equalsIgnoreCase("abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        }
    }

}
