/**
 * Created by sony on 4/19/2016.
 * Given an array...reverse it.
 */
import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
            list.add(nums[i]);
        }
        //First way

//        Collections.reverse(list);
//        for(int i = 0; i < list.size(); i++){
//            System.out.print(list.get(i)+" ");
//        }
        //System.out.print(list.toString()+" ");

        //Second way
        int temp = 0;
        for(int i = 0 ; i < nums.length/2; i++){
                temp = nums[i];
                nums[i] = nums[arrLength - 1 - i];
                nums[arrLength - 1 - i] = temp;
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
