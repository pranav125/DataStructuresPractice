/**
 * Created by sony on 4/16/2016.
 * Given an Array... find that element whose value is equal to that of its index value.
 */
import java.util.*;

public class ValueEqualToIndexValue {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == j ){
                System.out.print(nums[j]+" ");
            }
        }
    }
}
