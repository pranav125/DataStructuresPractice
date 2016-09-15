/**
 * Created by sony on 4/26/2016.
 * Given an array...add 1 to all elements.
 */
import java.util.*;
public class Adding1ToArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arrLength = in.nextInt();
        int[] nums = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            nums[i] = in.nextInt();
        }
        String s = Arrays.toString(nums).replace(" ","").replace(",","").replace("[","").replace("]","").trim();
        int n = Integer.parseInt(s);
        int sum = n + 1;
        System.out.println(sum);
        List<Integer> list = new ArrayList<Integer>();
        while(sum > 0) {
            list.add(sum%10);
            sum/=10;
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
