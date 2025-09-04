package GraphsKiPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectedGraphCycle {
    public boolean dfs(int node , List<List<Integer>> graph , int[] vis , int[] pathVis){
        vis[node]=1;
        pathVis[node] =1;
        for (Integer it : graph.get(node)){
            if (vis[it]==0){
                return dfs(it,graph,vis,pathVis);
            }
            else if (pathVis[it]==1) return true;
        }
        pathVis[node]=0;
        return false;
    }
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] it : edges) {
            int from = it[0];
            int to = it[1];
            graph.get(from).add(to);
        }
        System.out.println(graph);
        int n = graph.size();
        int[] vis = new int[n];
        int[] pathVisited = new int[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                return dfs(i, graph, vis,pathVisited);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DirectedGraphCycle obj = new DirectedGraphCycle(); // create object
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 2},
                {2, 3}
        };
        int V = 4;
        System.out.println(obj.isCyclic(V,edges)); // call on object
    }
}
