package Arrays;

import java.util.Arrays;

public class remove{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(rotate(arr,7 ,3)));
    }
    public static int[] rotate(int[]arr ,int n ,int d) {
        d=d%n;
        int[] temp = new int[d];
        for(int i = 0 ; i < d ;i++){
            temp[i]=arr[i];
        }
        for(int i = d ; i< n ;i++){
            arr[i-d]=arr[i];
        }
        for(int  i = d ;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }

return arr;

    }
    }

