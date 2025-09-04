package Graphs;


import java.util.*;

public class ShortestPathInDAGWithoutTopoSort     {
    class Pair {
        int node;
        int dist;

        public Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public String toString() {
            return "(" + node + ", " + dist + ")";
        }
    }

    public int[] shortestPath(int N, int M, int[][] edges) {
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(new Pair(edge[1], edge[2]));
        }

        int[] distance = new int[N];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int node = q.remove();
            for (int i = 0; i < graph.get(node).size(); i++) {
                Pair pair = graph.get(node).get(i);
                int element = pair.node;
                int dist = pair.dist;

                if (distance[node] + dist < distance[element]) {
                    distance[element] = distance[node] + dist;
                    q.add(element);
                }
            }
        }

        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                distance[i] = -1;
            }
        }

        return distance;
    }

    public void main(String[] args) {
        int N = 6, M = 7;
        int[][] edge = {
                {0, 1, 2},
                {0, 4, 1},
                {4, 5, 4},
                {4, 2, 2},
                {1, 2, 3},
                {2, 3, 6},
                {5, 3, 1}
        };

        System.out.println(Arrays.toString(shortestPath(N, M, edge)));
    }
}

