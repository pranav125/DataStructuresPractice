/**
 * Created by sony on 4/26/2016.
 * Given 2 strings...find whether 2 strings are anagram of each other.
 */

import java.util.*;

public class Anagrams {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s1Local = s1.replace("//s"," ");
        String s2Local = s2.replace("//s"," ");
        char[] strArr1 = s1Local.toLowerCase().toCharArray();
        char[] strArr2 = s2Local.toLowerCase().toCharArray();
        if(s1Local.length() != s2Local.length() ) System.out.println("Strings are not anagrams.");

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);

        if(Arrays.equals(strArr1,strArr2)){
            System.out.println("Strings are anagrams of each other.");
        }
        else{
            System.out.println("Strings are not anagrams of each other.");
        }


    }
}
