package assignments.firstjava;

import java.util.Scanner;
//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class simpleinterest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        int principal = scanner.nextInt();
        System.out.print("Enter the time : ");
        int time = scanner.nextInt();
        System.out.print("Enter the interest rate : ");
        int interest = scanner.nextInt();
        int ans = SI(principal, time , interest);
        System.out.println(STR."The simple interest is calculated to be \{ans} ");

    }

    static int SI(int principle , int time , int interest) {

        return (principle * time * interest) / 100;
    }
}
