package assignments.firstjava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int[] array : arr) {
            System.out.print(Arrays.toString(array));
            System.out.println();
        }
        System.out.println(diagonalSum(arr));
    }

    static int diagonalSum(int[][] mat) {
        int count =0;
        int n = mat.length;
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < n;j++){
                if(i==j){
                    count+=mat[i][j];
                }
                    if(i+j== mat.length-1){
                        count+=mat[i][j];

                }
            }
        }



return n % 2 == 1 ? count-mat[n/2][n/2] : count ;
    }

}
