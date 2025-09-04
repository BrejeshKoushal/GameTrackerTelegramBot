package assignments.firstjava;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
//        Take 2 numbers as input and print the largest number.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a  = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println(STR."\{a} is greater than \{b}");
        }
        else if(a<b){
            System.out.println(STR."\{b} is greater than \{a}");
        }
        else System.out.println(STR."Both numbers \{a} and \{b} are equal");
    }
}
