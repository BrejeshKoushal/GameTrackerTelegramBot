package Graphs;

import Graphs.DisjointSet.DisjointSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KruskalsAlgorithm {
    static class Pair implements Comparable<Pair>{
        int from;
        int to;
        int cost;

        public Pair(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair o) {
            return this.cost-o.cost;
        }
    }
    public static int spanningTree(int V, List<List<List<Integer>>> adj){
        List<Pair> list = new ArrayList<>();
        for (int i = 0 ; i < V ; i++){
            for (int j = 0 ; j < adj.get(i).size();j++){
                int from = i;
                int to =  adj.get(i).get(j).get(0);
                int cost = adj.get(i).get(j).get(1);
                list.add(new Pair(from,to,cost));
            }
        }
        Collections.sort(list);
        DisjointSet ds = new DisjointSet(V);
        int mstWeight = 0;
        for (Pair pair : list) {
            int from = pair.from;
            int to = pair.to;
            int wt = pair.cost;
            if (ds.findUltimateParent(from) != ds.findUltimateParent(to)) {
                mstWeight += wt;
                ds.unionBySize(from, to);
            }
        }
        return mstWeight;
    }
    public static void main(String[] args) {
        List<List<List<Integer>>> list = new ArrayList<>();

        list.add(Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(3, 4)
        ));

        list.add(Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(2, 2)
        ));

        list.add(Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 3)
        ));

        list.add(Arrays.asList(
                Arrays.asList(2, 3),
                Arrays.asList(0, 4)
        ));
        int V = 4;
        System.out.println(spanningTree(V,list));
    }

}
