/**
 * Created by sony on 4/27/2016.
 * Given an array...segregate even n odd numbers in sorted way.
 */
import java.util.*;
public class SegregateEvennOddNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0 ; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        int temp = 0;
        int left = 0, right = nums.length -1;
        while(left < right){
            while(nums[left] % 2 == 0 && left < right){
                left++;
            }
            while(nums[right] % 2 == 1 && left < right){
                right--;
            }
            if(left < right ){
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        for(int i = 0 ; i < nums.length; i++){
            System.out.print(" "+nums[i]);
        }
    }
}
