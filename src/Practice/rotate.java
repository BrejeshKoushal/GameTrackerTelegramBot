package Practice;

public class rotate {
    public void rotates(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < n ;i++){
            for(int j = i ; j < n ;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        rotates(matrix);
    }
}
