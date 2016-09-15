/**
 * Created by sony on 4/22/2016.
 * Given an bitonic array...find the maximum element in an array.
 */
import java.util.*;
public class MaximumElementInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[nums.length - 1]);
    }
}
