package OOPS.exceptions;


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scanner =  new Scanner(System.in);
        try {
            for (int i = 0; i < 4; i++) {
                arr[i] = scanner.nextInt();
            }
            int index = 5;
            System.out.println(index+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
