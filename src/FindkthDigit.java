/**
 * Created by sony on 4/18/2016.
 * Given 2 nos. a & b ... find kth digit from right after a^b.
 */
import java.util.*;

public class FindkthDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();
        int k = in.nextInt();
        Double result = new Double(Math.pow(a,b));
        int res = result.intValue();
       // System.out.println(result);

        List<Integer> dig = new ArrayList<Integer>();
        while(res > 0){
            dig.add(res % 10);
            res /= 10;
        }
        Collections.sort(dig);

        System.out.println(dig);
        int num = dig.get(k-1);
        System.out.println(num);
//        int digit = 0;
//        if(k == 1){
//            digit = res % 10;
//        }
//        else{
//            digit = res/10;
//        }
//        System.out.println(digit);
    }
}
