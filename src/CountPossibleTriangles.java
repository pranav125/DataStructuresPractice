/**
 * Created by sony on 4/17/2016.
 * Given an array with n elements...find number of possible triangles with 3 different elements.
 */
import java.util.*;
public class CountPossibleTriangles {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n -2; ++i){
            int k = i + 2;
            for(int j = i + 1; j < n; ++j){
                while(k < n && arr[i] + arr[j] > arr[k]){
                    ++k;
                }
                count += k - j - 1;
            }
        }
        System.out.print(count);
    }
}
