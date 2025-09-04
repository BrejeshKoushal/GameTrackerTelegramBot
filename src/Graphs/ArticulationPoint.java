package Graphs;

import Arrays.PlusOne;

import java.util.ArrayList;
import java.util.List;

public class ArticulationPoint {
    int timer = 0;
    int child = 0;
    public void dfs(int node , int parent , int[] vis , int[] tin , int[] low, int[] mark , List<List<Integer>> adj){
        vis[node] = 1;
        tin[node] = low[node] = timer;
        timer++;
        for (Integer it : adj.get(node)){
            if(it==parent) continue;
            if (vis[it]==0){
                dfs(it, node, vis, tin, low, mark, adj);
                low[node] = Math.min(low[node],low[it]);
                if (low[it]>=tin[node] && parent!=-1){
                    mark[node] = 1;
                }
                child++;
            }
            else{
                low[node] = Math.min(low[node],tin[it]);
            }

        }
        if(child>1 && parent==-1 ) {
            mark[node]=1;
        }
    }
    public List<Integer> articulationPoint(int n , List<List<Integer>> adj){
        int[] visited = new int[n];
        int[] tin = new int[n];
        int[] low =  new int[n];
        int[] mark = new int[n];
        for (int i = 0 ; i < n ;i++){
            if(visited[i]==0){
                dfs(i,-1,visited,tin,low,mark,adj);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            if (mark[i]==1){
                ans.add(i);
            }
        }
        if(ans.isEmpty()) ans.add(-1);
        return ans;
    }
}
