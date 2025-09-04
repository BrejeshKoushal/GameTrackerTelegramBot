package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class ReverseAstringinJava {
    public static void main(String[] args) {

        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        s=sc.nextLine();                    //reading string from user
        System.out.print("After reverse string is: ");
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
