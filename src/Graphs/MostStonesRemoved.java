package Graphs;

import Graphs.DisjointSet.DisjointSet;

public class MostStonesRemoved {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        int clusters = 0;
        DisjointSet ds = new DisjointSet(n);
        for (int i = 0 ; i < n ; i++){
            ds.parent.set(i,i);
            ds.size.set(i,1);
        }
        for (int i = 0 ; i < n ; i++)
        {
            for (int j = i+1 ; j < n ; j++){
                if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]){
                    ds.unionBySize(i,j);
                }
            }
        }
        for (int i = 0 ; i < n ; i++){
            if (ds.parent.get(i)==i) clusters++;
        }

        return n - clusters;
    }
}
