/**
 * Created by sony on 4/21/2016.
 * Given a string...remove the duplicate characters.
 */
import java.util.*;
public class RemoveDuplicateCharacter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        HashSet<Character> hs = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            hs.add(s.charAt(i));
        }
        for(char c : hs){
            sb.append(c);
        }

        System.out.println(sb.toString());

    }
}
