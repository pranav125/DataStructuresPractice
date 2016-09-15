/**
 * Created by sony on 4/16/2016.
 * how many integers from 1 to N contains 0 as a digit.
 *
 */
import java.util.*;

public class CountOfZerosfrom1ToN {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        CharSequence cs1 = "0";
        for(int i = 1; i <= n; i++){
//            if(i % 10 == 0){
//                count++;
//            }
            String s = String.valueOf(i);
            if(s.contains(cs1)) count++;
            /*
            Below code counts total number of zeros and above code is for count of numbers with atleast one zero.
             */
//            for(int j = 0; j < s.length();j++) {
//                if (s.charAt(j) == '0'){
//                    count++;
//                }
//            }
        }
        System.out.println(count);
    }
}
