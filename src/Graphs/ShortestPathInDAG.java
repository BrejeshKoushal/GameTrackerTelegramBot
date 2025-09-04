package Graphs;

import java.util.*;

public class ShortestPathInDAG {
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

        // Step 1: Topological sort using DFS
        boolean[] visited = new boolean[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                topoSort(i, visited, stack, graph);
            }
        }

        // Step 2: Relax edges in topological order
        int[] distance = new int[N];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0; // Source node

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (distance[node] != Integer.MAX_VALUE) {
                for (Pair pair : graph.get(node)) {
                    int adjNode = pair.node;
                    int weight = pair.dist;

                    if (distance[node] + weight < distance[adjNode]) {
                        distance[adjNode] = distance[node] + weight;
                    }
                }
            }
        }

        // Replace unreachable nodes with -1
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                distance[i] = -1;
            }
        }

        return distance;
    }

    private void topoSort(int node, boolean[] visited, Stack<Integer> stack, List<List<Pair>> graph) {
        visited[node] = true;

        for (Pair pair : graph.get(node)) {
            if (!visited[pair.node]) {
                topoSort(pair.node, visited, stack, graph);
            }
        }

        stack.push(node);
    }

    public static void main(String[] args) {
        ShortestPathInDAG obj = new ShortestPathInDAG();
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
        System.out.println(Arrays.toString(obj.shortestPath(N, M, edge)));
    }
}
