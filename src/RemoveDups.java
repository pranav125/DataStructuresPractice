/**
 * Created by sony on 6/2/2016.
 * Given a string...remocve the duplicate chars and return the new string.
 */
import java.util.*;
public class RemoveDups {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashSet<Character> hash = new HashSet<Character>();
        for(int i = 0 ; i < s.length(); i++){
            hash.add(s.charAt(i));
        }
        System.out.print(hash.toString().replace(",","").replace(" ","").replace("[","").replace("]",""));
    }
}
