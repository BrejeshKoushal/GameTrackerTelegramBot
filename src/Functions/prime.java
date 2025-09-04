package Functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to search for: ");
        int num = scanner.nextInt();
        if(isPrime(num)){
            System.out.println(STR."\{num} is a Prime number");
       }
        else{
            System.out.println(STR."\{num} is not a Prime number");
        }
    }
    static boolean isPrime(int x){
        if(x<=1){
            return false;
        }

        int i = 2;
        while(i * i <= x){
            if(x % i==0){
                return false;

            }
            i++;

        }
        return i*i >x;
    }
}
