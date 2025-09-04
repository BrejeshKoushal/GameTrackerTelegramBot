package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public class Pair{
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        Queue<Pair> q = new LinkedList<>();
        int m = image.length;
        int n = image[0].length;
        q.add(new Pair(sr,sc));
        int startColor = image[sr][sc];
        image[sr][sc]=color;
        int[] drow = {0,-1,0,1};
        int[] dcol = {1,0,-1,0};
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for(int i = 0 ; i < 4 ;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0&&nrow<m && ncol>=0&&ncol<n&&image[nrow][ncol]!=color&&image[nrow][ncol]==startColor){
                    image[nrow][ncol]=color;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
        return image;
    }
    public void main(String[] args) {
        int[][] image = {
                         {0,0,0},
                         {0,0,0}
        };
        System.out.println((Arrays.deepToString(floodFill(image, 1, 1, 1))));
    }
}
