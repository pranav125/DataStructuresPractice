/**
 * Created by sony on 4/16/2016.
 * Given an array...reverse a sub-array in it.
 */
import java.util.*;

public class ReverseSubArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i=0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        int firstIndex = in.nextInt();
        int lastIndex = in.nextInt();
        int temp = 0;
        for(int j = nums[firstIndex]; j <= nums[lastIndex];j++){
            temp = nums[firstIndex];
            nums[firstIndex] = nums[lastIndex];
            nums[lastIndex] = temp;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
