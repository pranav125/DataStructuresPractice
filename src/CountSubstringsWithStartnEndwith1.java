/**
 * Created by sony on 4/25/2016.
 * Given a binary string...find substrings that start and end with 1.
 */
import java.util.*;
public class CountSubstringsWithStartnEndwith1 {
    public static void main(String[] str){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = 0;
        char end = '1';
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '1'){
               count++;
            }
        }
        int noOfSubstrings = count*(count-1)/2;
        System.out.println(noOfSubstrings);
    }
}
