package Practice;

import java.util.Arrays;

public class RescheduleII {
    public static int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int[] gapArr = new int[startTime.length+1];
        int n = gapArr.length;
        gapArr[0]=startTime[0];
        gapArr[n-1] = eventTime-endTime[endTime.length-1];
        for (int i = 1 ; i < n-1 ;i++){
            gapArr[i]=startTime[i]-endTime[i-1];
        }
        System.out.println(Arrays.toString(gapArr));
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int maxTillNow = -1;
        for (int i = 0 ; i < n ; i++){
            leftMax[i] = Math.max(gapArr[i],maxTillNow);
            maxTillNow = leftMax[i];
        }
        maxTillNow = -1;
        for (int i = n-1 ; i>=0;i--){
            rightMax[i]=Math.max(gapArr[i],maxTillNow);
            maxTillNow = rightMax[i];
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));
        int max = -1;
        for (int  i = 0 ; i < startTime.length ;i++){
            int interval = endTime[i]-startTime[i];
            int temp = interval + gapArr[i] + gapArr[i+1];
                if(i > 0 && interval<=leftMax[i-1] || i+1 < n &&  interval<=rightMax[i+1] ){
                    max = Math.max(max,temp);
                }
        }
        return max;
    }
    public static void main(String[] args) {
        int eventTime = 10; int [] startTime = {0,2,4,5,7}, endTime = {1,3,5,6,8};
        System.out.println(maxFreeTime(eventTime,startTime,endTime));
    }
}
