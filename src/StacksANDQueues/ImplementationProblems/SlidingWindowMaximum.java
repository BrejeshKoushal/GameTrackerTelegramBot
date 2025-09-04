package StacksANDQueues.ImplementationProblems;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ;i++){
            if(!dq.isEmpty()&&dq.peekLast()<=i-k){
                dq.removeLast();
            }
            while(!dq.isEmpty()&&nums[dq.peekFirst()]<=nums[i]){
                dq.removeFirst();
            }
            dq.push(i);
            if(i>=k-1) list.add(nums[dq.getLast()]);
        }
        int[]ans = new int[list.size()];
        for(int i = 0 ; i < list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
