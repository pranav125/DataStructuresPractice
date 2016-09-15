/**
 * Created by sony on 4/17/2016.
 * Given an array with elements 1 - n...find the missing in it.
 */
import java.util.*;

public class MissingNumberInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int miss = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] != 1){
                 miss = arr[i] + 1;
                System.out.println(miss);
            }
        }
    }
}
