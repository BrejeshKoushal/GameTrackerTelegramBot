package Arrays;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[]arr = {0,0,0,1};
        System.out.println(dominantIndex(arr));
    }

    public static int dominantIndex(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
                for ( ; j < nums.length;j++) {
                    if(i==j){
                        j++;
                    }
                    if (nums[i] >= (nums[j] + nums[j])) {
                        ans = i;
                        j++;
                    }
                    else {
                        ans = -1;
                        break;
                    }
                }
                if(ans!=-1 && j==nums.length) break;
            }
        return ans;
    }
}