package assignments.firstjava;

import java.util.Scanner;

public class calculator {
//    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int b = scanner.nextInt();
        System.out.print("Enter the operation you want to perform : " );
        char op = scanner.next().charAt(0);
        if(op == '+'){
            System.out.println(STR."The sum of \{a} and \{b} is \{a+b}");
        }
        if(op == '-'){
            System.out.println(STR."The difference between \{a} and \{b} is \{a-b}");
        }
        if(op == '*'){
            System.out.println(STR."The product of \{a} and \{b} is \{a*b}");
        }
        if(op == '/'){
            System.out.println(STR."The division of \{a} and \{b} is \{a/b}");
        }

    }
}
