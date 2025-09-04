package conditionalsandloops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();

        int f1 = 0;
        int f2 = 1;
        int f = f1 + f2;

        for(int i = 2 ; i < num ; i++){
           f1 = f2;
           f2 = f;
           f = f1 + f2;

        }

        System.out.println(f);



    }
}
