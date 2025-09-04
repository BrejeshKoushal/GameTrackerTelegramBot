package Arrays;

import java.util.HashMap;
import java.util.Map;

public class subarrayswithsumequalsK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(subarraySum(arr,2));
    }
    public  static int subarraySum(int[] nums, int k) {
            Map<Integer,Integer> map = new HashMap<>();
            map.put(0,1);
            int count = 0;
            int sumTillNow =0;
            for (int num : nums) {
                sumTillNow += num;
                    count += map.getOrDefault(sumTillNow - k,0);
                    map.put(sumTillNow, map.getOrDefault(sumTillNow, 0) + 1);
                }
            return count;
        }
}
