package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        float radius = scanner.nextByte();
        float area = (float) (3.14*radius*radius);
        System.out.println(area);

    }
}
