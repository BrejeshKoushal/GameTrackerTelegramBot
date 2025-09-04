package binarysearch;

import java.util.Arrays;

public class FloorAndCeiling {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        System.out.println(Arrays.toString(getFloorAndCeil(arr, 6, 8)));
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int[] ans = new int[2];
        int start = 0;
        int end = n - 1;
        ans[0] = -1;
        ans[1] = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] <= x) {
                ans[0] = a[mid];
                start = mid + 1;
            }
            if (a[mid] >= x) {
                ans[1] = a[mid];
                end = mid - 1;
            }

        }
        return ans;
    }
}