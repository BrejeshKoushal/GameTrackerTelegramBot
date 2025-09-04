package binarysearch;

public class SpecialArray {
    public static void main(String[] args) {
        int[] arr = {4,3,1,6};
        System.out.println(isArraySpecial(arr));
    }
    public static boolean isArraySpecial(int[] nums) {
            if(nums.length==1) return true;
            for(int i = 0 ; i < nums.length-1;i++){
                if(!different(nums,i,i+1)){
                    return false;
                }
            }
            return true;
        }
        public static boolean different(int[] arr , int a ,int b){
            return (arr[a] % 2 != 0 || arr[b] % 2 != 0) && (arr[a] % 2 != 1 || arr[b] % 2 != 1);
}
}
