package Graphs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FloodFillRecursive {
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int original = image[sr][sc];
        if(original!=color){
            helper(image,sr,sc,color,original);

        }
        return image;
    }
    public void helper(int[][]image , int sr , int sc , int color , int original){
        if(sr<0 || sr>=image.length || sc<0||sc>=image[0].length || image[sr][sc]!=original ||image[sr][sc]==color) return;
        image[sr][sc]=color;
        helper(image,sr+1,sc,color,original);
        helper(image,sr-1,sc,color,original);
        helper(image,sr,sc+1,color,original);
        helper(image,sr,sc-1,color,original);
        int []arr = {1,2,3,4};
    }
    public static void main(String[] args) {

    }
}
