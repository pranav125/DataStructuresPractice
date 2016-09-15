/**
 * Created by sony on 4/21/2016.
 * Given a sum of 2 nos. which are represented as different arrays.
 */
import java.util.*;
public class SumOf2NosRepresentedAsArrays {
    public static void main(String[] s){
        Scanner in = new Scanner(System.in);
        int arrLength1 = in.nextInt();
        int arrLength2 = in.nextInt();
        int[] arr1 = new int[arrLength1];
        int[] arr2 = new int[arrLength2];
        //List<Integer> list1 = new ArrayList<Integer>();
        //List<Integer> list2 = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = in.nextInt();
            //list1.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = in.nextInt();
           // list2.add(arr2[i]);
        }
          for(int i : arr1){
              sb.append(i);
          }
            String str1 = sb.toString();
            sb.setLength(0);
            for(int i : arr2){
                sb.append(i);
            }
            String str2 = sb.toString();
            int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
            System.out.print(sum);
     }
}
