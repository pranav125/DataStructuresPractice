/**
 * Created by sony on 4/22/2016.
 * Given a string...remove all "a" and "bc" from string.
 */
import java.util.*;
public class RemoveCharactersFromString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 'b' && !s.contains("ac")){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
