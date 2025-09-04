package Arrays;

public class singlenumber {
    public static void main(String[] args) {
        int[] arr = {2,2,11,2,11,2,3,3,4,45,5,45    };
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums){
            int ans=0;
            for(int i = 0 ; i< nums.length;i++){
                {
                    int count=0;
                    for(int j = 0 ; j<nums.length;j++){
                        if(nums[j]==nums[i]){
                            count++;
                        }
                        if(count==0){
                             ans = nums[i];
                        }
                    }
                }
            }
            return ans;

    }
}
