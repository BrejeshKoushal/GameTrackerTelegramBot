package Graphs;

import java.util.*;

public class ShortestPathInUndirectedGraph {
    public int[] shortestPath(int[][] edges, int N, int M , int src) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }
        System.out.println(graph);
        int[] dist = new int[N];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int i : graph.get(node)) {
                if (dist[node] + 1 < dist[i]) {
                    dist[i] = dist[node] + 1;
                    q.add(i);
                }
            }
        }
        for (int i : dist){
            if (i == Integer.MAX_VALUE) {
                i = -1;
            }
        }

        return dist;
    }
    public void main(String[] args) {
        int[][]edges = { {0,1},{0,3},{3,4},{4,5},{5, 6},{1,2},{2,6},{6,7},{7,8},{6,8} };
        int n = 9 , m = 10;
        System.out.println(Arrays.toString(shortestPath(edges, n, m,0)));
    }
}
