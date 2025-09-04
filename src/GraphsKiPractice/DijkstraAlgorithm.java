package GraphsKiPractice;

import java.util.*;

public class DijkstraAlgorithm {
    static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }


        @Override
        public int compareTo(Pair o) {
            return this.cost-o.cost;
        }
    }
    public static int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        List<List<List<Integer>>> graph = new ArrayList<>();
        for (int i = 0 ; i < V ; i++){
            graph.add(new ArrayList<>());
        }
        for (int[] it : edges){
            int from = it[0];
            int to = it[1];
            int cost = it[2];
            List<Integer> temp = new ArrayList<>();
            temp.add(to);
            temp.add(cost);
            graph.get(from).add(temp);
            List<Integer> revTemp = new ArrayList<>();
            revTemp.add(from);
            revTemp.add(cost);
            graph.get(to).add(revTemp);
        }

        int[] dist = new int[V];
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        pq.add(new Pair(src,0));
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        while (!pq.isEmpty()){
            Pair pair = pq.remove();
            int node = pair.node;
            int dis = pair.cost;
            for (List<Integer> l : graph.get(node)){
                int n = l.get(0);
                int cost = l.get(1);
                if (dis + cost < dist[n]){
                    dist[n] = dis+cost;
                    pq.add(new Pair(n,dist[n]));
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int V = 3;
        int[][] edges = {
                {0, 1, 1},
                {1, 2, 3},
                {0, 2, 6}
        };
        int src = 2;
        System.out.println(Arrays.toString(dijkstra(V, edges, src)));
    }
}