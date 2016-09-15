/**
 * Created by sony on 4/15/2016.
 * Sum of non-repeated elements in an array
 */
import java.util.*;

public class sumOfNonRepeatedElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        //HashSet<Integer> s = new HashSet<Integer>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
            //s.add(nums[i]);
        }

        for(int j = 0; j < nums.length; j++ ){
            boolean isDistinct = false;
            for(int k =0; k < j ; k++){
                if(nums[j] == nums[k]){
                    isDistinct = true;
                    break;
                }

            }
            if(!isDistinct){
                System.out.print(nums[j]+" ");
                sum = sum + nums[j];
            }

        }

        System.out.println("sum: "+sum);


    }
}
