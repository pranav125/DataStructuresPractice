/**
 * Created by sony on 4/16/2016.
 * Given 2 Integers...find the no of bits that need to be changed to covert 1st number into second number.
 */
import java.util.*;
import java.util.stream.Collector;

public class BitDifference {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        long count = 0;
//        for( int c = a ^ b; c!=0; c = c >> 1){
//            count = count + c & 1;
//        }
//        System.out.println(count);
        String a1 = Integer.toBinaryString(a);
        String b1 = Integer.toBinaryString(b);
        System.out.println(a1);
        System.out.println(b1);
        //String newa1 =String.format("%03d",Integer.parseInt(a1));
        //System.out.println(newa1);

        int A = Integer.valueOf(a1);
        int B = Integer.valueOf(b1);
        String C = Integer.toBinaryString(A ^ B);
        //String newC = String.format("%01d",Integer.parseInt(C));
        System.out.println(C);
        for(int i = 0; i < C.length(); i++){
            if(C.charAt(i) == '1'){
                count++;
            }
        }
//        System.out.println(count);
//        for(int i = 0; i < newa1.length(); i++){
//            for(int j = 0; j < b1.length(); j++){
//                int num1 = Character.digit(a1.charAt(i),10);
//                //System.out.print(num1);
//                int num2 = Character.digit(b1.charAt(j),10);
//                if(num1 != num2 ){
//                    count++;
//                }
//            }
//        }
       // System.out.println(count);

    }
}
