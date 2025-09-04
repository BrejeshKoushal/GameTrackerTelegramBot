package OOPS.strings;

import java.util.Scanner;

public class stringbufferandbuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string\n");
        String input = scanner.nextLine();
        System.out.println("Enter a character\n");
        char inputchar = scanner.next().charAt(0);

        String uppercase = input.toUpperCase();
        String reversed = new StringBuilder(input).reverse().toString();
        int charposition = input.indexOf(inputchar);
        String charpresent = charposition !=-1?"found":"notfound";
        String palindrome = input.equalsIgnoreCase(new StringBuilder(input).reverse().toString())?"yes":"no";
        System.out.println(uppercase);
        System.out.println(reversed);
        System.out.println(charpresent);
        System.out.println(palindrome);
    }
}
