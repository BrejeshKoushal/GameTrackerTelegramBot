package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class areaofrhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first diagonal : ");
        float d1 = scanner.nextByte();
        System.out.println("Enter the length of the second diagonal : ");
        float d2 = scanner.nextByte();
        float area = (float) (d1*d2*0.5);
        System.out.println(area);
    }
}
