/**
 * Created by sony on 4/17/2016.
 * Given an array...count increasing subarrays of it which are increasing...
 */
import java.util.*;

public class CountIncreasingSubArrays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        //Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j <nums.length; j++){
                if(nums[j] > nums[j-1]){
                    count++;
                }
                else break;
            }
        }
        System.out.print(count);
    }
}
