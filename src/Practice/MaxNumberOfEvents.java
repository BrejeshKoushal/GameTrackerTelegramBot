package Practice;

import java.util.*;

public class MaxNumberOfEvents {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,Comparator.comparingInt(a->a[1]));
        int day = events[0][0];
        int i = 0;
        int count=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int maxDay = events[events.length-1][1];
        while (day<=maxDay){
            while (i<events.length && events[i][0]==day){
                pq.add(events[i++][1]);
            }
            while (!pq.isEmpty() && pq.peek()<day){
                pq.remove();
            }
            if (!pq.isEmpty()){
                pq.remove();
                count++;
            }
            day++;
        }
        return count;
    }
    public void main(String[] args) {
        int[][] events = {{1,2},{2,2},{1,2},{1,2}};
        System.out.println(maxEvents(events));
}
}