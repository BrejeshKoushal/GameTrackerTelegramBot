package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class discountprince {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list price : ");
        float list_price = scanner.nextInt();
        System.out.println("enter the selling price : ");
        float selling_price = scanner.nextInt();
        float discount  = (float) (list_price-selling_price);
        float discountpercent =(float) (discount/list_price)*100;
        System.out.println(STR."\{discountpercent}%");
    }
}
