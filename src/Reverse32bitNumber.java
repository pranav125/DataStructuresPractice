/**
 * Created by sony on 4/20/2016.
 * Reverse a 32-bit number.
 */
import java.util.*;
public class Reverse32bitNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 5;
        reverseBits(n);
        //System.out.println(reverseBits(n));
    }
    public static int reverseBits(int n){
        for(int i = 0; i < 16; i++){
            swapBits(n,i,32 - i - 1);
        }
        return n;
    }
    public static int swapBits(int n, int i, int j) {
        int a = (n >> i) & 1;
        int b = (n >> j) & 1;
        if ((a ^ b) != 0) {
             return n ^= (1 << i) | (1 << j);
        }
        return n;
    }
}
