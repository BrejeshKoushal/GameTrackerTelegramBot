package Graphs;

public class NumberOfIslands {
    public static void dfs(char[][]grid , int i , int j , boolean[][]visited){
       int m = grid.length;
       int n = grid[0].length;
       if (i<0 || j < 0 || i>=m || j>=n || grid[i][j]=='0' ||visited[i][j]) return;

       visited[i][j]=true;
       dfs(grid,i-1,j,visited);
       dfs(grid,i+1,j,visited);
       dfs(grid,i,j-1,visited);
       dfs(grid,i,j+1,visited);

    }
    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0 ; j < grid[i].length ; j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        System.out.println(numIslands(grid));
    }

}
