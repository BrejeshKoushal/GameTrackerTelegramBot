package Recursion;

public class PathWithMaximumGold {
    public void main(String[] args) {
        int[][] arr = {{0,6,0},{5,8,7},{0,9,0}};
        System.out.println(getMaximumGold(arr));
    }
    int max = 0;
    public int getMaximumGold(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) continue;
                solver(grid,i,j,0);
            }
        }
        return max;
    }



    public void solver(int[][] mat, int i, int j, int sum) {

        if (i >= mat.length || i < 0 || j >= mat[0].length || j < 0 || mat[i][j] == '$' || mat[i][j] == 0) {
            max=Math.max(sum,max);
            return;
        }
        int temp = mat[i][j];
        mat[i][j] = '$';
        solver(mat,i,j+1,sum+temp);
        solver(mat,i,j-1,sum+temp);
        solver(mat,i+1,j,sum+temp);
        solver(mat,i-1,j,sum+temp);
        mat[i][j]=temp;

    }
}