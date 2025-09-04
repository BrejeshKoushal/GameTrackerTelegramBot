package assignments.firstjava.arrays;

public class houserobber {


    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(rob(arr));
    }




        static int rob(int[] nums) {
            int money = 0;

            for(int i = 0; i < nums.length ; ++i){
                money+=nums[i];
                i = 2*i;


            }
            return money;
    }
}
