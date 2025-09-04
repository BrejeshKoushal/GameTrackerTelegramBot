package conditionalsandloops;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(checkArmstrong(num));
        // Write your code here
    }

    public static boolean checkArmstrong(int n) {
        //Write your code here
        int rem;
        int ans = 0;
        int original = n;
        int count = countDigits(n);
        System.out.println(count);
        while (n > 0) {
            rem = n % 10;
            ans += (int) Math.pow(rem, count);
            n = n / 10;
        }
        return ans == original;
    }

    public static int countDigits(int n) {
        int count=0;
        while(n>0){
        n=n/10;
        count++;
        }
        return count;
    }
}
