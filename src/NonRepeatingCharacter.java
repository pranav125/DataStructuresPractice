/**
 * Created by sony on 4/25/2016.
 * Given a string...find the first non repeating character.
 */
import java.util.*;
public class NonRepeatingCharacter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashSet<Character> set = new HashSet<Character>();
//        for(int i = 0; i < s.length(); i++){
//            if(set.contains(i)) System.out.println(s.charAt(i-1));
//            else set.add(s.charAt(i));
//        }
//        System.out.print(set);
////        char first = set.toString().charAt(0);
//        System.out.println(first);
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int i, length;
        Character c;
        length = s.length();
        for(i = 0; i < length;i++){
            c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }
        //if(map.get(c) == 1) System.out.println(c);
        for(i = 0; i < length;i++){
            c =s.charAt(i);
            if(map.get(c) == 1) System.out.println(c);
        }
        //return null;
    }
}
