package assignments.firstjava.arrays;

public class jumpgame {

    public static void main(String[] args) {
        int[] arr = {2,5,0,0};
        System.out.println(canJump(arr));
    }



    static boolean canJump(int[] nums) {
        int target = nums.length-1;
        int i = 0;
        if(nums.length==1){
            return true;
        }
        while(i<target){
            for( ; i<=target ;i++){
                i = i + nums[i];
                if(i<nums.length-1){
                    if(nums[i]==0){
                    return false;
                }}
            }
            if(i >= target){
                return true;
            }

        }
        return false;

    }

}
