package Recursion;

public class MIN_NON_ZERO_PRODUCT_OF_ARRAY {
    public void main(String[] args) {
        System.out.println(minNonZeroProduct(5));
        System.out.println(pow(2,5));
    }
        public long mod = 1_000_000_007;

        public int minNonZeroProduct(int p) {
            if (p == 1) return 1;
            long maxNumber = pow(2,p)-1;
            long oneLessNumber = maxNumber - 1;
            long n = maxNumber / 2;
            long rem = pow(oneLessNumber, n);
            return (int) (rem * (maxNumber % mod) % mod);
        }

        public long pow(long x, long n) {
            if (n == 0) return 1;
            long temp = pow(x, n / 2) % mod;
            temp = (temp * temp) % mod;
            if (n % 2 == 0) {
                return temp;
            } else {
                return (x * temp) % mod;
            }
        }
    }
