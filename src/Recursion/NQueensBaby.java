package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueensBaby {
    public void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }
        solve(0,board,n,ans);
        return ans;
    }
    public boolean IsSafe(char[][]board , int row , int col, int n){
        int newRow = row;
        int newCol = col;

        while(row>=0&&col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        col = newCol;
        row = newRow;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }

        row = newRow;
        col = newCol;
        while(row<n &&col>=0){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }

    public void solve(int col, char[][] board, int n, List<List<String>> ans) {
        if (col == n) {
            ans.add(makeList(board));
            return;
        }
        for(int i = 0 ; i < board.length ; i++){
            if(IsSafe(board,i,col,n)){
                board[i][col]='Q';
                solve(col+1,board,n,ans);
                board[i][col] = '.';
            }
        }
    }
    public List<String> makeList(char[][]board){
        List<String> list = new ArrayList<>();
        for(char[] arr : board){
            list.add(String.valueOf(arr));
        }
        return list;
    }
}