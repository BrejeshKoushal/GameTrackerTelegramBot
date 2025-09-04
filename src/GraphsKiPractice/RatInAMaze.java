package GraphsKiPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class RatInAMaze {
    class Pair{
        int row;
        int col;
        String dir;

        public Pair(int row, int col, String dir) {
            this.row = row;
            this.col = col;
            this.dir = dir;
        }
        @Override
        public String toString() {
            return "(" + row + ", " + col + ", " + dir + ")";
        }
    }
        public void dfs(int row , int col , int[][]maze , boolean[][] vis , ArrayList<String> list , StringBuilder sb){
            if (row==maze.length-1 && col == maze[0].length-1){
                list.add(sb.toString());
                return;
            }

            if(row>=0 && col >=0 && row<maze.length && col<maze[0].length && !vis[row][col] && maze[row][col]==1) {
                vis[row][col]=true;
                dfs(row, col - 1, maze, vis, list, sb.append("L"));
                sb.deleteCharAt(sb.length()-1);
                dfs(row, col + 1, maze, vis, list, sb.append("R"));
                sb.deleteCharAt(sb.length()-1);
                dfs(row - 1, col, maze, vis, list, sb.append("U"));
                sb.deleteCharAt(sb.length()-1);
                dfs(row + 1, col, maze, vis, list, sb.append("D"));
                sb.deleteCharAt(sb.length()-1);
                vis[row][col]=false;
            }
        }
        public ArrayList<String> ratInMaze(int[][] maze) {
            ArrayList<String> list = new ArrayList<>();
            int m = maze.length;
            int n = maze[0].length;
            boolean[][] vis = new boolean[m][n];
            if (maze[0][0]==1){
                dfs(0,0,maze,vis,list,new StringBuilder());
            }
            Collections.sort(list);
            return list;
        }
    public void main(String[] args) {
        int[][] mat = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        System.out.println(ratInMaze(mat));
    }
}
