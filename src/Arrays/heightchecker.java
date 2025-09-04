package Arrays;

import java.util.Arrays;

public class heightchecker {
    public static void main(String[] args) {
        int[]arr = {1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }
    public static int heightChecker(int[] heights){
        int[] original = new int[heights.length];
        System.arraycopy(heights, 0, original, 0, heights.length);
        System.out.println(Arrays.toString(original));
        int count = 0;
        int i = 0 ;
        int j = 0;
        while(i<heights.length && j < original.length){
            if(heights[i]!=original[j]) count++;
            i++;
            j++;
        }
        return count;
    }

}
