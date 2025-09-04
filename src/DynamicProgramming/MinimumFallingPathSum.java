package DynamicProgramming;

public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][]dp = new int[m][n];
        for (int j = 0 ; j < n;j++){
             dp[0][j]=matrix[0][j];
        }
        for (int i = 1 ; i<m ; i++){
            for (int j = 0 ; j < n ; j++){
                if(j==m-1){
                    dp[i][j]=matrix[i][j] + Math.min(dp[i-1][j-1],dp[i-1][j]);
                }
                else if(j==0){
                    dp[i][j]=matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j+1]);
                }
                else dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i-1][j+1]));
            }
        }
        int min = 1000000;
        for(int i = 0 ; i < m ;i++){
            if (dp[m-1][i]<min) min = dp[m-1][i];
        }
        return min;
    }
    public void main(String[] args) {
        int[][] arr = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum(arr));
    }
}
