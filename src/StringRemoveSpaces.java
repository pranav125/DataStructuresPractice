/**
 * Created by sony on 4/16/2016.
 * Given a string...remove space contained in it.
 */
import java.util.*;
import java.lang.StringBuilder;

public class StringRemoveSpaces {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }
        System.out.print(sb.toString());
    }


}

//        //String s2 = in.next();
//        //s.replaceAll("\\s","");
//        char[] arr = s1.replaceAll("\\s","").toLowerCase().toCharArray();
//        //char[] arr1 = s2.replaceAll("\\s","").toLowerCase().toCharArray();
//        System.out.print(s1.re("\\s",""));
////      for(int i = 0; i < s.length(); i++){
////            if(s.charAt(i) == ' '){
////                char rm = s.charAt(i);
////                rm = s.charAt(i+1);
////            }
////        }

