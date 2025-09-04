package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        int ans = subtractProductAndSum(num);
        System.out.println(ans);
    }
    static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem = n % 10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        return product-sum;

    }

}
