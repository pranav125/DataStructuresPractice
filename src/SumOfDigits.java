/**
 * Created by sony on 4/19/2016.
 * Given a number...find the sum of it's digits.
 */
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while(n > 0){
            list.add(n % 10);
            n/=10;
        }
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
