/**
 * Created by sony on 4/18/2016.
 * Given an array with n elements...find the first occurrence of k.
 */
import java.util.*;
public class SearchAnArrayElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0 ; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        for( int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                System.out.println("Number found at "+i+" position.");
                break;
            }
        }
    }
}
