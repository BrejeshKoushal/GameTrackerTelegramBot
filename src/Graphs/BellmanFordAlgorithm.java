package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellmanFordAlgorithm {
    public static int[] bellman_ford(int V, List<List<Integer>> edges, int S) {
       int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[S]=0;
       for (int i = 0 ; i < V-1 ; i++){
           for (List<Integer> it : edges){
               int from = it.get(0);
               int to = it.get(1);
               int cost = it.get(2);
               if (dist[from]!=Integer.MAX_VALUE && dist[from]+cost < dist[to]){
                   dist[to] = dist[from]+cost;
               }
           }
       }
       for (List<Integer> it : edges){
           int from = it.get(0);
           int to = it.get(1);
           int cost = it.get(2);
           if (dist[from]!=Integer.MAX_VALUE && dist[from]+cost < dist[to]){
              return new int[]{-1};
           }
       }
       return dist;
    }
    public static void main(String[] args) {
         List<List<Integer>> edges =new ArrayList<>();
        edges.add(Arrays.asList(3, 2, 6));
        edges.add(Arrays.asList(5, 3, 1));
        edges.add(Arrays.asList(0, 1, 5));
        edges.add(Arrays.asList(1, 5, -3));
        edges.add(Arrays.asList(1, 2, -2));
        edges.add(Arrays.asList(3, 4, -2));
        edges.add(Arrays.asList(2, 4, 3));

        int S = 0,V = 6;
        System.out.println(Arrays.toString(bellman_ford(V, edges, S)));
    }
}
