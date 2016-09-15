/**
 * Created by sony on 5/8/2016.
 * Given an array...find the number of elements with same sum and product.
 */
import java.util.*;
public class EqualSumAndProduct {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int count  = arrLength - 1;

        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
            //count++;
        }
        //int first = ;
        //int second = arr[1];
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < arr.length - 1; i++){
            list.add(arr[i]);
            sum += arr[i];
            prod *= arr[i];
            if(sum == prod) {
                count++;
            }
        }
        System.out.println(count);
    }
}
