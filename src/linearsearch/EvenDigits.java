package linearsearch;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array :  ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Please enter the elements of the array");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(findNumbers(arr));

    }
//    function to check number of numbers with even numbers
    static int findNumbers(int[]arr){
        int count = 0;
        for(int nums:arr){
            if(even(nums)){
                count++;
            }
        }
        return count;
    }
//function to check when a number contains even digits or not
    static boolean even(int num){
        int numofDigits = digits(num);
        return numofDigits % 2 == 0;
    }
//    function to count number of digits in a number
    static int digits(int num){
        if(num<0){
            num = num*-1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }
}