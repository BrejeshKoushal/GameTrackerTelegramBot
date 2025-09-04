package Practice;

import java.util.Arrays;

public class RescheduleMeetings {
    public static int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int[] gapArr =  new int[startTime.length+1];
        gapArr[0]=startTime[0];
        gapArr[gapArr.length-1]=eventTime-endTime[endTime.length-1];
        for (int i = 1; i < gapArr.length-1;i++){
            gapArr[i]=startTime[i]-endTime[i-1];
        }
        System.out.println(Arrays.toString(gapArr));
        int n = gapArr.length;
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        while (i<n && j<n){
            sum+=gapArr[j];
            while(j-i > k){
                sum-=gapArr[i];
                i++;
            }
            max = Math.max(max,sum);
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int eventTime = 5, k = 1;
        int[] startTime = {1,3}, endTime = {2,5};
        System.out.println(maxFreeTime(eventTime,k,startTime,endTime));
    }
}
