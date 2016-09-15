/**
 * Created by sony on 4/22/2016.
 * Given a set of nos...find whether it can be divided into 2 subsets of equal length.
 */
import java.util.*;
public class SubSetSumProblem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i++){
            sum += nums[i];
        }
        if(sum == nums[nums.length - 1]){
            System.out.println("2 subsets are possible.");
        }
        else{
            System.out.println("2 subsets are not possible.");
        }
    }
}