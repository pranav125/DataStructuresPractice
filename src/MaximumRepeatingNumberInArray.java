/**
 * Created by sony on 4/20/2016.
 * Given an array...find the maximum repeated element.
 */
import java.util.*;

public class MaximumRepeatingNumberInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int max = 0;
        int count = 1;
        int maxInt = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }
            else{
                if(count > max){
                    max = count;
                    maxInt = nums[i - 1];
                }
                count = 1;
            }

        }
        if(count > max){
            max = count;
            maxInt = nums[nums.length - 1];
        }
        System.out.println(maxInt);
    }
}
