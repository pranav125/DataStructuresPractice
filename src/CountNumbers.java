/**
 * Created by sony on 4/20/2016.
 * Count numbers from 1 to n such that it doesn't have digit 3.
 */
import java.util.*;
public class CountNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       // int n = 14;
        int modulo = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n;i++){
            modulo=i%10;

            if(modulo!=3) {
                list.add(modulo);
            }
//                i/=10;

        }
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) != 3){
//                count++;
//            }
//        }
//        System.out.println(count);
        System.out.println(list.size());

    }
}
