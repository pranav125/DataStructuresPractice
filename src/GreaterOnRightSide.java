/**
 * Created by sony on 4/21/2016.
 * Given an array...replace every element with the greatest element on the right side. If not available..replace with -1.
 */
import java.util.*;
public class GreaterOnRightSide {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
//        int temp[] = new int[arrLength];
//        int i = nums[0];
//        for(int j = 1; j < nums.length; j++){
//            if(i < nums[j]){
//                nums[i] = nums[j];
//            }
//            else{
//                i = nums[j];
//            }
         int size = nums.length;
        int max_from_Right = nums[size - 1];
        nums[size - 1] = -1;
        for(int i = size - 2; i >= 0; i--){
            int temp = nums[i];
            nums[i] = max_from_Right;
            if(max_from_Right < temp) max_from_Right = temp;
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
    }

