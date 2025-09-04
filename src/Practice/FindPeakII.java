package Practice;

import java.util.Arrays;

public class FindPeakII {
    public static int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
//            row traversal
            if (i == 0) {
                if (i < m-1 && mat[i][0] > mat[i][1] && mat[i][0] > mat[i + 1][0]) return new int[]{i, 0};
                if (mat[i][n - 1] > mat[i][n - 2] && mat[i][n - 1] > mat[i + 1][n - 1]) return new int[]{i, n - 1};
            } else if (i == m - 1) {
                if (i > 1 && mat[i][0] > mat[i - 1][0] && mat[i][0] > mat[i][1]) return new int[]{i, 0};
                if ( mat[i][n - 1] > mat[i - 1][n - 1] && mat[i][n - 1] > mat[i][n - 2]) return new int[]{i, n - 1};
            } else {
                if (mat[i][0] > mat[i - 1][0] && mat[i][0] > mat[i + 1][0] && mat[i][0] > mat[i][1])
                    return new int[]{i, 0};
                if (mat[i][n - 1] > mat[i - 1][n - 1] && mat[i][n - 1] > mat[i][n - 2] && mat[i][n - 1] > mat[i + 1][n - 1])
                    return new int[]{i, n - 1};
            }
        }
        for (int j = 0; j < n; j++) {
            // column traversal
            if (j == 0) {
                if (j < n - 1 && mat[0][j] > mat[1][j] && mat[0][j] > mat[0][j + 1]) {
                    return new int[]{0, j};
                }
                if (mat[m - 1][j] > mat[m - 2][j] && mat[m - 1][j] > mat[m - 1][j + 1]) return new int[]{m - 1, j};
            } else if (j == n - 1) {
                if (mat[0][j] > mat[1][j] && mat[0][j] > mat[0][j - 1]) return new int[]{0, j};
                if (mat[m - 1][j] > mat[m - 2][j] && mat[m - 1][j] > mat[m - 1][j - 1]) return new int[]{m - 1, j};
            } else {
                if (mat[0][j] > mat[0][j - 1] && mat[0][j] > mat[0][j + 1] && mat[0][j] > mat[1][j])
                    return new int[]{0, j};
                if (mat[m - 1][j] > mat[m - 1][j - 1] && mat[m - 1][j] > mat[m - 1][j + 1] && mat[m - 1][j] > mat[m - 2][j])
                    return new int[]{m - 1, j};
            }
        }


        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] mat =  {{10,20,15,9},
                        {21,30,14,19},
                        {7, 16,32,67},
                        {22, 6,42,78}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
}
