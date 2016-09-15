/**
 * Created by sony on 4/16/2016.
 * Given an array...find the maximum product of 2 nos.
 */
import java.util.*;

public class MaxProductInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int maxProduct = nums[arrLength - 1] * nums[arrLength - 2];
        System.out.println(maxProduct);
    }
}
