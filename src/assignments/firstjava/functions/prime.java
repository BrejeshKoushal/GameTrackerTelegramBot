package assignments.firstjava.functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(isPrime(num)){
            System.out.println("Prime");
        }
        else System.out.println("not prime");
    }

    static boolean isPrime(int num){
        for(int i = 2 ; i < num ; i++ ){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
