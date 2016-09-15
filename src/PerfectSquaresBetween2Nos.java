/**
 * Created by sony on 4/15/2016.
 * Given 2 nos. find nos. of perfect squares in range of 2 nos.
 */
import java.util.*;

public class PerfectSquaresBetween2Nos {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sqr = 0;
        for( int i = a; i <= b; i++ ){
            if((Math.sqrt(i))%1 == 0){
                sqr++;
            }
        }
        System.out.println(sqr);
    }
}
