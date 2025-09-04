package Graphs;

import Graphs.DisjointSet.DisjointSet;

import javax.swing.*;

public class MostStonesOptimized {
    public int removeStones(int[][] stones) {
        int maxRow = 0;
        int maxCol = 0;
        for (int[] i : stones){
            maxRow = Math.max(maxRow,i[0]);
            maxCol = Math.max(maxCol,i[1]);
        }
        DisjointSet ds = new DisjointSet(maxRow+maxCol+1);
        for (int[] i : stones){
            int row = i[0];
            int col = i[1]+maxRow+1;
            ds.unionBySize(row,col);
        }
        int cluster = 0;
        for (int i = 0 ; i <maxRow+maxCol+1 ; i++){
            if (ds.parent.get(i)==i && ds.size.get(i)>1)  cluster++;
        }
        return stones.length-cluster;
    }
}
