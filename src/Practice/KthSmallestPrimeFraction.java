package Practice;

import java.util.*;

public class KthSmallestPrimeFraction {
    class Pair {
        double value;
        int i ;
        int j;

        public Pair(double value, int i, int j) {
            this.value = value;
            this.i = i;
            this.j = j;
        }
        @Override
        public String toString(){
            return value + " " + i + " " + j;
        }
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingDouble(a->a.value));
        for (int i = 0 ; i < arr.length-1;i++) {
            pq.offer(new Pair(1.0*arr[i]/arr[arr.length-1],i,arr.length-1));
        }
        int smallest = 1;
        while(smallest<k){
            Pair pair = pq.remove();
            int i = pair.i;
            int j = pair.j - 1;
            pq.add(new Pair(1.0*arr[i]/arr[j],i,j));
            smallest++;
        }
        Pair pair = pq.remove();
        int i = arr[pair.i];
        int j = arr[pair.j];
        return new int[]{i,j};
    }
    public void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println((double) arr[0]/arr[1]);
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, 3)));
    }
}
