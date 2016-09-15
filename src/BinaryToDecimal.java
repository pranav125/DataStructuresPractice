/**
 * Created by sony on 4/18/2016
 * Given a binary number...convert it to equivalent decimal number.
 */
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String binaryNumber = in.nextLine();
        int decimalNumber = Integer.parseInt(binaryNumber,2);
        System.out.println("Decimal equivalent of binary number "+binaryNumber+" is" +'\t'+decimalNumber);
    }
}
