/**
 * Created by sony on 5/7/2016.
 * Given a string...find the non repeating character...
 */
import java.util.*;

public class NonRepeating_Character {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1) System.out.println(s.charAt(i));
        }
    }
}
