/**
 * Created by sony on 6/6/2016.
 * Given an array...find the number in array which is on the left side.If the smaller number is no present...print -1.
 */
import java.util.*;
public class SmallerElementOnLeft {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int[] arr1 = new int[arrLength];
        int count = 0;
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 0; i < arr.length; i++){
            while(!s.empty() && s.peek() >= arr[i]){
                s.pop();
                count++;
            }
            if(s.empty()){
                System.out.print("-1");
            }
            else{
                System.out.print(" "+s.size());
            }
            s.push(arr[i]);
        }

//        for(int i = 1; i < arr.length; i++){
//            arr1[0] = -1;
//            int j;
//            for(j = i - 1; j >=0; j--){
//                if(arr[j] < arr[i]){
//                    count++;
//                    System.out.println(count);
//                    arr1[i] = count;
//                }
//                count = 0;
//            }
//
//            if(j == -1){
//               arr[i] = -1;
//            }
//        }
//        for(int i =0; i < arr1.length; i++){
//            System.out.print(" "+arr1[i]);
//        }
    }
}
