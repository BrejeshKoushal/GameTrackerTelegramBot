package Functions;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.println(STR."Before swapping: a = \{a}, b = \{b}");

        // Call the swap function
        swapNumbers(a, b);

        System.out.println(STR."After swapping: a = \{a}, b = \{b}");

        scanner.close();
    }

    public static void swapNumbers(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println(STR."Inside swap function: x = \{x}, y = \{y}");
    }
}