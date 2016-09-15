/**
 * Created by sony on 4/19/2016.
 * Find number of factors of a number.
 */
import java.util.*;
public class NumberOfFactors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                System.out.print(""+i+" ");
                count++;
            }
        }
        System.out.println(" "+'\n'+count);
    }
}
