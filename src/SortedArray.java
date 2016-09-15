/**
 * Created by sony on 4/18/2016.
 * Given an unsorted array...make it sorted.
 */
import java.util.*;

public class SortedArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i =0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        int temp = 0;
        for(int i = 1; i < nums.length; i++){
            for(int j = i; j > 0; j--){
                if(nums[j] < nums[j - 1]){
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j-1] = temp;
                }
            }
        }
        for(int i = 0 ; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
