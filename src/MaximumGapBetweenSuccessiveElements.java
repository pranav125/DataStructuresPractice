/**
 * Created by sony on 4/26/2016.
 * Given an array...find the maximum gap between successive elements.
 */
import java.util.*;
public class MaximumGapBetweenSuccessiveElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length-1; i++){
            list.add(nums[i + 1] - nums[i]);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() -  1));
    }
}
