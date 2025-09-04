package Graphs.TarjansAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BridgesInGraph {
    public int timer = 0;
    public void dfs(int node , int parent , int[]vis , int[] tin , int[] low , List<List<Integer>> finalList , List<List<Integer>> connections){
        vis[node] = 1;
        tin[node] = low[node] = timer;
        timer++;
        for (Integer it : connections.get(node)){
            if (it==parent) continue;
            if (vis[it]==0){
                dfs(it,node,vis,tin,low,finalList,connections);
                low[node] = Math.min(low[node],low[it]);
                if (low[it]>tin[node]){
                    finalList.add(Arrays.asList(it,node));
                }
            }
            else{
                low[node] = Math.min(low[node],low[it]);
            }
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> graph  = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            graph.add(new ArrayList<>());
        }
        for (List<Integer> ls : connections){
            int from = ls.get(0);
            int to = ls.get(1);
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        System.out.println(graph);
        int[] vis =  new int[n];
        int[] tin = new int[n];
        int[] low = new int[n];

        List<List<Integer>> ans =  new ArrayList<>();
        dfs(0,-1,vis,tin,low,ans,graph);
        return ans;
    }
    public void main(String[] args) {
        int n = 4;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0, 1));
        edges.add(Arrays.asList(1, 2));
        edges.add(Arrays.asList(2, 0));
        edges.add(Arrays.asList(1, 3));

        System.out.println(criticalConnections(n,edges));
    }
}
