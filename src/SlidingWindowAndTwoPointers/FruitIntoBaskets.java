package SlidingWindowAndTwoPointers;

import java.util.*;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        Integer[]arr = {1,1,5,6,8,7};
        System.out.println(totalFruits(arr));
    }
    public static int totalFruits(Integer[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0 , j = 0;
        int max = 0;
        while(j<arr.length) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            if (map.size() > 2) {
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
            }
            if (map.size() <= 2) {
                max = Math.max(max, j - i+1);
            }
            j++;
        }
        return max;
    }

}
