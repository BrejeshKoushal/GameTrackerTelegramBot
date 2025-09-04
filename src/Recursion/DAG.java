package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DAG {
    public void main(String[] args) {
        int[][] graph = {{1,2},{3},{3},{}};
        System.out.println(allPathsSourceTarget(graph));
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        solver(ans,0,graph.length-1,new ArrayList<>(),graph);
        return ans;
    }

    public void solver(List<List<Integer>> ans, int src, int dest, List<Integer> list, int[][] graph) {
        list.add(src);
        if (src == dest){
            ans.add(new ArrayList<>(list));
        }
        else {
            for(int i:graph[src])
                solver(ans, i, dest, list, graph);
        }
        list.removeLast();
    }
}

