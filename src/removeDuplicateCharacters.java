/**
 * Created by sony on 4/14/2016.
 * Given 2 strings ... remove duplicate characters from string 1 which are present in string 2.
 */
import java.util.*;

public class removeDuplicateCharacters {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        HashSet<Character> s =  new HashSet<Character>();
        for(int i = 0; i < s1.length(); i++){
            s.add(s1.charAt(i));
        }
        for(int j = 0; j < s2.length(); j++){
            if(s.contains(s2.charAt(j))){
                s.remove(s2.charAt(j));
            }
        }
        String[] text = s.toString().split(",");
        for(int k = 0; k < text.length; k++) {
            System.out.print(text[k]);
        }
    }
}
