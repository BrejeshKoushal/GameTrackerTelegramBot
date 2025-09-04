package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CityWithSmallestNeighbours {
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][]dist = new int[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        for (int i = 0 ; i < edges.length;i++){
            int from = edges[i][0];
            int to = edges[i][1];
            int cost = edges[i][2];
            dist[from][to]=cost;
            dist[to][from]=cost;
        }
        for (int i = 0 ; i < n ; i ++){
            dist[i][i]=0;
        }
        for (int k = 0 ; k < n ; k++){
            for (int i = 0 ; i < n ; i++){
                for (int j = 0 ; j < n ; j++){
                    if (dist[i][k]==Integer.MAX_VALUE  || dist[k][j]==Integer.MAX_VALUE) continue;
                    dist[i][j]=Math.min(dist[i][j],(dist[i][k]+dist[k][j]));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0 ; i < n ; i++){
            int cnt = 0;
            for (int j = 0 ; j < n ; j++){
                if (dist[i][j] <= distanceThreshold)
                    cnt++;
            }
            if (cnt<=min){
                min = cnt;
                index = i;

            }
        }

        return index;
    }
    public static void main(String[] args) {
        int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int distanceThreshold = 4 , n = 4;
        System.out.println(findTheCity(n,edges,distanceThreshold));

    }
}
