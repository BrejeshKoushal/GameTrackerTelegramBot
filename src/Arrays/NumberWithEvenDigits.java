package Arrays;

public class NumberWithEvenDigits {
    public  void main(String[] args) {
        int[]arr = {555,901,482,1771};
//        System.out.println(findNumbers(arr));
        System.out.println(isEven(1771));
    }
//    public int findNumbers(int[] nums) {
//        int count = 0;
//        for(int i = 0 ; i < nums.length ; i++){
//            if(isEven(nums[i])){
//                count++;
//            }
//        }
//        return count;
//    }
    public boolean isEven(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num >> 1;
        }
        System.out.println(count);
        return count%2==0;
    }
}

