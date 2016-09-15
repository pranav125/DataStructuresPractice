/**
 * Created by sony on 4/20/2016.
 * Given 2 binary strings...add them.
 */
import java.util.*;

public class Add2BinaryStrings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int n1 = Integer.parseInt(s1, 2);
        int n2 = Integer.parseInt(s2, 2);
        System.out.println(n1+" "+n2);
        int sum = n1 + n2;
        String s = Integer.toBinaryString(sum);
        System.out.println(s);
    }
}
