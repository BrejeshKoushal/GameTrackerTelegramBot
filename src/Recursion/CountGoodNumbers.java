package Recursion;

public class CountGoodNumbers {
    public static void main(String[] args) {

    }
    private long mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long first = pow(5,even)%mod;
        long second = pow(4,odd)%mod;
        return (int) ((first*second)%mod);
    }
    public long pow(long x ,long n){
        if(n==0) return 1;
        if(n==1) return x;
        else if(n%2==0) return pow(x*x,n/2)%mod;
        return x * pow(x*x,(n-1)/2)%mod;
    }
}
