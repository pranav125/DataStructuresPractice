/**
 * Created by sony on 4/25/2016.
 * Given 2 sorted arrays...merge them and give the sum of middle elements(n/2 + (n/2+1)).
1 2 4 4 5 6 6 9 10 12 */
import java.util.*;

public class SumOfMiddleElementsOf2SortedElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums1 = new int[arrLength];
        int[] nums2 = new int[arrLength];
        //int[] mergeArr = new int[arrLength*2];
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < arrLength; i++){
            nums1[i] = in.nextInt();
            list.add(nums1[i]);
        }
        for(int j = 0; j < arrLength; j++){
            nums2[j] = in.nextInt();
            list.add(nums2[j]);
        }
        Collections.sort(list);
        System.out.println(list);
        int sum = list.get(list.size()/2) + list.get(list.size()/2 - 1);
        System.out.println(sum);
    }
}
