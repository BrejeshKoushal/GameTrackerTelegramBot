package Arrays;

import java.util.HashMap;

public class LongestSubarrayWithSum0 {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(arr,8));
    }

    public static int maxLen(int[] arr, int n)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int length = 0;
        for(int i = 0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                length = i+1;
        }
            else if(map.containsKey(sum)){
                length = Math.max(length,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }

        }


        return length;
    }
}
