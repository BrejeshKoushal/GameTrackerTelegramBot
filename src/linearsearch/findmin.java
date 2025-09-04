package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class findmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i  < size  ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        min(arr);
    }
    static void min(int[] arr){
        if(arr.length == 0){
            return;
        }
        int min = arr[0];
        for(int i = 1 ; i  < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println(STR."The minimum number in the array is \{min}");

    }
}

