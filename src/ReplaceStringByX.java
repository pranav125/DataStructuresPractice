/**
 * Created by sony on 6/3/2016.
 * Given a string...replace that string with value X in a given string.
 */
import java.util.*;
public class ReplaceStringByX {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String rep = in.nextLine();
        StringBuilder sb = new StringBuilder(s);
        if(sb.equals(rep)){
            System.out.print("");
        }
    }
}
