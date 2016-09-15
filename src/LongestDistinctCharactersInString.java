/**
 * Created by sony on 4/22/2016.
 * Given a string...find a longest distinct characters in a smallest substring.
 */
import java.util.*;
public class LongestDistinctCharactersInString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr.length; i++){
            sb.append(arr[i]);
        }
        HashSet<Character> s1 = new HashSet<Character>();
        for(int i = 0; i<sb.length(); i++) {
            if (s1.contains(sb)) break;
            else {
                s1.add(sb.charAt(i));
            }
        }
    }
}
