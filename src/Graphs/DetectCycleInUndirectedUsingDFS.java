package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetectCycleInUndirectedUsingDFS {
    public boolean helper(List<Integer>[] adj,int i , boolean[] visited , int parent){
        visited[i] = true;
        for(int connected : adj[i]){
            if(!visited[connected]) {
               if(helper(adj, connected, visited, i))
                   return true;
            }
            else if(connected!=parent) return true;
        }
        return false;
    }
    public boolean isCycle(int V, List<Integer>[] adj) {
        boolean[] visited = new boolean[V];
        for(int i = 0 ; i < V ; i++) {
            if (!visited[i]) {
                if (helper(adj, i, visited, -1)) return true;
            }
        }
        return false;
    }

    public void main(String[] args) {
        int V = 6;
        List<Integer>[] adj = new ArrayList[V];
        for(int i = 0 ; i < adj.length;i++){
            adj[i] = new ArrayList<>();
        }
        adj[0].addAll(Arrays.asList(1, 3));
        adj[1].addAll(Arrays.asList(0, 2, 4));
        adj[2].addAll(Arrays.asList(1, 5));
        adj[3].addAll(Arrays.asList(0, 4));
        adj[4].addAll(Arrays.asList(1, 3, 5));
        adj[5].addAll(Arrays.asList(2, 4));
        boolean ans = isCycle(V,adj);
        System.out.println(ans);
    }
}
