package Practice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumPathSum {
    class Pair implements Comparable<Pair>{
        int distance;
        int row;
        int col;

        public Pair(int distance, int row, int col) {
            this.distance = distance;
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(Pair o) {
            return this.distance-o.distance;
        }
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dist = new int[m][n];
        for (int[] di : dist){
            Arrays.fill(di,Integer.MAX_VALUE);
        }
        dist[0][0]=grid[0][0];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(grid[0][0],0,0));
        int[] drow = {0,1};
        int[] dcol = {1,0};
        while (!pq.isEmpty()){
            Pair pair = pq.poll();
            int distance = pair.distance;
            int row = pair.row;
            int col = pair.col;
            for (int i = 0 ; i< 2 ; i++){
             int nrow = row + drow[i];
             int ncol = col + dcol[i];
             if (nrow < m && ncol < n) {
                 if (dist[nrow][ncol] > distance + grid[nrow][ncol]) {
                     dist[nrow][ncol] = distance + grid[nrow][ncol];
                     pq.add(new Pair(dist[nrow][ncol], nrow, ncol));
                 }
             }
            }
        }
        return dist[m-1][n-1];
    }
    public void main(String[] args) {
            int[][] grid = {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(grid));
    }
}
