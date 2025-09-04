package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please , enter the size of the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Please enter the elements of the array");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the first index : ");
        int index1 = scanner.nextInt();
        System.out.println("Enter the second index : ");
        int index2 = scanner.nextInt();
        swap(arr , index1 , index2);
        System.out.print(Arrays.toString(arr));

        }
        static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        }
    }

