package Recursion;

import java.io.CharArrayReader;

public class contest {
    public void main(String[] args) {
        String s = "cb34";
        System.out.println(clearDigits(s));
    }

    public static String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean foundDigit;

        do {
            foundDigit = false;
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    foundDigit = true;
                    // Find the most recent preceding alphabetic character
                    for (int j = i - 1; j >= 0; j--) {
                        if (Character.isAlphabetic(sb.charAt(j))) {
                            sb.deleteCharAt(i); // Remove the digit
                            sb.deleteCharAt(j); // Remove the preceding alphabetic character
                            break; // Exit the inner loop to avoid modifying the string while iterating
                        }
                    }
                    break; // Exit the outer loop to restart after modification
                }
            }
        } while (foundDigit);

        return sb.toString();
    }
}