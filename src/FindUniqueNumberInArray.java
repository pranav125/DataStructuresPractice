/**
 * Created by sony on 6/6/2016.
 * Given an array...find the unique number in an array.
 */
import java.util.*;
public class FindUniqueNumberInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        HashSet<Integer> s = new HashSet<Integer>();
        int num = 0;
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
       for(int item : arr) {
           if (!s.remove(arr[item])) {
               // num = arr[i];
               s.add(arr[item]);
               //System.out.print(" "+num);
           }

       }
        assert s.size() == 1;
        System.out.println(s.iterator().next());

    }
}
