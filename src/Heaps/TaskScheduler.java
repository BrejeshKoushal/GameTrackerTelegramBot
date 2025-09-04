package Heaps;

import java.util.*;

class Pair implements Comparable<Pair> {
    int freq;
    int time; // last execution time

    public Pair(int freq, int time) {
        this.freq = freq;
        this.time = time;
    }

    @Override
    public int compareTo(Pair o) {
        return o.freq - this.freq; // max-heap by frequency
    }
}

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] freq = new int[26];

        // Count task frequencies
        for (char ch : tasks) {
            freq[ch - 'A']++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int f : freq) {
            if (f > 0) q.add(f);
        }

        int count = 0;

        while (!pq.isEmpty() || !q.isEmpty()) {
            // Step 1: Add one task from q to pq (if available)
            if (!q.isEmpty()) {
                pq.add(new Pair(q.poll(), count));
            }

            // Step 2: Try to run the most frequent ready task
            if (!pq.isEmpty()) {
                List<Pair> skipped = new ArrayList<>();

                Pair chosen = null;
                while (!pq.isEmpty()) {
                    Pair p = pq.poll();
                    if (count - p.time > n) { // ready to run
                        chosen = p;
                        break;
                    } else {
                        skipped.add(p);
                    }
                }

                // Put skipped tasks back
                pq.addAll(skipped);

                // Step 3: Execute chosen task
                if (chosen != null) {
                    chosen.freq--;
                    chosen.time = count;
                    if (chosen.freq > 0) {
                        pq.add(chosen); // reinsert with updated time
                    }
                }
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(ts.leastInterval(tasks, n)); // Expected: 8
    }
}
