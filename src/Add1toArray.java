/**
 * Created by sony on 5/9/2016.
 * Given an array...add one to the number with elements of array.
 */
import java.util.*;
public class Add1toArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLenght = in.nextInt();
        int[] arr = new int[arrLenght];
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arrLenght; i++){
            arr[i] = in.nextInt();
            list.add(arr[i]);
        }
        String s = list.toString().replace('[',' ').replace(']',' ').replace(',',' ').replace(" ","");
        System.out.println(s);
        int m = Integer.parseInt(s);
        int sum = m + 1;
        System.out.println(sum);
    }
}
