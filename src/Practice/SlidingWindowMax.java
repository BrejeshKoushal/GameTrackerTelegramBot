package Practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        int n = nums.length;
        int[] ans = new int[n-k+1];
        for (int j = 0 ; j <n;j++){
            while(!dq.isEmpty() && nums[j]>=nums[dq.getLast()]){
                dq.pollLast();
            }
            dq.offerLast(j);
            if (dq.peekFirst()<=j-k){
                dq.pollFirst();
            }
            if (j >= k-1) {
                ans[i++] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }


    public void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};  int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
