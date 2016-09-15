/**
 * Created by sony on 4/16/2016.
 * given a number...swap it's nibble(0100 & 1001) and convert it into integer.
 */
import java.util.*;

public class Swap2NibblesInBytes {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String s = Integer.toBinaryString(num);
        String t = String.format("%8s", s).replace(' ','0');
        System.out.println(t);
        StringBuilder sb = new StringBuilder();
        for(int i = t.length()/2 ; i < t.length();i++){
            sb.append(t.charAt(i));
        }
        System.out.println(sb);
        for(int j = 0; j < t.length()/2; j++){
            sb.append(t.charAt(j));
        }
        System.out.println(sb);
        //int m = Integer.valueOf(sb.toString());
        int n = Integer.parseInt(sb.toString(),2);
        System.out.println(n);
    }
}
