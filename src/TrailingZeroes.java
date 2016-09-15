/**
 * Created by sony on 7/12/2016.
 * Given an number..find the trailing zeroes in factorial n.
 */
import java.util.*;
public class TrailingZeroes {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tz = trailingZeroes(n);
        System.out.println(tz);
    }
    public static int trailingZeroes(int n) {
        int num = fact(n);
        String s = Integer.toString(num);
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = '0';
            if (s.charAt(i) == '0') {
                count++;
            } else {
                break;
            }

        }
        return count;
    }
    public static int fact(int n){
        if(n == 0) return 1;
        else return n*fact(n-1);
    }
}
