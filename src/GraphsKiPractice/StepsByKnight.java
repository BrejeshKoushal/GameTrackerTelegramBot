package GraphsKiPractice;

import java.util.LinkedList;
import java.util.Queue;

public class StepsByKnight {
   static class Pair implements Comparable<Pair>{
        int row;
        int col;
        int steps;

        public Pair(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.steps = steps;
        }

       @Override
       public int compareTo(Pair o) {
           return this.steps-o.steps;
       }



    }
    public static int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        // Code here
        int[] dRow = {-2,-1,-2,-1,1,1,2,2};
        int[] dCol = {1,2,-1,-2,-2,2,-1,1};
        int startRow = knightPos[1]-1;
        int startCol = knightPos[0]-1;
        int targetRow = targetPos[1]-1;
        int targetCol = targetPos[0]-1;
        boolean[][] vis = new boolean[n][n];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startRow,startCol,0));
        while (!q.isEmpty()){
            Pair pair = q.remove();
            int r = pair.row;
            int c = pair.col;
            int steps = pair.steps;
            if (r == targetRow && c == targetCol) return steps;
            for (int i = 0 ; i < 8 ; i++){
                int nRow = r + dRow[i];
                int nCol = c + dCol[i];
                if (nRow>=0 && nCol>=0 && nRow < n && nCol < n && !vis[nRow][nCol]){
                    vis[nRow][nCol]=true;
                    q.add(new Pair(nRow,nCol,steps+1));
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] kPos = {6,1};
        int[] tPos = {2,4};
        int n = 7;
        System.out.println(minStepToReachTarget(kPos,tPos,n));
    }
}
