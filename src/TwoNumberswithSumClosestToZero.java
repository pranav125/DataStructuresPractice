/**
 * Created by sony on 4/22/2016.
 * Given an array...find the sum of 2 nos. which is closest to 0.
 */
import java.util.*;
public class TwoNumberswithSumClosestToZero {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        int[] nums1 = new int[arrLength];
        int min_l = 0, min_r = 1;
        int temp = 0;
        int min_sum = nums[0] + nums[1];
        for(int i = 0; i < nums.length - 1; i++){
            for(int k = i+1 ; k < nums.length;k++){
                temp = nums[i] + nums[k];
                //System.out.print(temp+" ");
                if(Math.abs(min_sum) > Math.abs(temp)){
                    min_sum = temp;
                    min_l = i;
                    min_r = k;

                }
            }
        }
        System.out.print("Elements are "+nums[min_l]+" "+nums[min_r]);
    }
}
