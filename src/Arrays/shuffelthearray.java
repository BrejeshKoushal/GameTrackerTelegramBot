package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class shuffelthearray {
//    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn]
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = {1,2,3,4,5,6};
    int n = 3;
    System.out.println(Arrays.toString(shuffle(arr, n)));
}
    static int[] shuffle(int[] num , int n){

        int[] result = new int[2*n];
        for(int i = 0; i< n ;i++){
            result[2*i] = num[i];
            result[2*i + 1] =num[i+n];
        }
        return result;


    }


}
