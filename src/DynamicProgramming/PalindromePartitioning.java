package DynamicProgramming;

public class PalindromePartitioning {
    int[][] dp = new int[2000][2000];
    public boolean isPal(String st , int i , int j){
        while(i<j){
            if(st.charAt(i)!=st.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int helper(String s , int i , int j){
        if(i>=j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(isPal(s,i,j)) return 0;

        int min = Integer.MAX_VALUE;
            for(int k = i ; k < j ;k++) {
                if (isPal(s, i, k)) {
                    int temp = 1 +  helper(s, k + 1, j);
                    min = Math.min(min, temp);
                }
            }
        return dp[i][j] = min;
    }
    public int minCut(String s) {
        int i = 0;
        int j = s.length()-1;
        for (int a = 0 ; a < dp.length;a++){
            for (int b = 0 ; b < dp[0].length;b++){
                dp[a][b]=-1;
            }
        }
        return helper(s,i,j);
    }
    public void main(String[] args) {
     String st = "brejesh";
        System.out.println(minCut(st));
    }
}
