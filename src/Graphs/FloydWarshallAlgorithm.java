package Graphs;

import java.util.Arrays;

public class FloydWarshallAlgorithm {
    public static void shortest_distance(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
                if (i == j) matrix[i][j] = 0;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][k] != Integer.MAX_VALUE && matrix[k][j] != Integer.MAX_VALUE) {
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE) matrix[i][j] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{0, 2, -1, -1},{1, 0, 3, -1},{-1, -1, 0, 1},{3, 5, 4, 0}};
        shortest_distance(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
