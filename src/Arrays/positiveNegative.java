package Arrays;

import java.util.Arrays;

public class positiveNegative {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] arr) {
            int[] pos = new int[arr.length / 2];
            int[] neg = new int[arr.length / 2];
            int[] ans = new int[arr.length];
            int j = 0;
            int k = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    pos[j] = arr[i];
                    j++;
                } else {
                    neg[k] = arr[i];
                    k++;
                }
            }

            // Determine the length of the shorter array
            int minLength = Math.min(j, k);

            for (int i = 0; i < minLength; i++) {
                ans[2 * i] = pos[i];
                ans[(2 * i) + 1] = neg[i];
            }

            // If one array is longer than the other, copy the remaining elements
            if (j > k) {
                System.arraycopy(pos,k, ans, 2 * k, j - k);
            } else if (k > j) {
                System.arraycopy(neg, j, ans, 2 * j, k - j);
            }

            return ans;
        }
    }