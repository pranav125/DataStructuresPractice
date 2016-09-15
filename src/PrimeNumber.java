/**
 * Created by sony on 4/18/2016.
 * Find a no. is prime or not.
 */
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count =2;
        for( int i = 2; i < n; i++){
            if(n % i == 0){
                count++;
            }

        }
        if(count == 2){
            System.out.println("Number is a prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
