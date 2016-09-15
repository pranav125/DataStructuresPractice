/**
 * Created by sony on 5/21/2016.
 * Given a number...find the count of number which don't contain 3.
 */
import java.util.*;
public class findTotalNumbersWithout3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {

            count = i%10;

            if(count!=3){
                System.out.println(count);
                list.add(count);
            }

        }
        System.out.println(list.size());
    }
}
