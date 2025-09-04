package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class areaofequilateraltriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the equilateral triangle : ");
        float sidelength = scanner.nextByte();
        float area = (float) (sidelength*sidelength*0.433);
        System.out.println(area);
    }
}
