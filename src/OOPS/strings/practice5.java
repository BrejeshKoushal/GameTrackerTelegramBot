package OOPS.strings;

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.split(" ");

        // Calculate the sum of differences for each word
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            int sum = 0;
            int length = word.length();
            for (int i = 0; i < length / 2; i++) {
                // Calculate the difference between characters at corresponding positions
                int diff = Math.abs(word.charAt(i) - word.charAt(length - 1 - i));
                sum += diff;
            }
            // If the word length is odd, add the ASCII value of the middle character
            if (length % 2 != 0) {
                sum += word.charAt(length / 2);
            }
            // Append the sum to the result
            result.append(sum);
        }

        // Print the result
        System.out.println("Result: " + result.toString());
    }
}
