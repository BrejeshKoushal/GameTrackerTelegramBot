package Graphs;

import java.util.Arrays;

public class BipartiteGraph {
    static int[]color;
    public static boolean dfs(int[][]graph , int col , int node){
        color[node] = col;
        for(int i : graph[node]){

            if(color[i]==-1){
                color[i] = 1-col;
                if(!dfs(graph,color[i],i)) return false;
            }
            else if(color[i]==col) return false;
        }
        return true;
    }
    public static boolean isBipartite(int[][]graph){
        color = new int[graph.length];
        Arrays.fill(color,-1);
        for(int i = 0 ; i < graph.length;i++){
            if(color[i]==-1){
             if(!dfs(graph, 0, i)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        System.out.println(isBipartite(graph));

    }
}
