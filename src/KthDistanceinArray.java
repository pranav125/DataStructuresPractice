/**
 * Created by sony on 4/21/2016.
 * Given an unsorted array and k(smaller than size of array)...find if those k elements consists any duplicate values.
 */
import java.util.*;
public class KthDistanceinArray {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int arrLength = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[arrLength];
    for(int i = 0; i < arrLength; i++){
        arr[i] = in.nextInt();
    }
        HashSet<Integer> s = new HashSet<Integer>();
       for(int i = 0; i < arr.length;i++){
           if( i <= k){
               if(s.contains(arr[i])) System.out.println("True");
               else {
                   s.add(arr[i]);
                   System.out.println("False");
               }
           }
       }
    }
}
