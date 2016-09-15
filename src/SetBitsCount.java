/**
 * Created by sony on 4/16/2016.
 * Given a number n...find the total number of set bits(no. of bit 1)...
 */
import java.util.*;

public class SetBitsCount {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
       // System.out.print(Integer.toBinaryString(4));
        for(int i =1; i <= n; i++) {
            String s = Integer.toBinaryString(i);
            System.out.print(" "+s);
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '1'){
                    count++;

                }

            }
        }
        System.out.println(" "+ '\n'+count);
    }
}
