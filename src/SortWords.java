/**
 * Created by sony on 5/22/2016.
 * Given different words...find the length of word followed by the total sum.
 */
import java.util.*;
public class SortWords {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in .nextLine();
        char[] arr = s.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<Character>();
        Vector<Integer> v = new Vector<Integer>();
        int count  = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != ' '){
                list.add(arr[i]);
            }
            else{
                count += list.size();
                v.add(list.size());
                //System.out.print(" "+list.size());
                list.clear();
            }
        }
        Collections.sort(v);
        for(int i = 0; i < v.size(); i++){
            System.out.print(" "+v.get(i));
        }
        System.out.println(" "+count);
    }
}
