/**
 * Created by sony on 4/20/2016.
 * Find if the number is lucky or not...
 * Ex: 23 --- 2 , 3 , 23 --- product of each digit should be different from others.
 */
import java.util.*;

public class LuckyNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = n;
        List<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        while(n > 0){
            list.add(n%10);
            hs.add(n%10);
            n/=10;
        }

        Collections.reverse(list);


        hs.add(num);
        int mul = 0;
        for(int i = 0; i < list.size() - 1; i++){
           mul = list.get(i) * list.get(i+1);
            hs.add(mul);
        }
        list.add(num);
        System.out.println(""+list);
        System.out.println(hs);
        if(hs == list) System.out.println("Number is not lucky");
        else System.out.println("Number is lucky.");

    }
}
