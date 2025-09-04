package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestsubarraywithsumK {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;
        System.out.println(lenOfLongSubarr(arr,6,k));
    }
    public static int lenOfLongSubarr (int[] A, int N, int K) {
        //Complete the function
        Map<Integer,Integer> mpp = new HashMap<>();
        int sum=0;
        int length =0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K){
                length=i+1;
            }
            else if (mpp.containsKey(sum-K)){
                length = Math.max(length,i-mpp.get(sum-K));
            }
            if(!mpp.containsKey(sum)){
                mpp.put(sum,i);
            }
        }
        return length;
    }
    }
