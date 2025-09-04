package Graphs;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ShortestPathInBinaryMatrixUsingDijkstraAlgo {
        static class Pair implements Comparable<Pair>{
            int row;
            int col;
            int dist;

            public Pair(int row, int col, int dist) {
                this.row = row;
                this.col = col;
                this.dist = dist;
            }

            @Override
            public int compareTo(Pair other) {
                return Integer.compare(this.dist,other.dist) ;
            }
        }
    public static int shortestPathBinaryMatrix(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        if (grid[0][0] ==1 || grid[m-1][n-1] == 1) return -1;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0,1));
        int[][] distance = new int[m][n];
        for (int[] ints : distance) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }
        distance[0][0] = 1;
        int[] dRow = {0 ,0 ,-1,+1,-1,+1,-1,+1};
        int[] dCol = {-1,+1, 0, 0,-1,-1,+1,+1};
        while (!pq.isEmpty()){
            Pair pair = pq.remove();
            int row = pair.row;
            int col = pair.col;
            int dist = pair.dist;
            for (int i = 0 ; i < 8 ; i++){
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];
                if (nRow>=0 && nCol>=0 && nRow < m && nCol < n && grid[nRow][nCol]!=1){
                    if(distance[nRow][nCol] > dist + 1){
                        distance[nRow][nCol] = dist+1;
                        pq.add(new Pair(nRow,nCol,distance[nRow][nCol]));
                    }
                }
            }
        }
        if (distance[m-1][n-1]==Integer.MAX_VALUE) return -1;
        return distance[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] grid = {{0,0,0,0,1},
                        {1,0,0,0,0},
                        {0,1,0,1,0},
                        {0,0,0,1,1},
                        {0,0,0,1,0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }
}
