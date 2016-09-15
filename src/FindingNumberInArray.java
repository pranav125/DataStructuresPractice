/**
 * Created by sony on 4/22/2016.
 * Given a array...and a number...find it's index.
 */
import java.util.*;

public class FindingNumberInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int k = in.nextInt();
        for(int i = 0 ; i < arrLength; i++){
            arr[i] = in.nextInt();
            if(arr[i] == k){
                System.out.println(i);
            }
        }

    }
}
