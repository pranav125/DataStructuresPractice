/**
 * Created by sony on 4/21/2016.
 * Given an array of elements...find the those elements who are maximum with minimum difference.
 */
import java.util.*;
public class FacingTheSun {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        for(int i = arrLength - 1; i > 0; i--){
            if(nums[i] - nums[i - 1] == 1){
                System.out.println(" "+nums[i]+" "+nums[i-1]);
            }
            else{
                break;
            }
        }
    }
}
