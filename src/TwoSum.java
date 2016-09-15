/**
 * Created by sony on 8/15/2016.
 */
import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        int[] res = new int[2];
        int target = in.nextInt();
        for(int i = 0; i < arrLength; i++){
            arr[i] = in.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int index = map.get(arr[i]);
                res[0] = index;
                res[1] = i;
                break;
            }
            else{
                map.put(target - arr[i],i);
            }
        }
        for(int i = 0; i < res.length; i++){
            System.out.print(" "+res[i]);
        }
    }
}
