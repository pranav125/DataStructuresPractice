/**
 * Created by sony on 4/18/2016.
 * Given a number...see if it's weird or not.
 * Weird number means whose sum of all divisors(except that number) must be greater than the number and any of it's divisor's subset
 * sum should not be equal to that number.
 */
import java.util.*;

public class WeirdNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] divs;
        divs = new int[num];
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0) {
                divs[i] = i;
                sum += divs[i];
                System.out.print(divs[i]+" ");
            }
        }
        if(sum > num) System.out.println('\n'+"Number is weird");
        else System.out.println("Number is not weird");
        for(int i = 0; i < divs.length - 1; ++i){
            for(int j = i + 1; j < divs.length; ++j){

                if(divs[i] + divs[j] == num){
                    System.out.println("Number is not weird.");
                    break;
                }
//                else{
//                    System.out.println("Number is weird.");
//                }
            }
        }

//        int curr_sum = 0,start = 0;
//        for(int i = 1; i <= divs.length;i++){
//            while(curr_sum > sum && start < i-1){
//                curr_sum = curr_sum - divs[start];
//                start++;
//            }
//            if(curr_sum == num){
//                System.out.println("Not a weird number.");
//            }
//           if( i < divs.length){
//               curr_sum = curr_sum + divs[i];
//           }
//        }

    }
}
