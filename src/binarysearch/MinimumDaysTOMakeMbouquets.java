package binarysearch;

public class MinimumDaysTOMakeMbouquets {
    public static void main(String[] args) {
        int[]arr={7,7,7,7,12,7};
        System.out.println(minDays(arr,2,3));
        System.out.println(counting(arr,2,3));
    }
    public static int counting(int[]arr,int mid,int k){
        int count=0;
        int bouquet_count = 0;
        for (int j : arr) {
            if (j <= mid) count++;
            else {
                bouquet_count+=count/k;
                count = 0;
            }
        }
        bouquet_count+=count/k;

        return bouquet_count;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long val = (long) m *k;
        if(val>bloomDay.length) return -1;
        for(int i = 0;i<bloomDay.length;i++ ){
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }
        int start=min;
        int end = max;
        while(start<=end){
            int mid =start+(end-start)/2;
             if(counting(bloomDay,mid,k)==m) end=mid-1;
             else if (counting(bloomDay,mid,k)==0) return -1;
             else start=mid+1;
        }
        return start;
    }
}
