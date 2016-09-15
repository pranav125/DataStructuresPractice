/**
 * Created by sony on 4/22/2016.
 * Given an array and an element...double the element and print it's value.
 */
import java.util.*;
public class DoubleArrayElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == k){
                k = nums[i]+nums[i];
            }

        }
        System.out.println(k);
    }
}
