package assignments.firstjava.arrays;

public class evendigits {

    public static void main(String[] args) {
        int[] arr = {12, 233, 3222, 3};
        findNumbers(arr);
    }
     static int findNumbers(int[] nums) {

        int count =0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }return count;

    }

    static boolean even(int nums) {
       int ans = separate(nums);
       return ans%2==0;


        }
        static int separate(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
            return count;
        }
}
