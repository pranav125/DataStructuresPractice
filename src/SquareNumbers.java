/**
 * Created by sony on 6/4/2016.
 * Given a number...find the square numbers less than the number.
 */
import java.util.*;
public class SquareNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            double num = Math.sqrt(i);
            if (num*num == i) {
                count++;
                //System.out.println(j);
            }
        }

        System.out.println(count);
    }
}
