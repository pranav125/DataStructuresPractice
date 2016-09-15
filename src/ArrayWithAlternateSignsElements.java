/**
 * Created by sony on 4/17/2016.
 * Given an array with positive and negative nos...create an array of alternate positive and negative nos.
 */
import java.util.*;

public class ArrayWithAlternateSignsElements {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int arrLength = in.nextInt();
//        int[] nums1 = new int[arrLength];
//        int[] nums2 = new int[arrLength];
//        for(int i = 0; i < nums1.length; i++) {
//            nums1[i] = in.nextInt();
//        }
//        int i = -1, temp = 0;
//        for(int j = 0; j < arrLength; j++){
//            if(nums1[j] < 0){
//                i++;
//                temp = nums1[i];
//                nums1[i] = nums1[j];
//                nums1[j] = temp;
//            }
//        }
//
//        int pos = i+1, neg = 0;
//        while(pos < arrLength && neg < pos && nums1[neg] < 0 ){
//            temp = nums1[neg];
//            nums1[neg] = nums1[pos];
//            nums1[pos] = temp;
//            pos++;
//            neg += 2;
//        }
//        for(int j = 0; i < nums1.length; i++){
//            System.out.print(nums1[j]+" ");
//        }
////        Arrays.sort(nums1);
////        for(int i = 0; i < nums1.length; i++){
////            System.out.print(nums1[i]+" ");
////        }
////        int temp = 0;
////        for(int i = 0; i < nums1.length/2; i++){
////            for(int j = nums1.length - 1; j > i; j--) {
////                temp = nums1[i];
////                nums1[i] = nums1[j];
////                nums1[j] = temp;
////            }
////        }
////        for(int i = 0; i < nums1.length; i++){
////            System.out.println(nums1[i]+" ");
////        }
////        for(int i = 0; i < nums1.length; i++){
////            for (int j = 1; j < nums2.length; j = j+2) {
////                if(nums1[i] < 0 ){
////                    nums2[j] = nums1[i];
////                }
////                break;
////            }
////        }
////        for( int i = 0; i < nums1.length; i++){
////            for(int j = 0; j < nums2.length; j = j + 2){
////                if( nums1[i] > 0){
////                    nums2[j] = nums1[i];
////                }
////                break;
////            }
////        }
//
//
//    }

    static void rearrange(int arr[], int n)
    {
        // The following few lines are similar to partition
        // process of QuickSort.  The idea is to consider 0
        // as pivot and divide the array around it.
        int i = -1, temp = 0;
        for (int j = 0; j < n; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Now all positive numbers are at end and negative numbers at
        // the beginning of array. Initialize indexes for starting point
        // of positive and negative numbers to be swapped
        int pos = i+1, neg = 0;

        // Increment the negative index by 2 and positive index by 1, i.e.,
        // swap every alternate negative number with next positive number
        while (pos < n && neg < pos && arr[neg] < 0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
    }

    // A utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
    }

    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        rearrange(arr,n);
        System.out.println("Array after rearranging: ");
        printArray(arr,n);
    }

}
