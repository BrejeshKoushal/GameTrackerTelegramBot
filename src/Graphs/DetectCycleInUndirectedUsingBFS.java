package Graphs;

import java.util.*;

public class DetectCycleInUndirectedUsingBFS {
    class Pair{
        int Node;
        int Parent;

        public Pair(int node, int parent) {
            Node = node;
            Parent = parent;
        }
    }
    public boolean helper(List<Integer>[] adj , int src , boolean[] vis){
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty()){
            int node = q.peek().Node;
            int parent = q.peek().Parent;
            q.remove();
            for(int adjacentNode : adj[node]){
                if(!vis[adjacentNode]){
                    vis[adjacentNode] = true;
                    q.add(new Pair(adjacentNode,node));
                }
                else if(adjacentNode!=parent) return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, List<Integer>[] adj) {
        boolean[] vis = new boolean[V];
        for(int i = 0 ; i < V;i++){
            if(!vis[i]){
                if (helper(adj,i,vis)) return true;
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
