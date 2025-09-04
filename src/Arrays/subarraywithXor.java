package Arrays;

public class subarraywithXor {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        System.out.println(solve(arr,5,6));
    }
    public static int solve(int[] arr, int n, int K) {
        int count = 0;
        for(int i = 0 ;i<n;i++){
            int xor =0;
            for(int j =i;j<n;j++){
                xor=xor^arr[j];
                if(xor==K) count++;
            }
        }
        return count;
    }
}
