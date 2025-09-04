package binarysearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[]arr = {4,5,6,7,8,9,0,1,2};
        System.out.println(search(arr,0));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (nums[start] > nums[mid]) {  //Right is sorted
                if (target <= end && target >= nums[mid]) {
                    start = mid + 1;
                } else end = mid - 1;
            } else {
                if (target <= nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else start = mid + 1;
            }
        }
        return -1;
    }
}
