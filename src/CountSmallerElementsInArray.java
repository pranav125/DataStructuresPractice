import java.util.Scanner;

/**
 * Created by sony on 4/20/2016.
 * Given an array...count the number of elements right of each element.
 */
public class CountSmallerElementsInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        int[] sum = new int[arrLength];
        for(int i = 0; i < nums.length; i++){
            sum[i] = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    sum[i]++;
                }
            }

        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(sum[i]+" ");
        }
    }

}
