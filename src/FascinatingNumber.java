/**
 * Created by sony on 4/17/2016.
 * Given a number...find whether it is fascinating or not.
 * Entered number should be of 3 digits only.
 */
import java.util.*;
public class FascinatingNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int s1 = num*2;
        int s2 = num*3;
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.append(s1);
        sb.append(s2);
        String fas = sb.toString();
        char[] fasArr = fas.toCharArray();
        int count = 0;
        HashSet<Character> s = new HashSet<Character>();
        for(int i = 0; i < fas.length(); i++){
            if(s.contains(fasArr[i])){
                count = 1;
                break;
            }
            else {
                s.add(fasArr[i]);
                count = 0;
                //System.out.println("Number is fascinating");
            }
        }
        if(count == 1) System.out.println("Number is not fascinating");
        else System.out.println("Number is fascinating");

        System.out.println(s.toString());




    }
}
