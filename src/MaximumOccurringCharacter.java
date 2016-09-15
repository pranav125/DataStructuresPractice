/**
 * Created by sony on 4/19/2016.
 * Given a string...find the character which occur maximum times...if more characters repeat then print lexicographically smaller character.
 */
import java.util.*;

public class MaximumOccurringCharacter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] arr = s.toLowerCase().toCharArray();
        Arrays.sort(arr);
        int count = 1;
        int max = 0;
        int maxChar = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
                //System.out.print(arr[i]+" ");
            }
            else{
               if(count > max){
                   max = count;
                   maxChar = arr[i-1];
               }
                count = 1;
            }
        }
        if(count > max){
            max = count;
            maxChar = arr[arr.length - 1];
        }
        String charMax = Character.toString((char) maxChar);
        System.out.println("Longest run: "+max+",for the character "+charMax );
    }
}
