/**
 * Created by sony on 5/18/2016.
 * Given a number...find whether it's multiple of 3.
 */
import java.util.*;
public class BinaryNumberMultipleOf3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toString(n);
        int n1 = Integer.parseInt(s,2);
        System.out.println(n1);
        if(n1 % 3 == 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
