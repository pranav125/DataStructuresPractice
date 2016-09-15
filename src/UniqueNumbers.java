/**
 * Created by sony on 6/17/2016.
 */
import java.util.*;
public class UniqueNumbers {
    public static int countNumbersWithUniqueDigits(int n) {
        List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 1; i < n; i++){
            //while(i > 0){
                list.add(i % 10);
                set.add(i % 10);
                i/=10;
            //}

            if(set.size() == list.size()) count++;
            list.clear();
            set.clear();
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int total = countNumbersWithUniqueDigits(n);
        System.out.println(total);
    }
}
