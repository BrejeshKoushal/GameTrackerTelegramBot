package assignments.firstjava;

import java.util.Scanner;

public class oddeven {
//    Write a program to print whether a number is even or odd, also take input from the user.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = scanner.nextInt();
    oddEVEN(num);
}
static void oddEVEN(int num){
    if(num%2==0){
        System.out.println(STR."\{num} is even");
    }
    else
        System.out.println(STR."\{num} is odd");
}
}
