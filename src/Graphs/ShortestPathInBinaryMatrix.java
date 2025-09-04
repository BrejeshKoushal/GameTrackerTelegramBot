package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {
    static class Pair{
        int row;
        int col;
        int dist;

        public Pair(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0,1));
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
//        for (int i = 0 ; i < grid.length ; i++){
//            for (int j = 0 ; j < grid[i].length ; j++){
//                if (grid[i][j]==1) visited[i][j]=true;
//            }
//        }
        visited[0][0]=true;
        int[] dRow = {0 ,0 ,-1,+1,-1,+1,-1,+1};
        int[] dCol = {-1,+1, 0, 0,-1,-1,+1,+1};
        while (!q.isEmpty()){
            Pair pair = q.remove();
            int row = pair.row;
            int col = pair.col;
            int dist = pair.dist;
            if(row == m-1 && col == n-1){
                return dist;
            }
            for (int i = 0 ; i < 8 ; i++){
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];
                if ( nRow>=0 && nRow < m && nCol>=0 && nCol<n && grid[nRow][nCol]!=1 &&  !visited[nRow][nCol]){
                    visited[nRow][nCol]=true;
                    q.add(new Pair(nRow,nCol,dist+1));
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] grid = {{1,0,0},
                        {1,1,0},
                        {1,1,0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }
}
