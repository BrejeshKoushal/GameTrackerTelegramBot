package DynamicProgramming;

import java.util.Arrays;

public class SubsetSumEqualsK {
   static int[][]dp;
   public static int func(int[] arr , int sum , int n){
       if ( sum == 0) return 1;
       if(n<=0) return 0;
       if (dp[n][sum]!=-1) return dp[n][sum];
       if (sum - arr[n - 1] >= 0) {
               int take = func(arr, sum - arr[n - 1], n - 1);
               int skip = func(arr, sum, n - 1);
               dp[n][sum] = take + skip;
               return dp[n][sum];
           } else {
               dp[n][sum] =  func(arr, sum, n - 1);
           }
       return dp[n][sum];
   }
    public static int numberOfSubsets(int[] arr , int sum , int n) {
       dp = new int[n+1][sum+1];
       for (int i = 0 ; i <= n ; i++){
           for (int j = 0 ; j<=sum ; j++){
               if (j==0) dp[i][j]=1;
               else if (j > 0 && i==0) dp[i][j]=0;
               else dp[i][j]=-1;
           }
       }
       for (int i = 1;  i<=n ; i++){
           for (int j = 1; j<=sum ; j++){
               if (arr[i-1]<=j){
                   dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
               }
               else dp[i][j] = dp[i-1][j];
           }
       }
       return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,10};
        System.out.println(numberOfSubsets(arr,10,6));
    }
}
