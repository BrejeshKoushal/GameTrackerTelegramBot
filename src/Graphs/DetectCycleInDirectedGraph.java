package Graphs;

public class DetectCycleInDirectedGraph {
    public boolean dfs(int node,int[][]mat , boolean[]visited , boolean[]pathVisited ){
        visited[node] = true;
        pathVisited[node]=true;
        for(int i : mat[node]){
            if(!visited[i]){
                if(dfs(i, mat, visited, pathVisited)) return true;
            }
            else{
                if(pathVisited[i]) return true;
            }
        }
        pathVisited[node]=true;
        return false;
    }
    public boolean isCyclic(int N, int[][] mat) {
        boolean[] visited = new boolean[N];
        boolean[] pathVisited = new boolean[N];
        for(int i = 0 ; i < N ; i++){
            if(!visited[i]){
                if(dfs(i, mat, visited, pathVisited)) return true;
            }
        }
        return false;
    }
    public void main(String[] args) {
        int V = 6;
        int[][] adj= { {1}, {2, 5}, {3}, {4}, {1}, { } };
        System.out.println(isCyclic(V,adj));
    }
}
