package Recursion;

public class SumofFirstNnumbers {
    public void main(String[] args) {
        long n = 7;
        System.out.println(sumOfSeries(n));
    }
    long sum =0;
    long sumOfSeries(long n) {
        // code here
        sum+= (n*n*n);
        if(n==1) return sum;
        return sumOfSeries(n-1);


    }
}
