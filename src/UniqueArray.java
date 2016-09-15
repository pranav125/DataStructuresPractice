/**
 * Created by sony on 4/12/2016.
 *
 * Remove Duplicates from given array
 */
import java.util.*;
public class UniqueArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrlength = in.nextInt();
        int[] nums = new int[100];
        for(int i = 0; i < arrlength; i++){
            nums[i] = in.nextInt();
        }
        removeDuplicates(nums);
    }
    public static void removeDuplicates(int[] nums){
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < nums.length - 1; i++){
            s.add(nums[i]);
        }
        System.out.print("");
        int count = s.size();
       // return size;
        System.out.println(count);
    }
}
