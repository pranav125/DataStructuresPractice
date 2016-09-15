/**
 * Created by sony on 4/19/2016.
 * Given an array...print the sum of it's elements.
 */
import java.util.*;

public class SumOfArrayElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        int sum = 0;
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            System.out.println(sum);
        }
    }
}
