/**
 * Created by sony on 4/26/2016.
 *Given a number...find the count of odd factors.
 */
import java.util.*;
public class OddNumberFactors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for(int i = 1; i <= n; i++){
           if(n % i == 0) {
               list.add(i);
           }

       }
        for(int i = 0; i <list.size(); i++) {
            if ((list.get(i) % 2) != 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
