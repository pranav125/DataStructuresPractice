/**
 * Created by sony on 6/5/2016.
 * Given 2 araays...find the maximum sum path between two arrays(from begin of 1st array to end of 2nd array).
 */
import java.util.*;
public class MaximumSumOfPathBetween2Arrays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr1 = new int[arrLength];
        int[] arr2 = new int[arrLength];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = in.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = in.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum = 0;
        int sum1 = 0;
        for(int i = 0; i < arr1.length; i++){
            sum+=arr1[i];
            System.out.print(" "+sum);
        }
        for(int j =0; j < arr2.length; j++){
            sum1+=arr2[j];
            System.out.print(" "+sum1);
        }
        int last = sum + sum1;
        System.out.println(" "+last);
    }
}
