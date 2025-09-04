package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RottingOranges {
    public class Pair{
        int row;
        int col;
        int time;
        public Pair(int row , int col , int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {
        int freshCnt = 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][]vis = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
                else vis[i][j]=0;
                if(grid[i][j]==1) freshCnt++;
            }
        }
        int tm = 0;
        int[] drow = {-1,0,+1,0};
        int cnt=0;
        int[] dcol = {0,+1,0,-1};
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            tm = Math.max(tm,t);
            q.poll();
            for(int i = 0 ; i < 4 ;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0&&nrow<n && ncol>=0&&ncol<n && vis[nrow][ncol]!=2 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }
        if(cnt!=freshCnt){
            return -1;
        }
        return tm;
    }


    public void main(String[] args) {
        int[][]grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }
}
