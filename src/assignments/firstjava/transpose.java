package assignments.firstjava;

import java.util.Arrays;
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[1][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println((Arrays.deepToString(trans(arr))));


    }



    static int[][] trans(int[][] matrix) {
        int rowsize = matrix.length;
                int columnsize = matrix[0].length;

        int[][] ans = new int[columnsize][rowsize];
        for(int i = 0 ; i  < matrix.length ;i++){
            for(int j = 0 ; j<matrix[i].length ;j++){

                ans[j][i] = matrix[i][j];
            }

    
            

}
return ans;
    }


}
