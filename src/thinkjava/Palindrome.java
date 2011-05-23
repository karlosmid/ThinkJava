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
    public static boolean isPalindrome(String s){
        System.out.println(s);
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
        String s = "Karlo";
//        System.out.println(first(s));
//        System.out.println(last(s));
//        System.out.println(middle(""));
        System.out.println(isPalindrome("otto"));
        System.out.println(isPalindrome("acaramanamaraca"));
        System.out.println(isPalindrome("anavolimilovana"));
    }

}
