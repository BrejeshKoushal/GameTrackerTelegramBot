package assignments.firstjava.arrays;

import java.util.Arrays;

public class uniqueintegers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
        static int[] sumZero(int n) {
            int[] arr = new int[n];
            int startIndex = 0;

            // For even n, populate array with alternating positive and negative integers
            for (int i = 1; i <= n / 2; i++) {
                arr[startIndex++] = i;
                arr[startIndex++] = -i;
            }

            // For odd n, add 0 in the middle
            if (n % 2 != 0) {
                arr[startIndex] = 0;
            }
            int minrow = Integer.MIN_VALUE;
            int maxcolumn = Integer.MAX_VALUE;

            return arr;
        }


}
