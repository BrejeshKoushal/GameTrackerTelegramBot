package switchcase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fruit");
        String fruit = scanner.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("It is red in colour");
                break;
            case "Orange":
                System.out.println("It is orange in colour LOL");
                break;
            default:
                System.out.println("Please enter a valid fruit");
                break;
        }
    }
}
