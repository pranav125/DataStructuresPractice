/**
 * Created by sony on 4/25/2016.
 * Given a number...find the sum of all its digits till single digit.
 */
import java.util.*;

public class AddDigitsTillSingleDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        int rem;
        while(n > 9) {
            sum = 0;
            while (n > 0) {
                rem = n % 10;
                //list.add(n%10);
                sum += rem;
                n /= 10;
            }
            n = sum;
        }
        System.out.println(sum);
    }
}
