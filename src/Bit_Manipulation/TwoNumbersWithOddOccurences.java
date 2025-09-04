package Bit_Manipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumbersWithOddOccurences {
    public void main(String[] args) {
        int[]arr = {4, 2, 4, 5, 2, 3, 3, 1};
        System.out.println(Arrays.toString(twoOddNum(arr, 8)));
    }

    public int[] twoOddNum(int[] Arr, int N) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
           map.put(Arr[i],map.getOrDefault(Arr[i],0)+1);
        }
        int[] result = new int[2];
        int i = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if((e.getValue()&1)!=0){
                result[i++]=e.getKey();
            }
        }
        Arrays.sort(result);
        int temp = result[0];
        result[0] = result[1];
        result[1] = temp;
        return result;
    }
}
