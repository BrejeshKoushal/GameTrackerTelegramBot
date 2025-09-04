package Arrays;

public class MaxsumInSubarray {
    public static void main(String[] args) {
        long[] arr = {4,3,1,5,6};
        
        System.out.println(pairWithMaxSum(arr,5));
    }
    public static long pairWithMaxSum(long[] arr, long N)
    {
        // Your code goes here

        long  max =  arr[0];
        for(int i = 0 ; i < N-1;i++){
            long sum=0;
            for(int j = i;j<i+2;j++){
                sum+= (int) arr[j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
