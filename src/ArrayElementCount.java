/**
 * Created by sony on 4/14/2016.
 * Given an array and number --- count the number of occurrences of that number
 */
import java.util.*;

public class ArrayElementCount {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int noOfArrayElements = in.nextInt();
        int[] nums = new int[noOfArrayElements];
        for(int i = 0; i < noOfArrayElements; i++){
            nums[i] = in.nextInt();
        }
        int arrcount = count(nums,number);
        System.out.println(arrcount);

    }

    public static int count(int nums[], int number){
        int arrcount = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] == number){
               arrcount++;
           }
       }
        return arrcount;
    }
}
