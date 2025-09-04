package conditionalsandloops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        int ans = 0;
        while(num>0){

            int lastdigit = num % 10;
            num = num/10;
            ans = ans * 10  + lastdigit;

        }
        System.out.println(ans);
    }
}
