/**
 * Created by sony on 4/18/2016.
 * Given a n values...find it's sum.
 */
import java.util.*;
public class SumOfNValues {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int sum = 0;
        for(int i = 1 ; i <= n; i++){
             sum += i;
            System.out.println(sum);
        }
    }
}
