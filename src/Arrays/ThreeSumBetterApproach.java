package Arrays;

import java.util.*;

public class ThreeSumBetterApproach {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
        public static List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            List<List<Integer>> list = new ArrayList<>();
            Set<List<Integer>> set = new HashSet<>();
            for(int i = 0 ;i < n;i++){
                HashSet<Integer> hashSet = new HashSet<>();
                for(int j = i+1;j<n;j++){
                    int third = -1*(nums[i]+nums[j]);
                    if(hashSet.contains(third)){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
                        Collections.sort(temp);
                        set.add(temp);

                    }
                    hashSet.add(nums[j]);
                }
            }
            list.addAll(set);
            return list;
        }

}
