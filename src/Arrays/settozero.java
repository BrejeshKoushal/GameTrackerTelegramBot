package Arrays;

import java.util.ArrayList;
import java.util.List;

public class settozero {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> column = new ArrayList<>();
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0 ; j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int i = 0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row.contains(i) || column.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
