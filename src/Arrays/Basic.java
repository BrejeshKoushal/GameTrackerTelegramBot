package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.print(STR."\{arr[i]} ");
        }
//        another easy and good method is to use toString
        System.out.print(Arrays.toString(arr));

    }
}
