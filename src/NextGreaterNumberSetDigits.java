/**
 * Created by sony on 4/27/2016.
 * Given a number...find the greater number with same set of digits.
 */
import java.util.*;
public class NextGreaterNumberSetDigits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while(n > 0){
            list.add(n%10);
            n/=10;
        }
        System.out.println(list.get(0));
        int num = list.get(0);
        for(int i = 0 ; i < list.size(); i++){
           if(num > list.get(i)){
                System.out.println("Not Possible...");
           }
            break;
        }

        Collections.sort(list);
        Collections.reverse(list);
        String s = list.toString().replace("[","").replace("]","").replace(",","").replace(" ","").trim();
        System.out.println(Integer.parseInt(s));
    }
}
