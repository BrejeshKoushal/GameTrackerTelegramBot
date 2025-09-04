package Graphs;

public class NumberOfEnclaves {
    int[] dRow = {0,-1,0,+1};
    int[] dCol = {-1,0,+1,0};
    public void dfs(int row , int col , int[][] board , boolean[][] visited){
        int m = board.length;
        int n = board[0].length;
        visited[row][col] = true;
        for(int i = 0 ; i < 4 ; i++){
            int nRow = dRow[i] + row;
            int nCol = dCol[i] + col;
            if(nRow >=0 && nRow < m && nCol >=0 && nCol < n && board[nRow][nCol]==1 && !visited[nRow][nCol]){
                dfs(nRow,nCol,board,visited);
            }
        }
        }
    public int numEnclaves(int[][] grid) {
        int m = grid.length; //5
        int n = grid[0].length; //4
        boolean[][] visited = new boolean[m][n];
        for(int i = 0 ; i < n ; i++){
            if(grid[0][i]==1 && !visited[0][i]){
                dfs(0,i,grid,visited);
            }
            if(grid[m-1][i]==1 && !visited[m-1][i]){
                dfs(m-1,i,grid,visited);
            }
        }
        for(int i = 0 ; i < m ; i++){
            if(grid[i][0]==1 && !visited[i][0]){
                dfs(i,0,grid,visited);
            }
            if(grid[i][n-1]==1 && !visited[i][n-1]){
                dfs(i,n-1,grid,visited);
            }
        }
        int count = 0;
        for(int i = 1 ; i < m-1 ; i++){
            for(int j = 1 ; j < n-1 ; j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    count++;
                }
            }
        }
        return count;
        }
    public void main(String[] args) {
        int[][] grid = {{0,0,0,0},
                        {1,0,1,0},
                        {0,1,1,0},
                        {0,0,0,0}};
        System.out.println(numEnclaves(grid));
    }
}
