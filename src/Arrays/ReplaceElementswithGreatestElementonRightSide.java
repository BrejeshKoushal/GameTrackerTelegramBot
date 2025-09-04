package Arrays;

import java.util.Arrays;
import java.util.Stack;

public class ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
        int[]arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public static int[] replaceElements(int[] arr) {
            Stack<Integer> st = new Stack<>();
            boolean[] marked = new boolean[arr.length];
            for(int i = arr.length-1;i>=0;i--) {
                int x = arr[i];
                marked[i]= !st.isEmpty() && st.peek() > x;
                if (st.isEmpty()) {
                    arr[i] = -1;
                }
                else arr[i] = st.peek();
                if(!marked[i]) st.push(x);
            }
            return arr;
        }
    }
