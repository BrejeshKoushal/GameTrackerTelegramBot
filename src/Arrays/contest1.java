package Arrays;

public class contest1 {
    public void main(String[] args) {
        int[][]arr = {{2,1,5},
                     {7,10,0},
                     {12,6,4}};
        System.out.println(countPathsWithXorValue(arr,11));
    }
    public int helper(int[][]grid,int rows , int col ,int  count , int xor,int k){
        if(rows == grid.length-1 && col == grid[0].length-1 && xor==k) {
            count++;
            return count;
        }
        if(rows< grid.length-1) {
            helper(grid, rows + 1, col, count,xor ^ grid[rows][col] , k);
        }
        xor^=grid[rows][col];
        if(col<grid[0].length-1) {
            helper(grid, rows, col + 1, count, xor ^ grid[rows][col], k);
        }
        xor^=grid[rows][col];
        return count;
    }
    public int countPathsWithXorValue(int[][] grid, int k) {
        return helper(grid,0,0,0,0,k);
        }
    }
