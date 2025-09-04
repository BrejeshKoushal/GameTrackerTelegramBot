package assignments.firstjava.arrays;

import java.util.Arrays;
import java.util.List;

public class arrayplus {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4};
        int key = 181;
        int[] ans = arraytonum(arr, key);
        System.out.println(Arrays.toString(ans));
    }

    static int[] arraytonum(int[] arr, int k) {
        int ans = 0;
        int num;
        int newans = 0;
        for (int value : arr) {
            num = value;
            ans = (ans * 10) + num;
        }
        newans = ans + k;
        String newansString = String.valueOf(newans); // Convert newans to string
        int len = newansString.length(); // Find the length of the string
        int[] arr2 = new int[len];
        for (int j = 0; j < len; j++) {
            arr2[j] = Character.getNumericValue(newansString.charAt(j)); // Convert each character back to integer
        }
        return arr2;
    }
}


