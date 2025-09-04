package DynamicProgramming;

import java.util.Arrays;

class PartitionArrayForMaximumSum{
int allowed;
int[]dp;
public int helper(int[]arr , int i){
    if (i>=arr.length) return 0;
    int max = Integer.MIN_VALUE;
    int maxi = -1;
    if (dp[i]!=-1) return dp[i];
    for (int k = i; k<arr.length && k-i+1<=allowed ;k++){
        maxi = Math.max(arr[k],maxi);
        int temp = maxi*(k-i+1) + helper(arr,k+1);
        max = Math.max(temp,max);

    }
    return dp[i]=max;
}
public int maxSumAfterPartitioning(int[] arr, int k) {
    int n = arr.length;
    allowed = k;
    dp = new int[n+1];
    Arrays.fill(dp,-1);
    return helper(arr,0);
}
public void main(String[] args) {
    int[] arr = {1,15,7,9,2,5,10};
    int  k = 3;
    System.out.println(maxSumAfterPartitioning(arr,k));
}
}
