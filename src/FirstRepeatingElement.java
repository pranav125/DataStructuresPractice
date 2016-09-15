/**
 * Created by sony on 4/25/2016.
 * Given an array...find the first repeating element with less index number.
 */
import java.util.*;
public class FirstRepeatingElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        int earlyIndex = 0;
        for(int i = 0 ; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    earlyIndex = i;
                    System.out.println(earlyIndex);
                    break;
                }
                continue;
            }
        }

    }
}
