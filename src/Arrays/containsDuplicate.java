package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class containsDuplicate {
    public static void main(String[] args) {
        int[]arr = {1,2,3,2};
        System.out.println(dup(arr));
    }
    public static boolean dup(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return false;
}
}
