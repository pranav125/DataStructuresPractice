/**
 * Created by sony on 5/7/2016.
 * Given an integer...convert it into bits and reverse them...
 */
import java.util.*;
public class ReverseBits {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String m = Integer.toBinaryString(n);
    int bin  = Integer.parseInt(m);
        System.out.println(bin);
        List<Integer> list = new ArrayList<Integer>();
        while(bin > 0){
            list.add(bin%10);
            bin /= 10;
        }

        System.out.println(list.toString().replace('[',' ').replace(',',' ').replace(']',' ').replace(" ",""));
    }
}
