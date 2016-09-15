/**
 * Created by sony on 5/18/2016.
 * Given a base and a number in that base...increment number by 1 and print the resulting number in that base.
 */
import java.util.*;
public class IncrementNumberWithBase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        String s = in.nextLine();
        int m = Integer.parseInt(s,base);
        m = m + 1;
        System.out.println(m);
        String n = Integer.toString(m,base);
        System.out.println(n);
    }
}
