/**
 * Created by sony on 4/25/2016.
 * Given a string...find if it is isomorphic or not.
 *Isomorphic means there should be one on one mapping between each character of 2 strings.
 */
import javax.sound.midi.SysexMessage;
import java.util.*;
public class IsomorphicString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if(s1.length() != s2.length()) System.out.println("Strings are not isomorphic");
        if(s1.length()==0 && s2.length()==0) System.out.println("Strings are not isomorphic");
        HashMap<Character,Character> map = new HashMap<Character, Character>();

        for(int i = 0; i < s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            Character c = getKey(map, c2);
            if(c!=null && c!=c1){
                System.out.println("Strings are not isomorphic");
            }
            else if(map.containsKey(c1)){
                if(c2!=map.get(c1)) System.out.println("Strings are not isomorphic");
            }
            else{
                map.put(c1,c2);
                System.out.println("Strings are isomorphic");
            }
        }
    }
    public static Character getKey(HashMap<Character,Character> map, Character target){
        for(Map.Entry<Character,Character> entry : map.entrySet()){
            if(entry.getValue().equals(target)){
                return entry.getKey();
            }
        }
        return null;
    }
}
