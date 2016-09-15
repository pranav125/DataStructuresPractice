/**
 * Created by sony on 4/22/2016.
 * Given an array...find the difference between all elements.
 */
import java.util.*;
public class DifferenceBetweenArrayElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for( int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                temp = nums[j] - nums[i];
                System.out.println(temp);
            }

        }

    }
}
