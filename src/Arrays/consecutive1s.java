package Arrays;

public class consecutive1s {
    public static void main(String[] args) {
int[] arr = {1,1,1,1,0,0,0,1,1,1,1,1,0,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums){

        int count=0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(count, max);
            }
            else count=0;
        }
        return max;
    }
}
