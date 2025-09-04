package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionIItwoPointers {
    public void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
    public int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i< nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else j++;
        }
        int[]ans = new int[list.size()];
        for(int l = 0;l<list.size();l++){
            ans[l]=list.get(l);
        }
        return ans;
    }
}
