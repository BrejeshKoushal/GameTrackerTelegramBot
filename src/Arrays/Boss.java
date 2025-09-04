package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Boss {
    public static void main(String[] args) {
        int[] arr = {63,70,80,33,33,47,20};
        System.out.println(leaders(arr,7));

  }
   public static ArrayList<Integer> leaders(int[] arr, int n){
        // Your code here
       ArrayList<Integer> ans = new ArrayList<>();
       int maximum = Integer.MIN_VALUE;
       for(int i = n-1;i>=0;i--) {
           if (arr[i] > maximum) {
               ans.add(arr[i]);
           }
           maximum = Math.max(maximum, arr[i]);
       }
       Collections.reverse(ans);
       return ans;

    }
}
