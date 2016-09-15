/**
 * Created by sony on 4/17/2016.
 * Given an array...rotate it by d numbers. 2 3 4 5 6 6
 */
import java.util.*;
public class RotateArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        int d = in.nextInt();
        int[] nums1 = new int[arrLength];
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
//        for(int i = 0; i < nums.length / 2; i++){
//            int temp = nums[i];
//            nums[i] = nums[nums.length - i - 1];
//            nums[nums.length - i - 1] = temp;
////        }
//        for(int i = 0; i < d/2; i++){
//            int temp1 = nums[i];
//            nums[i] = nums[d - i - 1];
//            nums[d - i - 1] = temp1;
//        }
//        for(int i = 0; i < nums.length; i++){
//            System.out.print(nums[i]+" ");
//        }
       Stack<Integer> s = new Stack<Integer>();

        for(int i = 0; i < nums.length; i++){
            s.push(nums[i]);
        }
        for(int i = d - 1; i >=0; i-- ){
            nums[i] = s.pop();
        }
        for(int i = nums.length - 1; i >= d; i--){
            nums[i] = s.pop();
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
//        for(int j = d; j < nums.length/2; j++){
//                int temp2 = nums[j];
//                nums[j] = nums[nums.length - j - 1];
//                nums[nums.length - j - 1] = temp2;
//        }
//        for(int i = 0; i < nums.length; i++){
//            System.out.print(nums[i]+" ");
//        }
//        for(int i = 0; i < d; i++){
//            nums1[i] = nums[i];
//        }
//        for(int i = 0; i < nums.length; i++){
//            nums[i] = nums[i + d];
//        }
//
//        for(int i = nums.length - d; i<nums.length; i++ ){
//            for(int j = 0; j <nums1.length;j++){
//                nums[i] = nums[j];
//            }
//        }
//        for(int i = 0; i < nums.length; i++){
//            System.out.print(nums[i]+" ");
//        }


//        for(int j = d; j < nums.length; j++){
//            for(int i = 0; i < nums1.length; i++){
//                nums1[i] = nums[j];
//            }
//        }
//        for(int j = 0; j < d; j++){
//            for(int i = 0; i < nums1.length; i++)
//        }
    }
}
