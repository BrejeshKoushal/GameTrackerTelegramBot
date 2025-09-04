package DynamicProgramming;

public class Fibonacci {
    public static int fib(int n){
        int fib = 1;
        int fib1 = 0;
        int curr = 0;
        for (int i = 2 ; i<=n;i++){
            curr = fib + fib1;
            fib1 = fib;
            fib = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
