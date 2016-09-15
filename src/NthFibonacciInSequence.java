/**
 * Created by sony on 4/15/2016.
 * A Fibonacci series (starting from 1) written in order without any spaces in between,
 * thus producing a sequence of digits. Find the Nth digit in the sequence.
 */
import java.util.*;

public class NthFibonacciInSequence {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int sum = 0;
       // String s = String.valueOf(n).split('');
//        for(int i = 0; i < s.length(); i++){
//            sum = Integer.valueOf(s.charAt(i) + s.charAt(s.length() - 1));
//        }
        int firstInt = n / 10;
        int secondInt = n % 10;
        if(firstInt == 0){ secondInt = secondInt - 1;}
        sum = firstInt + secondInt;
        System.out.print(sum);
    }
}
