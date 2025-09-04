package conditionalsandloops;

import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        System.out.println("Enter the key");
        int key = scanner.nextInt();
        int occurence = 0;
        while(num > 0)
       {
           int rem = num % 10;
           if(rem == key)
           { occurence ++;
           }
           num = num/10;


       }
        System.out.println("The key " + key + " is occuring " + occurence + " times");
    }
}
