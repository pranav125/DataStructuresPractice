/**
 * Created by sony on 4/18/2016.
 * Given a number...find if it is automorphic or not.
 * Automorphic number means number it's square should end with the same number.
 */
import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sqr = num * num;
        String num1 = String.valueOf(num);

            List<Integer> ls = new ArrayList<Integer>();
        while(sqr > 0){
                ls.add(sqr%10);
                sqr/=10;
        }

        System.out.println(ls);
        Character[] nums = new Character[ls.size()];
        for(int i = 0; i < ls.size(); i++){
            nums[0] = Character.valueOf(Character.highSurrogate(ls.get(i)));
        }
        int count = 0;
        List<Character> ls1 = new ArrayList<Character>();
        for(int i = 0; i < num1.length(); i++){
           ls1.add(num1.charAt(i));

        }
        //System.out.println(ls);
        if(ls.retainAll(ls1)) System.out.println("ls"+ls);
        else System.out.println("Number is not Automorphic");
        //System.out.println(count);
//        if(count == num1.length()) System.out.println("Number is Automorphic...");
//        else System.out.println("Number is not Automorphic...");
    }
}
