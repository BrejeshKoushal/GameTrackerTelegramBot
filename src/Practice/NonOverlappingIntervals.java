package Practice;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int ans = 0;
        int n = intervals.length;
        for (int i = 0;i<n-1;i++){
            if (intervals[i][1]>intervals[i+1][0]){
                ans+=1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
