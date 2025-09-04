package binarysearch;

public class RotatedSortedII {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        System.out.println(search(arr,0));
    }
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true ;
            if(nums[mid]==nums[end]&&nums[mid]==nums[start]) {
                start++;
                end--;
                continue;
            }

            if (nums[start] >= nums[mid]) {  //Right is sorted
                if (target <= nums[end] && target >= nums[mid]) {
                    start = mid + 1;
                } else end = mid - 1;
            } else {
                if (target <= nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else start = mid + 1;
            }
        }
        return false;
    }
}

