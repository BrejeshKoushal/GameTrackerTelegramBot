import java.util.Arrays;

public class zerotothened {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,4,5,6};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums){

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==0&&nums[j]!=0) swap(nums,i,j);
            }
        }
        System.out.println(Arrays.toString(nums));


    }
    public static void swap(int[]arr ,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
