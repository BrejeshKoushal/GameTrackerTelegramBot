package Graphs;

import java.util.PriorityQueue;

public class SwimInWater {
     static class Pair implements Comparable<Pair>{
         int row;
         int col;
         int cost;

         public Pair(int row,int col, int cost) {
             this.row = row;
             this.col = col;
             this.cost = cost;
         }

         @Override
         public int compareTo(Pair o) {
             return this.cost - o.cost;
         }
    }
    public static int swimInWater(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dist = new int[m][n];
        for (int i = 0 ; i < m;i++){
            for (int j = 0 ; j < n ;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        dist[0][0]= grid[0][0];
        int[] dRow = {1,-1,0,0};
        int[] dCol = {0,0,-1,1};
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0,grid[0][0]));
        while (!pq.isEmpty()){
            Pair pair = pq.remove();
            int row = pair.row;
            int col = pair.col;
            int cost = pair.cost;
            for (int i = 0 ; i < 4 ; i++){
                int nRow = dRow[i]+row;
                int nCol = dCol[i]+col;
                if (nRow>=0 && nCol>=0 && nRow < m && nCol < m){
                    int distance = Math.max(grid[nRow][nCol] , cost);
                    if (distance < dist[nRow][nCol]){
                        dist[nRow][nCol] = distance;
                        pq.add(new Pair(nRow,nCol,distance));
                    }

                }
            }
        }
        return dist[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grid = {
                {3,2},
                {0,1}
        };

        System.out.println(swimInWater(grid));
    }
}
