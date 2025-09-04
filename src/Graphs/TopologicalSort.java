package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class TopologicalSort {

    public void dfs(int node , int[][]mat , Stack<Integer> st , boolean[] visited){
        visited[node] = true;
        for(int i : mat[node]){
            if(!visited[i]){
                dfs(i,mat,st,visited);
            }
        }
        st.push(node);

    }
    public ArrayList<Integer> topoSort(int V, int[][] mat) {
        boolean[]visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < V ; i++){
            if (!visited[i]){
                dfs(i,mat,st,visited);
            }
        }
        // Preferred: pop to maintain topological order
        ArrayList<Integer> ans = new ArrayList<>();
        while (!st.isEmpty()) {
            ans.add(st.pop());
        }

        return ans;
    }
    public void main(String[] args) {
        int V = 6;
        int[][] adj={ { }, {3}, {2}, {}, {0,1}, {0,2} };
        System.out.println(topoSort(V,adj));

    }
}
