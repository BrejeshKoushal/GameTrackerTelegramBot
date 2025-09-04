package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = scanner.nextInt();
        int ans  = fibb(num);
        System.out.println(ans);
    }
    static int fibb(int num)
    {
        int f1 = 0;
        int f2 = 1;
        int f3 = f1+f2;
        for(int i = 2 ; i < num ;i++){
            f1=f2;
            f2=f3;
            f3=f1+f2;
        }


        return f3;


    }


}
