package DynamicProgramming;

public class SumOfKMirrorNumbers {
    public long findBaseK(int n , int k){
        long ans = 0;
        int place = 1;
        while(n>0){
            long digit = n % k;
            ans+=digit*place;
            place*=10;
            n/=k;
        }
        return ans;
    }
    public static boolean isPalindrome(long n) {
        if (n < 0) return false;

        long original = n;
        long reversed = 0;

        while (n != 0) {
            long digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
    public long kMirror(int k, int n) {
        int count = 1;
        int sum = 0;
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (count>n) break;
                long baseK = findBaseK(i, k);
                long base10 = findBaseK(i, 10);
                if (isPalindrome(baseK) && isPalindrome(base10)) {
                    count++;
                    sum += i;
                }
            }

        return sum;
    }
    public void main(String[] args) {
        int k = 3, n = 7;
        System.out.println(kMirror(k,n));
    }
}
