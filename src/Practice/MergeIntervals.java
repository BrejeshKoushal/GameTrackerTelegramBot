package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        if(intervals[0][1]<intervals[1][0]){
            list.add(intervals[0]);
        }
        else{
            list.add(new int[]{intervals[0][0],Math.max(intervals[0][1],intervals[1][1])});
        }
        int n = intervals.length;
        for (int i = 2 ; i < n ; i++){
            if (list.getLast()[1] < intervals[i][0]){
                list.add(intervals[i]);
            }
            else{
                int a = list.getLast()[0];
                int b = Math.max(list.getLast()[1],intervals[i][1]);
                list.removeLast();
                list.add(new int[]{a,b});
            }
        }

        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
       int[][] intervals = {{1,4},{4,5}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
