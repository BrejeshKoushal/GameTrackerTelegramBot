package binarysearch;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array in a sorted format : ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the key whose index you want to search for : ");
        int key = scanner.nextInt();
        int ans = binarySearch(arr , key);
        System.out.println(STR."The key \{key} is present at index number \{ans}");
    }
    static int binarySearch(int[] arr , int key){
        
        int start = 0 ;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start  + (end - start)/2;

            if(key < arr[mid])
            {
                end = mid-1;
            }
            else if(key>arr[mid]){
                start = mid + 1;
            }
            else
                return mid;

        }
        return -1;
        
    }
}
