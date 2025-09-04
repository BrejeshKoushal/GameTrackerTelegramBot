package Recursion;

public class Power {
    public void main(String[] args) {
        double x = 2.0000; int n = 10;
        System.out.println(myPow(x,n));
    }
    public double myPow(double x, int n){
        long temp = (long) n;
        return power(x,temp);

    }
    public double power(double x , long n){
        if(n==0) return 1;
        if(n==1) return x;
        if(n<0) return (1/power(x,Math.abs(n)));
        if(n%2==0) return power(x*x,n/2);
        return x * power(x*x,(n-1)/2);
    }
}
