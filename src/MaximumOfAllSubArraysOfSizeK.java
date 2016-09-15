/**
 * Created by sony on 4/21/2016.
 * Given an Array...find the maximum element in every sub-array of size k.
 */
import java.util.*;

public class MaximumOfAllSubArraysOfSizeK {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[arrLength];
        int[] newArr = new int[arrLength];
        for(int i = 0 ; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        int max = 0;
        for(int i = 0; i <= nums.length - k; i++){
            max = nums[i];
            for(int j = 1; j < k; j++){
                if(nums[i+j] > max){
                    max = nums[i+j];
                }
            }
            System.out.println(max);
        }
    }
}
