/**
 * Created by sony on 4/19/2016.
 * Given an array...determine the frequency of elements from 1 to n.  1 2 2 3
 */
import java.util.*;
public class FrequencyOfArrayElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int[] temp = new int[arrLength];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            for(int j = i - 1; j < i; j++ ){
                if(nums[i] == nums[j]){
                    count++;
                    System.out.println(" "+count+" "+i);
                    for(int k = 1; i <= temp.length;k++ ){
                        temp[k] = count;
                        break;
                    }
                }
                else{
                    count = 1;
                }

            }

        }
        for(int i = 0; i <temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
