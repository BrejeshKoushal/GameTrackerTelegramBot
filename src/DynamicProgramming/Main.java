package DynamicProgramming;
import java.util.Arrays;

public class Main {
    public static int fibo(int n,int[] dp){
        dp[0]=0;
        dp[1]=1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = fibo(n-1,dp)+ fibo(n-2,dp);
    }
    public static int fibo(int n){
        int fibo1 = 0;
        int fibo2 = 1;
        for(int i = 2 ; i<=n ;i++){
            int curr = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = curr;
        }
        return fibo2;
    }



    public static void main(String[] args) {
        int n = 6;
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n));
    }
}
