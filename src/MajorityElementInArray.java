/**
 * Created by sony on 4/22/2016.
 * Given an array...find the majority element(occurred more than n/2 times).
 */
import java.util.*;
public class MajorityElementInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        int maxElement = 0;
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arrLength; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                count++;
                if(count > arrLength/2){
                    System.out.println(" "+'\n'+arr[i]);
                }
            }
            //count  = 0;
        }
    }
}
