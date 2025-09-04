package DynamicProgramming;


import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonSubsequence {

//    Recursion + memoization
    static int[][]dp;
    public static int longestSubsequenceLength(String x , String y , int m , int n){
        if(m==0||n==0) return 0;
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(x.charAt(m-1)==y.charAt(n-1)){
            return dp[m][n] = 1 + longestSubsequenceLength(x,y,m-1,n-1);
        }
        else{
            return dp[m][n] = Math.max(longestSubsequenceLength(x,y,m-1,n) , longestSubsequenceLength(x,y,m,n-1));
        }
    }
    // Bottom-Up Approach
    public static int longestSubsequenceLength(String x , String y){
        int m = x.length();
        int n = y.length();
        int[][] t = new int[m+1][n+1];
        for(int i = 0 ; i <=m ;i++){
            t[i][0]=0;
        }
        for(int i = 0 ; i<=n;i++){
            t[0][i]=0;
        }
        StringBuilder st = new StringBuilder();
        for (int i = 1; i<=m ;i++){
            for(int j =1 ; j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                    st.append(x.charAt(i-1));
                }
                else t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        System.out.println(st);
        return t[m][n];
    }
    public static void main(String[] args) {
        String x = "abcdghr";
        String y = "abedfhr";
        int m = x.length();
        int n = y.length();
        dp = new int[m+1][n+1];
        for(int i = 0 ; i <=m ;i++){
            for(int j = 0 ; j<=n ;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(longestSubsequenceLength(x,y));
    }
}
