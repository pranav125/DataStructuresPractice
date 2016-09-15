/**
 * Created by sony on 4/15/2016.
 * Swap 2 array elements  kth from beginning and kth from end.
 */
import java.util.*;

public class Swap2ArrayElements {
  public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int arrLength = in.nextInt();
      int[] nums = new int[arrLength];
      int k = in.nextInt();
      int temp = 0;
      for(int i = 0; i < nums.length; i++){
          nums[i] = in.nextInt();
      }

          temp = nums[k];
          nums[k] = nums[nums.length-1-k];
          nums[nums.length-1-k] = temp;
      for(int j = 0; j < nums.length; j++) {
          System.out.print(nums[j]+" ");
      }
  }
}
