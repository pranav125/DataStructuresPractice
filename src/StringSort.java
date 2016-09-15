/**
 * Created by sony on 4/17/2016.
 * Given a string...sort it's characters.
 */
import java.util.*;
public class StringSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] arr = s.toLowerCase().toCharArray();
        Arrays.sort(arr);
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
