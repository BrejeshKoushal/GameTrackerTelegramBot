package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class oddnegative {
    /* Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive
     odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num = 1;
        int sumofneg = 0;
        int sumofposeven = 0;
        int sumofposodd = 0;
        {
            while(num!=0){
                num = scanner.nextInt();
                if(num%2==0 && num>0){
                    sumofposeven+=num;
                } else if (num%2==1 && num>0) {
                    sumofposodd+=num;
                }
                
                if(num<0){
                    sumofneg+=num;
                }

            }
            System.out.println(STR."Sum of positive odd = \{sumofposodd}");
            System.out.println(STR."Sum of negative = \{sumofneg}");
            System.out.println(STR."Sum of positive even = \{sumofposeven}");



        }

    }
}
