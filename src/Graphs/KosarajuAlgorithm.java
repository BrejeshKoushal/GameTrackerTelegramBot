package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class KosarajuAlgorithm {
    public void dfs(int[] vis , List<List<Integer>> adj , int node , Stack<Integer> st){
        vis[node]=1;
        for (Integer it : adj.get(node)){
            if(vis[it]==0){
                dfs(vis, adj, it,st);
            }
        }
        st.push(node);
    }
    public void dfs(int node , int[] vis , List<List<Integer>> revGraph ){
        vis[node]=1;
        for (Integer it : revGraph.get(node)){
            if(vis[it]==0){
                dfs(it,vis, revGraph);
            }
        }
    }
    public int kosaraju(int V, List<List<Integer>> adj) {
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < V ; i++){
            dfs(vis,adj,i,st);
        }
        List<List<Integer>> revGraph = new ArrayList<>();
        for (int i = 0 ; i < V ; i++){
            revGraph.add(new ArrayList<>());
        }
//
        for (int i = 0 ; i < V ; i++){
            vis[i] = 0;
            for (Integer it : adj.get(i)){
                // i -> it
                // it -> i
                revGraph.get(it).add(i);
            }
        }
        int scc = 0;
        while (!st.isEmpty()){
            int node = st.pop();
            if (vis[node]==0){
                scc++;
                dfs(node,vis,revGraph);
            }
        }
        return scc;
    }
    public void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(0,2));
        adj.add(Arrays.asList(1,0));
        adj.add(Arrays.asList(2,1));
        adj.add(Arrays.asList(0,3));
        adj.add(Arrays.asList(3,4));
        System.out.println(kosaraju(V,adj));
    }
}
