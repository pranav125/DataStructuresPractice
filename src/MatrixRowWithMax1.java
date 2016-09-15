/**
 * Created by sony on 4/21/2016.
 * Given a 2D array...find the row with maximum 1.
 */
import java.util.*;
public class MatrixRowWithMax1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] matrix = new int[100][200];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
               matrix[i][j] = in.nextInt();
            }
        }


//        int max = 0, count, x;
//        for(int y = 0; y < m;y++){
//            count = 0;
//            x = max;
//            for(;x < n;x++){
//                if(matrix[y][x] == 0 && count > max){
//                    max = count;
//                }
//                else count++;
//            }
//            if(x == (n -1)) break;
//        }
//        System.out.println(max);
    }

}
