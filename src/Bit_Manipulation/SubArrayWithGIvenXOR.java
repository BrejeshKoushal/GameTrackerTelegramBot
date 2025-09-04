package Bit_Manipulation;

import java.util.HashMap;

public class SubArrayWithGIvenXOR {
    public static void main(String[] args) {
        int[]arr = {4,2,2,6,4};
        System.out.println(solve(arr,6));
    }
    public static int solve(int[] A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int xor = 0;
        int count = 0;
        map.put(0,0);
        for(int i = 0 ; i < A.length;i++){
            xor^=A[i];
            if(map.containsKey(xor^B)) count++;
            map.put(xor,i+1);
        }
        return count;
    }
    }
