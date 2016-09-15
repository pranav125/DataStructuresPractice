/**
 * Created by sony on 4/18/2016.
 * Given a number...find if it is a power of 2.
 */
import java.util.*;

public class PowerOf2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double num = in.nextInt();
         //boolean isPowerOf2 = false;
        for( double i = 0; i < num; i++){
            if(Math.pow(2,i) == num ){
                //isPowerOf2 = true;
                System.out.println("It is a power of 2.");
                break;
            }
//            else{
//                System.out.println("It's not a power of 2.");
//                break;
//            }

        }


    }
}
