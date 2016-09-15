/**
 * Created by sony on 5/9/2016.
 * Given a string...find distinct substrings...
 */
import java.util.*;
public class DistinctSubStrings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) != s.charAt(i + 1)){
                sb.append(s.charAt(i)).append(s.charAt(i+1));
                System.out.println(sb.toString());
            }
            sb.setLength(0);
        }
    }
}
