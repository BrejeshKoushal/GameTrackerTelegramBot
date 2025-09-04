package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class areaofrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        float length = scanner.nextByte();
        System.out.println("Enter the breadth of the rectangle : ");
        float breadth = scanner.nextByte();
        float area = (float)(length*breadth);
        System.out.println(area);
    }
}
