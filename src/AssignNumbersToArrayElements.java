/**
 * Created by sony on 6/1/2016.
 * Find the digits which evenly divide the number.
 */
import java.util.*;
public class AssignNumbersToArrayElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        while(n > 0){
            list.add(n % 10);
            n/=10;
        }
        System.out.println(list);
        for(int i = 0; i < list.size();i++){
            if(list.get(i) % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
