/**
 * Created by sony on 4/15/2016.
 * Given 2 arrays...get the intersection of arrays
 */
import java.util.*;

public class IntersectionOf2Arrays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums1 = new int[arrLength];
        int[] nums2 = new int[arrLength];
        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = in.nextInt();
            s1.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++){
            nums2[j] = in.nextInt();
            s2.add(nums2[j]);
        }
        s1.retainAll(s2);
        System.out.println(s1);
    }
}
