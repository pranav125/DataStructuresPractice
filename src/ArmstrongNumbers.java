/**
 * Created by sony on 4/18/2016.
 * Find if a number is Armstrong or not.
 * For ex. : n = 371 ... cube(3) + cube(7) + cube(1) = 371
 */
import java.util.*;
public class ArmstrongNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = n;
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        while(n > 0){
            list.add(n%10);
            n/=10;
        }
        for(int i = 0; i < list.size(); i++){
            sum += (list.get(i) * list.get(i) * list.get(i));
        }
        System.out.println(sum);
        if(sum == m) {
            System.out.println("Number is a armstrong number.");
        }
        else System.out.println("Number is not an armstrong number");
    }
}
