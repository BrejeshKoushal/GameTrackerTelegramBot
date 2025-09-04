package Graphs;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0 ; i < numCourses ; i++){
            list.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            list.get(prerequisite[0]).add(prerequisite[1]);
        }
        System.out.println(list);
        int[] inorder = new int[list.size()];
        for (int i = 0 ; i < numCourses;i++){
            for (int j : list.get(i)){
                inorder[j]++;
            }
        }
        System.out.println(Arrays.toString(inorder));
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0 ; i < inorder.length;i++){
            if (inorder[i]==0){
                q.add(i);
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()){
            int node = q.remove();
            res.add(node);
            for (int i : list.get(node)){
                inorder[i]--;
                if (inorder[i]==0){
                    q.add(i);
                }
            }
        }
        System.out.println(res);
        return res.size() == numCourses;
    }
    public void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};
        System.out.println(canFinish(numCourses,prerequisites));
    }
}
