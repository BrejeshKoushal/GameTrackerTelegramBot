package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    class Pair implements Comparable<Pair>{
        int x;
        int y;
        Double root;

        public Pair(int x, int y, Double root) {
            this.x = x;
            this.y = y;
            this.root = root;
        }

        @Override
        public int compareTo(Pair o) {
            return Double.compare(this.root,o.root);
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0 ; i < points.length;i++){
            int x1 =points[i][0];
            int x2 = points[i][1];
            double res = Math.sqrt(Math.pow(x1,2) + Math.pow(x2,2));
            pq.add(new Pair(x1,x2,res));
        }
        List<int[]> list = new ArrayList<>();
        while (k-->0){
            Pair pair = pq.poll();
            int x1 = pair.x;
            int x2 = pair.y;
            list.add(new int[]{x1,x2});
        }
        return list.toArray(new int[list.size()][]);
    }
    public  void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }
}
