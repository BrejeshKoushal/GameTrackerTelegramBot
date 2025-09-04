package OOPS.exceptions;

import java.util.Scanner;

public class brejesh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        try {
            for(int i = 0 ; i  < size ;i++){
               arr[i] = scanner.nextInt();
            }
            int index = size;
            System.out.println(index + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
