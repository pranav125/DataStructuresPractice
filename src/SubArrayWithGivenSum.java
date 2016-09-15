/**
 * Created by sony on 4/20/2016.
 * Array...SubArray with given sum
 */
import java.util.*;
public class SubArrayWithGivenSum {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            //int arrLength = in.nextInt();
            //int[] nums = new int[arrLength];
//            int k = in.nextInt();
//            for(int i = 0; i < nums.length; i++){
//                nums[i] = in.nextInt();
//            }
//            Stack<Integer> s = new Stack<Integer>();
//            int sum = 0;
//            int place = 0;
//            for(int i = nums.length - 1; i >= 0; i--){
//                s.push(nums[i]);
//                sum += nums[i];
//                System.out.println(sum);
//                if(sum == k){
//                    place = i;
//                    break;
//                }
//            }
//            System.out.println(place+" "+arrLength);

            int nums[] = {1, 2, 3, 4, 5};
            int curr_sum = nums[0];
            //int sum = in.nextInt();
            int sum = 9;
            int start = 0;
//            for(int i = 0; i <= nums.length; i++) {
//                nums[i] = in.nextInt();
//            }

            for( int i = 1; i <= nums.length; i++){
                while(curr_sum > sum && start < i - 1 ){
                    curr_sum = curr_sum - nums[start];
                    start++;
                }
                int start1 = i - 1;
                if(curr_sum == sum){
                    System.out.println("Sum found between indexes "+start+" "+start1);
                }
                if(i < nums.length){
                    curr_sum = curr_sum + nums[i];
                }
            }
            System.out.println("No Subarray found.");
        }

}
