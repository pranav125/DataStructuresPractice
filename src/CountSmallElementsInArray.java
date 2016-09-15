/**
 * Created by sony on 6/2/2016.
 * Given an array...find the small elements that are right to the current element.
 */
import java.util.*;
public class CountSmallElementsInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int[] arrCount = new int[arrLength];
        int count = 0 ;
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                    arrCount[i] = count;
                }

            }
        }
        for(int i = 0; i < arrCount.length; i++){
            System.out.print(" "+arrCount[i]);
        }
    }
}
