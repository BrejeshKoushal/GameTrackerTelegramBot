package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[]arr = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] arr3 = {4,9,5};
        int[] arr4 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr, arr2)));
        System.out.println(Arrays.toString(intersection(arr3, arr4)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : nums1) {
            set.add(j);
        }
        for (int j : nums2) {
            if (set.contains(j)) {
                list.add(j);

            }
        }
        int[]ans = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            ans[i] = list.get(i);
        }
    return ans;
    }

}
