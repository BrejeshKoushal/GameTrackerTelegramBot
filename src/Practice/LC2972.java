package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC2972 {
    public long countSorted(List<Integer> l1 , List<Integer> l2){
        int n1 = l1.size();
        int n2 = l2.size();
        long res = 0;
        int i = 0;
        int j = 0;
        while (i<n1&&j<n2){
            if (l1.get(i)<l2.get(j)){
                res+=n2-j;
                i++;
            }
            else j++;
        }
        return res;
    }
    public long incremovableSubarrayCount(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int n = nums.length;
        if (n==1) return 1;
        int i = 0;
        int j = n-1;
        while (i<n-1 && nums[i]<nums[i+1]){
            list1.add(nums[i]);
            i++;
        }
        list1.add(nums[i]);
        while (j-1>=0 && nums[j]>nums[j-1]){
            list2.add(nums[j]);
            j--;
        }
        list2.add(nums[j]);
        Collections.reverse(list2);
        System.out.println(list1);
        System.out.println(list2);
        if (i>j){
            return ((long) n *(n+1))/2;
        }
        long ans = 1;
        ans += list1.size();
        ans+= list2.size();
        ans+=countSorted(list1,list2);
        return ans;
    }
    public void main(String[] args) {
        int[]arr = {4,2,1,7,8};
        System.out.println(incremovableSubarrayCount(arr));
    }
}
