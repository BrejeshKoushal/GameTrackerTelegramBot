package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class XorOptimal {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        System.out.println(solve(arr,6));
    }
    public static int solve(int[] A, int B) {
            int count = 0;
            int xor = 0;
            HashMap<Integer, Integer> set = new HashMap<>();
            set.put(0,1);
            for (int i  = 0; i < A.length; i++) {
                xor = xor ^ A[i];
                int x = xor ^ B;
                if (set.containsKey(x)) {
                    count+=set.getOrDefault(x,0);
                }
                set.put(xor, set.getOrDefault(xor,0)+1);

            }
            return count;
    }}