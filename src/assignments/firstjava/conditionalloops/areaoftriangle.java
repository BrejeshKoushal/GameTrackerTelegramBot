package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base of the triangle : ");
        float base = scanner.nextByte();
        System.out.println("Enter the height of the triangle : ");
        float height  = scanner.nextByte();
        float area = (float) (0.5*base*height);
        System.out.println(area);
    }
}
