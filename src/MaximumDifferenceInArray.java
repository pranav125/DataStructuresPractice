/**
 * Created by sony on 4/20/2016.
 * Given an array...find the difference between 2 elements such that the larger no. should be on right side.
 */
import java.util.*;

public class MaximumDifferenceInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0 ; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        int diff = 0;
        for(int i = 1; i < nums.length ; i++ ){
            for(int j = i - 1; j < i; j++){
                if(nums[i] > nums[j]){
                    diff = nums[i] - nums[j];
                    System.out.print(" "+diff);
                }
                else{
                    i++;
                    j++;
                }
            }
        }
    }
}
