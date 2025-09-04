    package Recursion;

    import java.util.ArrayList;

    public class factorialOfNnumbers {
        public  void main(String[] args) {
    // first few factorial numbers are 1, 2, 6, 24, 120
            System.out.println(factorial(10));
            System.out.println(factorialNumbers(6));
        }
    //    N = 6
    //Output: 1 2 6
        int i = 1;
        ArrayList<Long> list = new ArrayList<>();

         ArrayList<Long> factorialNumbers(long N){
            // code here
            if(factorial(i)>N) return list;
            else list.add(factorial(i));
            i++;
            return factorialNumbers(N);
        }
        long factorial(long n){
            if(n==1) return 1;
            return n*factorial(n-1);
        }
    }
