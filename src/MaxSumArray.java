/**
 * Created by sony on 4/15/2016.
 * Given an array...find max sum of non-adjacent elements.
 */
import java.util.*;

public class MaxSumArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int j = 0; j < arr.length; j = j + 2 ){
            sum1 += arr[j];
            //System.out.print(sum1+" ");
        }
        for(int k = 1; k < arr.length; k = k + 2){
            sum2 += arr[k];
            //System.out.print(sum2);
        }

        if(sum1 > sum2 ){
            System.out.print(sum1);
        }
        else{
            System.out.print(sum2);
        }
    }
}
