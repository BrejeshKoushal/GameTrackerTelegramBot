package Graphs;

import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;

public class DijkstraAlgorithm {
    class Pair implements Comparable<Pair>{
        int dist;
        int node;

        public Pair(int dist, int node) {
            this.dist = dist;
            this.node = node;
        }
        @Override
       public int compareTo(Pair other){
            return Integer.compare(this.dist,other.dist);
        }
    }
    public  int[] dijkstra(int V, List<List<List<Integer>>> adj, int S , int D){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] distance = new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[S] = 0;
        int[] parent = new int[V];
        for (int i = 0 ; i < V ;i++){
            parent[i] = i;
        }
        pq.add(new Pair(0,S));
        while (!pq.isEmpty()) {
            Pair pair = pq.remove();
            int node = pair.node;
            int dist = pair.dist;
            for (List<Integer> list : adj.get(node)) {
                int val = list.get(0);
                int weight = list.get(1);
                if (distance[val] > dist + weight) {
                    distance[val] = dist + weight;
                    parent[val] = node;
                    pq.add(new Pair(distance[val], val));
                }
            }
        }
            List<Integer> path = new ArrayList<>();
        for (int j : distance) {
            if (j == Integer.MAX_VALUE) path.add(-1);
        }
            for (int i : distance){
                if (i==-1) return path.stream().mapToInt(Integer::intValue).toArray();
            }
            int n = D;
            while (parent[n]!=n){
                path.add(n);
                n = parent[n];
            }
            path.add(S);
        Collections.reverse(path);
        return path.stream().mapToInt(Integer::intValue).toArray();
    }
    public  void main(String[] args) {
       int V = 5, S=0,D = 4;
        int[][][] graph = {
                {{1, 4}, {2, 1}},       // node 0 → 1 (4), → 2 (1)
                {{3, 1}},               // node 1 → 3 (1)
                {{1, 2}, {3, 5}},       // node 2 → 1 (2), → 3 (5)
                {{4, 3}},               // node 3 → 4 (3)
                {}                      // node 4 → no outgoing edges
        };

        List<List<List<Integer>>> list = new ArrayList<>();
       for (int[][]twoD : graph ){
           List<List<Integer>> temp2DList = new ArrayList<>();
           for (int [] oneD : twoD){
               List<Integer> temp1DList = new ArrayList<>();
               for (int val : oneD){
                   temp1DList.add(val);
               }
               temp2DList.add(temp1DList);
           }
           list.add(temp2DList);
       }
        System.out.println(Arrays.toString(dijkstra(V, list, S , D)));
    }
}
