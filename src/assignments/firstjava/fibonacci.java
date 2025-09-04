package assignments.firstjava;

import java.util.Scanner;

public class fibonacci {
//    to calculate Fibonacci Series up to n numbers.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = scanner.nextInt();
    int ans = fibonacci(num);
    System.out.println(ans);
}
static int fibonacci(int num)
{

    int f1 = 0 ;
    int f2 = 1 ;
    int f = f1 + f2;
    for(int i = 2 ; i < num ; i++){
        f1 = f2;
        f2 = f;
        f = f1 + f2;
    }
    return f;
}
}
