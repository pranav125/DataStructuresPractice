/**
 * Created by sony on 4/14/2016.
 * Given 2 nos., find perfect cubes between them...
 */
import java.util.*;

public class perfectCubeBetween2Nos {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int cube = 0;
        List<Integer> myList = new ArrayList<Integer>();
        int count = 0;
        for(int i = a ; i <= b; i++ ){

            myList.add(i);
            //cube = i * i * i;


        }
        for ( int j = a; j <=b; j++ ){
            cube = j * j * j;
            if(myList.contains(cube)){
                count++;

            }

        }
        System.out.println(count);
    }
}
