package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class maxfromarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please , enter the size of the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Please enter the elements of the array");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print(STR."The biggest element of the array is \{max(arr)}");

    }
    static int max(int[] arr){
        int maxval = arr[0];
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }


    }


