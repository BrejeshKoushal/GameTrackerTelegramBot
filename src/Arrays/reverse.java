package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scanner.nextInt();
        }
        reversearray(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr , int key1 , int key2){
        int temp = arr[key1];
        arr[key1] = arr[key2];
        arr[key2] = temp;
    }

    static void reversearray(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while(start<end){
            swap(arr , start , end);
        start++;
        end--;
        }
    }
}
