package conditionalsandloops;

import java.util.Scanner;

public class aphabetcasecheck {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character ");
        char ch = scanner.next().trim().charAt(0);

        if (ch > 'a' && ch < 'z'){
            System.out.println("Lowercase");
        }
        else
            System.out.println("Uppercase");
    }
}