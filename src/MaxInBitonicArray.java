/**
 * Created by sony on 5/7/2016.
 *Given an bitonic array....find the max. number in that array...
 */
import java.util.*;
public class MaxInBitonicArray {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
