/**
 * Created by sony on 4/22/2016.
 * Given a number...find if it's sum of digits is palindrome or not.
 */
import java.util.*;
public class IntegerPalindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        while(n > 0){
            list.add(n%10);
            n/=10;
        }
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
        String s = String.valueOf(sum);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));
        }
        System.out.println(sb.reverse().toString()+" "+s);
        String s1 = sb.reverse().toString();
        int revSum = Integer.parseInt(s1);
        //System.out.print(sb.reverse().toString());
        if(sum == revSum){
            System.out.println("Sum of digits is Palindrome");
        }
        else{
            System.out.println("Sum of digits is not Palindrome.");
        }
    }
}
