package assignments.firstjava.functions;

import java.util.Scanner;

public class age {
//    A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out
//     if he/she is eligible to vote.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age : ");
    int age = scanner.nextInt();
    eligible(age);
}
static void eligible(int age){
      if(age>=18){
          System.out.println("eligible");
      }
      else System.out.println("not eligible");

    }




}