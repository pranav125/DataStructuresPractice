/**
 * Created by sony on 8/26/2016.
 */
import java.util.*;
public class UniqueCharactersInString {
    public static void main(String[] args){
        String s = "pranav";
        boolean val = isUnique(s);
        System.out.println(val);
    }
    public static boolean isUnique(String s){
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) return false;
            else {
                set.add(arr[i]);
            }
        }
        return true;
    }
}
