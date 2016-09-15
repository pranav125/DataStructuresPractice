/**
 * Created by sony on 4/19/2016.
 * Given a number...find it's factorial.
 */
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int factorial = fact(n);
        System.out.println(factorial);
    }
    public static int fact(int n){
        if(n == 0) return 1;
        else{
            return n * fact(n-1);
        }
    }
}
