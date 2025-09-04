package binarysearch;

import java.util.Arrays;

public class KoKoEatingBananas {
    public static void main(String[] args) {
        int[]arr = {805306368,805306368,805306368};
        System.out.println(minEatingSpeed(arr,1000000000));
    }
    public static int maximum(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }

    public static long totalHours(int[] arr, int perhour) {
        long total = 0;
        for (int j : arr) {
            total += Math.ceilDiv(j, perhour);
        }
        return total;
    }


    public static int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = maximum(piles);
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (totalHours(piles, mid) <= h) {
                ans = mid;
                end = mid - 1;
            }
            else start=mid+1;
        }
        return ans;
    }
}