package DynamicProgramming;

public class InterleavingString {
    Boolean[][]dp;
    public boolean helper(String a, String b, String c , int i , int j , int k){
        if (k==c.length()){
            return i == a.length() && j == b.length();
        }
        boolean isValid = false;
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (i<a.length() && a.charAt(i)==c.charAt(k)){
            isValid = isValid||helper(a,b,c,i+1,j,k+1);
        }
        if (j<b.length() && b.charAt(j)==c.charAt(k)){
            isValid = isValid||helper(a,b,c,i,j+1,k+1);
        }
        return dp[i][j] =  isValid;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();

        if((n1 + n2) != n3) {
            return false;
        }
        dp= new Boolean[n1+1][n2+1];
        return helper(s1,s2,s3,0,0,0);
    }

    public void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "adbba";
        System.out.println(isInterleave(s1,s2,s3));
    }
}
