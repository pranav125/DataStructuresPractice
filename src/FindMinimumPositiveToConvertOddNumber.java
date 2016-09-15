/**
 * Created by sony on 4/20/2016.
 * Given a number n...find the minimum +ve integer by which it should be divided so that the result is odd number.
 */
import java.util.*;
public class FindMinimumPositiveToConvertOddNumber {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int count = 0;
            int[] n1 = new int[n];
//            for(int i = 1; i <=n1.length ; i++){
//                if(i % 2 != 0){
//                    n1[i] = i;
//                }
//            }
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum = n/i;
                    if(sum % 2 != 0){
                        System.out.println(i);
                        break;
                    }

                }
        }
}
