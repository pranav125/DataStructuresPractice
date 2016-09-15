/**
 * Created by sony on 4/22/2016.
 * Given an array...Move all 0 at the end of the array.
 */
import java.util.*;
public class MoveAllZeroesToEndOfArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
            if(nums[i] == 0){
                s.push(nums[i]);
            }
        }
        for(int i = nums.length - 1; i >= 0;i--){
            if(nums[i] != 0){
                s.push(nums[i]);
            }
        }
       for( int i = 0; i < nums.length; i++){
           nums[i] = s.pop();
           System.out.print(nums[i]+" ");
       }

    }
}
