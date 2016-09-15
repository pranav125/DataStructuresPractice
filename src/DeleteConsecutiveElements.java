/**
 * Created by sony on 4/26/2016.
 * Given a string...delete the same consecutive elements.
 */
import java.util.*;
public class DeleteConsecutiveElements {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s + " ";
        //List<Character> list = new ArrayList<Character>();
        String ans ="";
        for(int i = 0; i < s.length()-1;i++){

        char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch1 != ch2){
                ans = ans + ch1;
            }
//
//              if(s.charAt(i) == s.charAt(i+1)){
//                list.add(s.charAt(i));
//                //list.add(s.charAt(i+1));
//            }
//            else{
//                list.add(s.charAt(i));
//                list.add(s.charAt(i+1));
//            }
        }
        System.out.println(ans);
    }
}
