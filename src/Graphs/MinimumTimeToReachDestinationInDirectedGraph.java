package Graphs;

import java.util.*;

public class MinimumTimeToReachDestinationInDirectedGraph {
    public static class Pair{
        int node;
        int currentTime;

        public Pair(int node, int currentTime) {
            this.node = node;
            this.currentTime = currentTime;
        }
    }
    public static int minTime(int n, int[][] edges) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(new int[]{edge[1], edge[2], edge[3]});
        }
        System.out.println(graph);
        int[] distance = new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.currentTime));
        pq.add(new Pair(0,0));
        while (!pq.isEmpty()){
            Pair pair = pq.remove();
            int node = pair.node;
            int currentTime = pair.currentTime;
            if (node == n-1) return currentTime;
            if (currentTime > distance[node]) continue;
            for (int[] edge : graph.get(node)){
                int val = edge[0];
                int s_t = edge[1];
                int e_t = edge[2];
                int traversalTime;
                if (currentTime<=s_t) traversalTime = s_t+1;
                else if (currentTime<=e_t) traversalTime = currentTime+1;
                else continue;
                if (traversalTime   < distance[val]){
                    distance[val]= traversalTime;
                    pq.add(new Pair(val,traversalTime));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1,0,3},{1,3,7,8},{0,2,1,5},{2,3,4,7}};
        System.out.println(minTime(4,edges));
    }
}
