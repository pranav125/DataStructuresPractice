/**
 * Created by sony on 4/17/2016.
 * Given a string...find all permutations of it.
 */
import java.util.*;
public class PermutaionOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        permutation("", s);
    }
    public static void permutation(String prefix, String s){
        int n = s.length();
        if(n==0) System.out.println(prefix);
        else{
            for(int i = 0; i < n; i++){
                permutation(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1,n));

            }
        }
        System.out.print(s+" ");

    }
}
