/**
 * Created by sony on 4/26/2016.
 * Given a number n ...find the nth number which is a power of 5.
 */
import java.util.*;
public class MagicNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Math.pow(5,n));

    }
}
