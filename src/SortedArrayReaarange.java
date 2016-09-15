/**
 * Created by sony on 4/17/2016.
 * Given an sorted array...reaarange it such that max num, min num, second max, second min... so on.
 * 1 2 3 4 5 6
 */
import java.util.*;
public class SortedArrayReaarange {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int[] rearr = new int[arrLength];
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        for(int i = arrLength/2; i < arrLength; i++){
            s1.push(arr[i]);
        }
        for(int j = arrLength/2 - 1; j >= 0; j--){
            s2.push(arr[j]);
        }
        for(int i = 0; i < rearr.length; i = i+2){
            rearr[i] = s1.pop();
            rearr[i+1] = s2.pop();
        }
        for(int i = 0; i <rearr.length; i++){
            System.out.print(rearr[i]+" ");
        }
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < rearr.length; j++){
//                rearr[j] = arr[arrLength - 1];
//
//            }
//        }
    }
}
