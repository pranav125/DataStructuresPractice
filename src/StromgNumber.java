/**
 * Created by sony on 4/22/2016.
 * Given a number...find if the sum of the factorial of it's digits is the the number itself.
 */
import java.util.*;
public class StromgNumber {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        List<Integer> list = new ArrayList<Integer>();
        while(n > 0){
            list.add(n % 10);
            n/=10;
        }
        int total = 0;
        for(int i = 0; i < list.size(); i++){
            int sum = fact(list.get(i));
            total+=sum;
        }
        System.out.println(total);
        if(total == m){
            System.out.println("Number is strong.");
        }
        else{
            System.out.println("Number is not strong.");
        }
    }
    public static int fact(int n){
        if(n == 0) return 1;
        else{
            return n * fact(n-1);
        }
    }
}
