package Graphs;

import java.util.PriorityQueue;

public class PathWithMaximumEffort {
    static class Pair implements Comparable<Pair>{
        int row;
        int col;
        int dist;

        public Pair(int row , int col , int dist) {
            this.row=row;
            this.col = col;
            this.dist=dist;
        }
        @Override
        public int compareTo(Pair other){
            return Integer.compare(this.dist,other.dist);
        }
    }
    public static int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int[][] distance = new int[m][n];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0 ; i < heights.length;i++){
            for (int j = 0 ; j < heights[i].length;j++){
                distance[i][j]=Integer.MAX_VALUE;
            }
        }
        distance[0][0]=0;
        pq.add(new Pair(0,0,0));
        int[] dRow = {0,-1,0,1};
        int[] dCol = {-1,0,1,0};
        int max = 0;
        while (!pq.isEmpty()) {
            Pair pair = pq.remove();
            int row = pair.row;
            int col = pair.col;
            int dist = pair.dist;
            for (int i = 0; i < 4; i++) {
                int nRow = dRow[i] + row;
                int nCol = dCol[i] + col;
                if (nRow >= 0 && nCol >= 0 && nCol < n && nRow < m) {
                    int maxDifference = Math.max(dist,Math.abs(heights[nRow][nCol]-heights[row][col]));
                    if(distance[nRow][nCol] > maxDifference) {
                        distance[nRow][nCol] = maxDifference;
                        pq.add(new Pair(nRow, nCol, maxDifference));
                    }
                }
            }
        }
        return distance[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] heights =  {{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        System.out.println(minimumEffortPath(heights));
    }
}
