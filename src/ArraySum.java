/**
 * Created by sony on 5/1/2016.
 * Given an array and x...find their exists 2 elements between an array.
 */

import java.util.*;
public class ArraySum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        for(int i= 0; i < arrLength - 1; i++){
            for(int j = i+1; j < arrLength; j++){
                if(arr[i] + arr[j] == k){
                    System.out.println("Numbers exist with same sum as k");
                    break;
                }
            }
        }
    }
}
