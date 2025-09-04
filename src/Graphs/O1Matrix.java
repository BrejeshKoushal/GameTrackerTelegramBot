package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class O1Matrix {
    class Pair{
        int row;
        int col;
        int dist;

        public Pair(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for(int i = 0 ; i < m;i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = true;
                } else visited[i][j] = false;
            }
        }
        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,+1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int dist = q.peek().dist;
            q.remove();
            ans[row][col] = dist;
            for(int i = 0 ; i < 4 ;i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];
                if(nrow>=0 && ncol>=0 && nrow<m&&ncol<n&& !visited[nrow][ncol]){
                    visited[nrow][ncol]=true;
                    q.add(new Pair(nrow,ncol,dist+1));
                }
            }
        }
        return ans;
    }

    public void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }
}
