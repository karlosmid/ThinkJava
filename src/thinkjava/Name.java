/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Name {
    public static int compareName(String name1, String name2){
        int len1 = name1.length();
        int len2 = name2.length();
        String nameNormal1 = convertName(name1).toLowerCase();
        String nameNormal2 = convertName(name2).toLowerCase();
        if (len1 <= len2){
            for (int i = 0;i<len1;i++){
                System.out.println(nameNormal1.charAt(i));
                System.out.println(nameNormal2.charAt(i));
                if (nameNormal1.charAt(i)<nameNormal2.charAt(i)){
                    return -1;
                }else if(nameNormal1.charAt(i)>nameNormal2.charAt(i)){
                    return 1;
                }
            }
            return 0;
        }else{
            for (int i = 0;i<len2;i++){
                System.out.println(nameNormal1.charAt(i));
                System.out.println(nameNormal2.charAt(i));
                if (nameNormal2.charAt(i)<nameNormal1.charAt(i)){
                    return -1;
                }else if(nameNormal2.charAt(i)>nameNormal1.charAt(i)){
                    return 1;
                }
            }
            return 0;
        }
    }
    public static String convertName(String name){
        if (hasComa(name)){
            return name;
        }else{            
            String[] lastFirstArray = name.split(" ");
            return lastFirstArray[1]+", "+lastFirstArray[0];
        }
    }
    public static boolean hasComa(String name){
        if (name.indexOf(',')!=-1){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
//        System.out.println(hasComa("Jaoo ,jjjj"));
//        System.out.println(hasComa("Jaoo jjjj"));
//        System.out.println(convertName("Karlo, Smid"));
//        System.out.println(convertName("Karlo Smid"));
        System.out.println(compareName("Ajme Meni","Karlo Smid"));
        System.out.println(compareName("Ajme Meni","AArlo Smid"));
//        char c1 = 'm';
//        char c2 = 's';
//        System.out.println(c1<c2);
    }
}
