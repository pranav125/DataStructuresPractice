/**
 * Created by sony on 6/4/2016.
 * Given a string...find the index of pattern in this string.
 */
import java.util.*;
public class SearchPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String pat = in.nextLine();

            if(s.contains(pat)) {
                System.out.println(s.indexOf(pat));
            }
        else{
                System.out.print("-1");
            }
    }
}
