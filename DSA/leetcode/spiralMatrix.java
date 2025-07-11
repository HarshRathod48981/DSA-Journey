package leetcode;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Solution12 sol = new Solution12();
        List ans = sol.spiralOrder(arr);
        System.out.println(ans);
    }
}

class Solution12 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int srow = 0, scol = 0;
        int erow = m-1, ecol = n-1;

        while (srow<=erow && scol <= ecol) {
            for (int j = scol; j <= ecol; j++) {
                list.add(matrix[srow][j]);
            }
            for (int i = srow+1; i <= erow; i++) {
                list.add(matrix[i][ecol]);
            }
            for (int j = ecol-1; j >=scol ; j--) {
                if (srow == erow){
                    break;
                }
                list.add(matrix[erow][j]);
            }
            for (int i = erow-1; i>=srow+1 ; i--) {
                if (scol == ecol){
                    break;
                }
                list.add(matrix[i][scol]);
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return list;
    }
}