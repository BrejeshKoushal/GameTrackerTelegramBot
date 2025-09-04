package assignments.firstjava;

import java.util.Scanner;

public class inrtous {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in rupees : ");
        int rupees = scanner.nextInt();
        float dollar = (float) (rupees * 0.012);
        System.out.println(STR."\{rupees}₹ in dollar is \{dollar}$ ");

    }
}
