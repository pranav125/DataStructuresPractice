/**
 * Created by sony on 4/16/2016.
 * Given a number..find if it is sparse or not.(means no 2 bits(1's) should be consecutive.
 */
import java.util.*;

public class SparseNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String s = Integer.toBinaryString(number);
        System.out.println(s);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
               System.out.println("No. is not sparse");
                break;
            }
            else{
                System.out.println("No. is sparse");
                break;
            }
        }

    }
}
