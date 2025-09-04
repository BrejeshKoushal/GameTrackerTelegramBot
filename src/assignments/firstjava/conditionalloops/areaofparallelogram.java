package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class areaofparallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram : ");
        float base = scanner.nextByte();
        System.out.println("Enter the height of the parallelogram : ");
        float height = scanner.nextByte();
        float area = height * base;
        System.out.println(area);
    }
}
