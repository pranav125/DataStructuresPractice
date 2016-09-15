/**
 * Created by sony on 4/15/2016.
 * Given 2 arrays...get the union of 2 arrays with single occurrence of an element.
 */
import java.util.*;

public class UnionOf2Arrays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrlength = in.nextInt();
        int[] nums1 = new int[arrlength];
        int[] nums2 = new int[arrlength];
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = in.nextInt();
            s.add(nums1[i]);

        }
        for(int j = 0; j < nums2.length; j++){
            nums2[j] = in.nextInt();
            s.add(nums2[j]);
        }

        System.out.println(s);
        //s.add
    }
}
