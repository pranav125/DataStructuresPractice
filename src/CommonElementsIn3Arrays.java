/**
 * Created by sony on 4/21/2016.\
 *Given 3 arrays...find the common elements in them.
 */
import java.util.*;
public class CommonElementsIn3Arrays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength1 = in.nextInt();
        int arrLength2 = in.nextInt();
        int arrLength3 = in.nextInt();
        int[] arr1 = new int[arrLength1];
        int[] arr2 = new int[arrLength2];
        int[] arr3 = new int[arrLength3];
        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();
        HashSet<Integer> s3 = new HashSet<Integer>();
        for(int i = 0; i < arrLength1; i++){
            arr1[i] = in.nextInt();
            s1.add(arr1[i]);
        }
        for(int i = 0; i <arrLength2; i++){
            arr2[i] = in.nextInt();
            s2.add(arr2[i]);
        }
        for(int i = 0; i <arrLength3;i++){
            arr3[i] = in.nextInt();
            s3.add(arr3[i]);
        }
        s1.retainAll(s2);
        s1.retainAll(s3);
        System.out.println(s1);
    }
}
