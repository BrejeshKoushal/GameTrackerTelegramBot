package assignments.firstjava.arrays;

import java.util.ArrayList;
import java.util.List;

public class luckynumber {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(luckyNumbers(arr));
    }

    static List<Integer> luckyNumbers(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] maxcolindex = new int[arr.length];
        int[] minrowindex = new int[arr.length];

        // Find the index of the minimum value in each row
        for (int i = 0; i < arr.length; i++) {
            int minrow = Integer.MAX_VALUE;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minrow) {
                    minrow = arr[i][j];
                    minrowindex[i] = j;
                }
            }
        }

        // Find the index of the maximum value in each column
        for (int j = 0; j < arr[0].length; j++) {
            int maxcol = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] > maxcol) {
                    maxcol = arr[i][j];
                    maxcolindex[j] = i;
                }
            }
        }

        // Check for lucky numbers
        for (int i = 0; i < minrowindex.length; i++) {
            for (int j = 0; j < maxcolindex.length; j++) {
                if (minrowindex[i] == j && maxcolindex[j] == i) {
                    ans.add(arr[i][j]);
                }
            }
        }
        return ans;
    }
}
