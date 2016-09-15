/**
 * Created by sony on 4/19/2016.
 * Find if the year is leap year or not.
 */
import java.util.*;

public class LeapYear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year % 4 == 0){
            System.out.println(""+year+" is a leap year.");
        }
        else{
            System.out.println(""+year+" is not a leap year.");
        }
    }
}
