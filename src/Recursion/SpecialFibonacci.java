package Recursion;

import java.util.Scanner;

public class SpecialFibonacci {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(fibocci(n , a, b));

    }
    static int fibocci(int n ,int a ,int b){
        if(n==0) return a;
        if(n==1) return b;
        return  fibocci(n-1,a,b) ^ fibocci(n-2,a,b);
    }
}

