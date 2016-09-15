/**
 * Created by sony on 6/2/2016.
 * Given an array...find the maximum repeating number in an array>>>
 */
import java.util.*;
public class MaxRepeatingNumberInAnArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(i)){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == Collections.max(map.values())){
                System.out.println(entry.getKey());
            }
        }
    }
}
