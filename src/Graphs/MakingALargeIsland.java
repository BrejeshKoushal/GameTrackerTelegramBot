package Graphs;

import Graphs.DisjointSet.DisjointSet;

import java.util.HashSet;

public class MakingALargeIsland {
    public static boolean isValid(int row , int col , int n){
        return row>=0 && row<n && col>=0 && col < n;
    }
    public static int largestIsland(int[][] grid) {
        int n = grid.length;
        DisjointSet ds = new DisjointSet(n * n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) continue;
                int[] dRow = {1, -1, 0, 0};
                int[] dCol = {0, 0, 1, -1};
                for (int adj = 0; adj < 4; adj++) {
                    int nRow = dRow[adj] + i;
                    int nCol = dCol[adj] + j;
                    if (isValid(nRow, nCol, n) && grid[nRow][nCol] == 1) {
                        int node = i * n + j;
                        int adjNode = nRow * n + nCol;
                        ds.unionBySize(node, adjNode);
                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) continue;
                int[] dRow = {1, -1, 0, 0};
                int[] dCol = {0, 0, 1, -1};
                HashSet<Integer> components = new HashSet<>();
                for (int adj = 0; adj < 4; adj++) {
                    int nRow = dRow[adj] + i;
                    int nCol = dCol[adj] + j;
                    if (isValid(nRow, nCol, n)) {
                        if (grid[nRow][nCol] == 1) {
                            components.add(ds.findUltimateParent(nRow * n + nCol));
                        }
                    }
                }
                    int size = 0;
                    for (Integer set : components) {
                        size += ds.size.get(set);
                    }
                    max = Math.max(max, size+1);
            }
        }
        for (int i = 0; i < n * n; i++) {
            max = Math.max(max, ds.size.get(ds.findUltimateParent(i)));
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1},{1,1}};
        System.out.println(largestIsland(grid));
    }
}
