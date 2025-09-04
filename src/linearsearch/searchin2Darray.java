package linearsearch;
import java.util.*;
public class searchin2Darray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter the size of the columns : ");
        int columns = scanner.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int[] array : arr) {
            System.out.print(Arrays.toString(array));
            System.out.println();
        }
        System.out.println("Enter the element you want to search : ");
        int element = scanner.nextInt();
        int[] ans_array = search(arr , element);
        System.out.println(Arrays.toString(ans_array));

    }
    static int[] search(int[][]arr , int key){

        for(int i =  0 ; i < arr.length ; i ++){
            for(int j = 0 ; j < arr[i].length ; i++){
                if(arr[i][j] == key){
                    return new int[]{i , j};
                }
            }
        }
        return new int[] {-1 ,-1};

    }


}
