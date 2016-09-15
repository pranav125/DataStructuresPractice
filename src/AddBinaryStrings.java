/**
 * Created by sony on 6/3/2016.
 */
import java.util.*;
public class AddBinaryStrings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int n1 = Integer.parseInt(s1, 2);
        int n2 = Integer.parseInt(s1, 2);
        int sum = n1 + n2;
        System.out.println(sum);
        String s = Integer.toBinaryString(sum);
        System.out.println(s);
    }
}
