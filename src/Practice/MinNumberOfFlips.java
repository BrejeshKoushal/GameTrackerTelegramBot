package Practice;

public class MinNumberOfFlips {
    int min = Integer.MAX_VALUE;

    public void helper(int[][] mat, int i, int j, int flips) {
        if (isValid(mat)) {
            min = Math.min(min, flips);
            return;
        }
        if (i==mat.length) return;
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length ) {
            return;
        }
        int nextI = j == mat[0].length - 1 ? i + 1 : i;
        int nextJ = j == mat[0].length - 1 ? 0 : j + 1;

        helper(mat,nextI,nextJ,flips);
        flip(mat, i, j);
        helper(mat, nextI, nextJ, flips + 1);
        flip(mat, i, j);
    }

    public int minFlips(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                helper(mat, i, j, 0);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public void flip(int[][] mat, int i, int j) {
        int m = mat.length;
        int n = mat[0].length;
        mat[i][j] ^= 1;
        if (i - 1 >= 0) mat[i - 1][j] ^= 1;
        if (i + 1 < m) mat[i + 1][j] ^= 1;
        if (j - 1 >= 0) mat[i][j - 1] ^= 1;
        if (j + 1 < n) mat[i][j + 1] ^= 1;
    }

    public boolean isValid(int[][] mat) {
        for (int[] row : mat) {
            for (int cell : row) {
                if (cell != 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat = { {0, 0}, {0, 1} };
        System.out.println(new MinNumberOfFlips().minFlips(mat));
    }
}
