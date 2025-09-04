package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionII {
    public void main(String[] args) {
     int[] nums1 = {4,9,5}; int []nums2 = {9,4,9,8,4};
//        num1 = [4,9,5], num2 = [9,4,9,8,4]
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : nums1) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        System.out.println(map);
        for (int j : nums2) {
            if (map.containsKey(j)&&map.get(j)>0) {
                list.add(j);
                map.put(j, map.get(j) - 1);
                System.out.println(map);
            }

        }
        System.out.println(map);
        int[] ans = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
