package Graphs;

public class SurroundedRegions {
    int[] dRow = {0,-1,0,+1};
    int[] dCol = {-1,0,+1,0};
    public void dfs(int row , int col , char[][] board , boolean[][] visited){
        int m = board.length;
        int n = board[0].length;
        visited[row][col] = true;
        for(int i = 0 ; i < 4 ; i++){
            int nRow = dRow[i] + row;
            int nCol = dCol[i] + col;
            if(nRow >=0 && nRow < m && nCol >=0 && nCol < n && board[nRow][nCol]=='O' && !visited[nRow][nCol]){
                dfs(nRow,nCol,board,visited);
            }
        }
    }
    public void solve(char[][] board){
        int m = board.length; //5
        int n = board[0].length; //4
        boolean[][] visited = new boolean[m][n];
        for(int i = 0 ; i < n ; i++){
            if(board[0][i]=='O' && !visited[0][i]){
                dfs(0,i,board,visited);
            }
            if(board[m-1][i]=='O' && !visited[m-1][i]){
                dfs(m-1,i,board,visited);
            }
        }
        for(int i = 0 ; i < m ; i++){
            if(board[i][0]=='O' && !visited[i][0]){
                dfs(i,0,board,visited);
            }
            if(board[i][n-1]=='O' && !visited[i][n-1]){
                dfs(i,n-1,board,visited);
            }
        }
        for(int i = 1 ; i < m-1 ; i++){
            for(int j = 1 ; j < n-1 ; j++){
                if(board[i][j]=='O'&&!visited[i][j]){
                    board[i][j]='X';
                }
            }
        }
        for (int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void main(String[] args) {
        char[][] board = {{'X','X','X','X'},
                          {'X','O','O','X'},
                          {'X','X','O','X'},
                          {'O','O','X','X'},
                          {'X','O','X','X'}};
        solve(board);
    }
}
