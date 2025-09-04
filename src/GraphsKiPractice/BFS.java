package GraphsKiPractice;

import java.util.*;

public class BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        int[] vis = new int[adj.size()];
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(0);
        vis[0] = 1;
        while (!q.isEmpty()){
            int node = q.remove();
            ans.add(node);
            for (Integer it : adj.get(node)){
                if (vis[it] == 0){
                    vis[it]=1;
                    q.add(it);
                }
            }
        }
        return ans;
    }
    public void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(2,3,1)));
        list.add(new ArrayList<>(List.of(0)));
        list.add(new ArrayList<>(Arrays.asList(0,4)));
        list.add(new ArrayList<>(List.of(0)));
        list.add(new ArrayList<>(List.of(2)));
        System.out.println(bfs(list));
    }
}
