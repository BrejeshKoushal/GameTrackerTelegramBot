package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class distanceformula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 , x2 , y1 ,y2 = 0;

        System.out.println("enter the first coordinate x1 : ");
        x1 = scanner.nextInt();
        System.out.println("enter the second coordinate y1 : ");
        y1 = scanner.nextInt();
        System.out.println("enter the first coordinate x2 : ");
        x2 = scanner.nextInt();
        System.out.println("enter the second coordinate y2 : ");
        y2 = scanner.nextInt();

        float distance = (float) Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        System.out.println(distance);
    }
}
