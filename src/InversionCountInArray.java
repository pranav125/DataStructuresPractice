/**
 * Created by sony on 5/8/2016.
 * Given an array...find count of inversions.
 */
import java.util.*;
public class InversionCountInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int count = 0;
        for(int i = 0 ; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length - 1 ; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
