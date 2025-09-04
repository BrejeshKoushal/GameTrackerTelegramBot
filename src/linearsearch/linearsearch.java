package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {
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
        System.out.println("Enter the value whose index you want to find : ");
        int key = scanner.nextInt();
        int search = linearSearch(arr , key);
        System.out.println(STR."The value \{key} is found at index number \{search}");

    }
    static int linearSearch(int[] arr , int key){
        if(arr.length == 0 ){
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++){
                int element = arr[i];
                if(element == key){
                     return i;
                }
        }
        return -1;



    }
}
