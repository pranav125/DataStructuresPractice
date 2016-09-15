/**
 * Created by sony on 4/16/2016.
 * Given a boolean matrix mat[M][N] of size M X N,
 * modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
 */
import java.util.*;

public class Matrix_Boolean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] mat = new int[m][n];
        int[] row = new int[m];
        int[] col = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            row[i] = 0;
        }
        for (int j = 0; j < n; j++) {
            col[j] = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }
}
//        for(int i =0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                mat[i][j] = in.nextInt();
//                if(mat[i][j] == 1){
//                    mat[0][j] = 1;
//                    mat[i][0] = 1;
//
//                }
//                else mat[i][j] = 0;
//                System.out.print(mat[i][j]);
//            }
//
//        }
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(mat[i][j]);
//            }
//        }

