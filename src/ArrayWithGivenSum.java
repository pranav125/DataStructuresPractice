/**
 * Created by sony on 6/3/2016.
 * Given an array...find the subarray with the given sum.
 */
import java.util.*;
public class ArrayWithGivenSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int sum = in.nextInt();
        int cal = 0;
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        int currSum = arr[0];
        for(int i = 1; i <= arr.length; i++){
            while(currSum > sum && cal < i -1){
                currSum = currSum - arr[cal];
                cal++;
            }
            int start1 = i - 1;
            if(currSum == sum){
                System.out.println("Sum found between indexes "+cal+" "+start1);
            }
            if(i < arr.length){
                currSum = currSum + arr[i];
            }
        }
    }
}
