/**
 * Created by sony on 6/4/2016.
 * Given a binary number...find if it is a multiple of 3.
 */
import java.util.*;
public class BinaryNumberMultiple3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int m = Integer.parseInt(n,2);
        if(m % 3 == 0){
            System.out.println("Binary number is the multiple of 3.");
        }
        else{
            System.out.println("Binary Number is not the multiple of 3.");
        }
    }
}
