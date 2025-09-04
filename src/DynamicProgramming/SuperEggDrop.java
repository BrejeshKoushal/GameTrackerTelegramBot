package DynamicProgramming;

import java.util.Arrays;

public class SuperEggDrop {
    int[][] dp;
    public int helper(int k , int n){
        if(k==1) return n;
        if(n==1 || n==0) return n;
        if(dp[k][n]!=-1) return dp[k][n];
        int min = Integer.MAX_VALUE;
        int l = 1 ;
        int r = n;
        while(l<=r){
            int mid = (l+r)/2;
            int broke = helper(k-1,mid-1);
            int safe =helper(k,n-mid);
            int temp = 1 + Math.max(broke,safe);
            if (broke<safe){
                l = mid+1;
            }
            else r = mid-1;
            min = Math.min(min,temp);
        }
        return dp[k][n] = min;
    }
    public int superEggDrop(int k, int n) {
        dp = new int[k+1][n+1];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);

        }
        return helper(k,n);
    }
    public static void main(String[] args) {
        int k = 2, n = 6;
    }
}
