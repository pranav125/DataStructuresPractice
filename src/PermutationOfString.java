/**
 * Created by sony on 8/26/2016.
 */
import java.util.*;
public class PermutationOfString {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
        public static void rotate(int[] nums, int k){
            List<Integer> list = new ArrayList<>();
            for (int i = nums.length - k; i < nums.length; i++) {
                list.add(nums[i]);
            }
            for (int i = 0; i < nums.length - k; i++) {
                list.add(nums[i]);
            }
            //Object[] arr = list.toArray();
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
        }
}