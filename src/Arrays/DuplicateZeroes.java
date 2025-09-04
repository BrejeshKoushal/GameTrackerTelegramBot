package Arrays;

import java.util.Arrays;

public class DuplicateZeroes {
    public void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) continue;
            if (arr[i] == 0) {
                int j = arr.length - 1;
                while (j>i ) {
                    arr[j] = arr[j-1];
                    j--;
                }
                i++;
            }
        }
    }
}