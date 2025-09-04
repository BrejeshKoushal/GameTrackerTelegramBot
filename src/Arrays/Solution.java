package Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {4,5,4,4,4};
        System.out.println(isSorted(5,arr));
    }
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i = 0 ; i  < n-1 ; i++){
            if(a[i]>a[i+1]){
                return 0;
            }
        }
        return 1;
    }
}
