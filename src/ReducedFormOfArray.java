/**
 * Created by sony on 6/5/2016.
 * Given an array...find the reduced form of array.
 */
import java.util.*;
public class ReducedFormOfArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int[] temp = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            int count = Math.abs(arr[i]/arr[1]);
            temp[i] = count;
            //System.out.print(" "+count);
        }
        for(int i = 0; i < temp.length; i++){
            System.out.print(" "+temp[i]);
        }
    }
}
