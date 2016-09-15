/**
 * Created by sony on 4/17/2016.
 * Given a number...find if that number is fibonacci number.
 */
import java.util.*;

public class FibonacciNumberCheck {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num < 0) System.out.println("Enter positive number");
        else{
            int a = 0, b = 1, c =0;
            while(c < num){
                c = a + b;
                a = b;
                b = c;
            }
            if(c == num) System.out.println("Number is fibonacci.");
            else System.out.println("Number is not fibonacci");
        }
//        int sum = 0;
//        for(int i = 0; i < num; i++){
//            sum = i+(i+1);
//            if(sum == num) break;
//        }
//        if(sum == num){
//            System.out.print("Number is a fibonacci number.");
//        }
//        else{
//            System.out.println("Number is not a fibonacci number.");
//        }


    }
//    public static long fib(int num){
//        if(num <= 1) return num;
//        else return fib(num-1) + fib(num-2);
//    }
}
