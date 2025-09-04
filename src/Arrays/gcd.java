package Arrays;

public class gcd {
    public static void main(String[] args) {
        System.out.println(calcGCD(9,6));
    }
    public static int calcGCD(int n, int m){
        // Write your code here.
        int ans = 0;
        int max = Math.min(n,m);
        for(int i = max ; i>=1 ; i--){
            if(n%i==0 && m%i==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
