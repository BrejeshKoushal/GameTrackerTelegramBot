package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = carry;
            for (int i = 0; i < digits.length; i++) {
                arr[i + 1] = digits[i];
            }
            return arr;
        } else {
            return digits;
        }
    }
}
