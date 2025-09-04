package Arrays;

import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,7};
        System.out.println(Arrays.toString(getSecondOrderElements(6, arr)));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] ans = new int[2];
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int largest = a[n-1];
        System.out.println(largest);
        int smallest = a[0];
        System.out.println(smallest);
        for(int i = 0 ; i<n;i++){
            if (a[i+1] != smallest) {
                ans[1] = a[i+1];
            }


            if(a[n-2-i]!=largest){
                ans[0]=a[n-2-i];
                break;
            }

        }
        return ans;
    }


}
