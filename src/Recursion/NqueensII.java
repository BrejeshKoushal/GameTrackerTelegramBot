package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NqueensII {
    public void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
    int count=0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n;i++){
            for(int j =0;j<n;j++){
                board[i][j]='X';
            }
        }
        solver(board,0,n);
        return count;
    }
    public boolean IsSafe(char[][]board,int row , int col , int n){
        int fakerow = row;
        int fakecol = col;
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        row = fakerow;
        col = fakecol;
        while(row>=0&&col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row = fakerow;
        col = fakecol;
        while(row<n&&col>=0){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
    public void solver(char[][] board, int col ,int n){

        if(col==n){
            count+=1;
            return;
        }
        for(int i = 0 ;i<n;i++){
            if(IsSafe(board,i,col,n)){
                board[i][col]='Q';
                solver(board,col+1,n);
                board[i][col]='X';
            }
        }
    }
}
