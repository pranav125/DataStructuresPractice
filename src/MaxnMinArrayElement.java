/**
 * Created by sony on 4/19/2016.
 * Given an array...find a minimum and maximum element.
 */
import java.util.*;

public class MaxnMinArrayElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[0]+" "+nums[nums.length - 1]);
    }
}
