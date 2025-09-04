package Arrays;

public class findPivotIndex {
    public static void main(String[] args) {
        int[]arr = {2,1,-1};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        for(int i = 0 ; i < nums.length ;i++){
            if(prefixSum(nums,i) == suffixSum(nums,i)){
                return i;
            }
        }
        return -1;
    }

    public static int prefixSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int suffixSum(int[] arr, int n) {
        int sum = 0;
        for (int i = arr.length - 1; i > n; i--) {
            sum += arr[i];
        }
        return sum;
    }
}