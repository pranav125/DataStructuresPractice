/**
 * Created by sony on 4/15/2016.
 * Given a digit ... find no. of zeros between range of that digit no. (if digit is 2...then it will check between 10-99...
 */
import java.util.*;

public class CountZeroOfNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        double random = 9*(Math.pow(10,digit-1) - Math.pow(9,digit-1));
        System.out.println("No. of zeros in the range:"+Math.round(random));

    }
}
