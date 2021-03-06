/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Palindrome {
    public static boolean isDupledrome(String s){
        if (s.length()==2)
            if (s.charAt(0) == s.charAt(1) ){
                return true;
            }
            else{
                return false;
            }
        else
            if (s.charAt(0) == s.charAt(1) ){
                return isDupledrome(s.substring(2, s.length()));
            }
            else{
                return false;
            }
    }

    public static boolean isAbecedarian(String s){
        if (s.length()==1)
            return true;
        else
            if (s.charAt(0) <= s.charAt(1) ){
                return isAbecedarian(s.substring(1, s.length()));
            }
            else{
                return false;
            }        
    }
    public static boolean isPalindromeIter(String s){
        if (s.length()>=0 && s.length()<=1){
            return true;
        }else{
            for(int i = 0;i<s.length()/2;i++){
                if(s.charAt(i) != s.charAt(s.length()-1-i)){
                    return false;
                }
            }
        return true;
        }
    }
    public static boolean isPalindrome(String s){
//        System.out.println(s);
        if (s.length()==1){
            return true;            
            
        }
        else if(s.length()==2){
            if (first(s)==last(s)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (first(s)==last(s)){
                return isPalindrome(middle(s));
            }
            else{
                return false;
            }
        }
    }
    public static String middle(String s){
        if (s.length() > 2){
            return s.substring(1,s.length()-1);
        }else {
            return "";
        }
    }
    public static char first(String s){
        return s.charAt(0);
    }
    public static char last(String s){
        return s.charAt(s.length()-1);
    }
    public static void main(String[] args){
//        String s = "Karlo";
//        System.out.println(first(s));
//        System.out.println(last(s));
//        System.out.println(middle(""));
//        System.out.println(isPalindrome("otto"));
//        System.out.println(isPalindrome("acaramanamaraca"));
//        System.out.println(isPalindrome("anavolimilovana"));
//        System.out.println(isPalindrome("karlo"));
//
//        System.out.println(isPalindromeIter("otto"));
//        System.out.println(isPalindromeIter("acaramanamaraca"));
//        System.out.println(isPalindromeIter("anavolimilovana"));
//        System.out.println(isPalindromeIter("karlo"));
//        System.out.println(isAbecedarian("abdest"));
//        System.out.println(isAbecedarian("karlo"));
//        System.out.println(isAbecedarian("biopsy"));

        System.out.println(isDupledrome("karlo"));
        System.out.println(isDupledrome("kkaarrlloo"));
    }

}
