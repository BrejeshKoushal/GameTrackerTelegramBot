package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Twodimension_array {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int[] array : arr) {
            System.out.print(Arrays.toString(array));
            System.out.println();
        }


    }

}
