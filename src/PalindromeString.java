/**
 * Created by sony on 4/19/2016.
 * Given a string...find whether it is palindrome or not.
 */
import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        //First way//
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);
//        if(sb.toString().equals(s)){
//            System.out.println("String is palindrome");
//        }
//        else{
//            System.out.println("String is not palindrome");
//        }

        // Other way
        int count = 0;
        for(int i = 0; i < s.length()/2; i++){
            for(int j = s.length() - 1; j > i; j--){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                    System.out.println(count);
                }
            }

        }
        System.out.println(count);
        if(count == s.length()/2) System.out.println("String is Palindrome.");
        else System.out.println("String is not Palindrome.");
    }
}
