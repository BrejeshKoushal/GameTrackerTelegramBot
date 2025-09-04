package Arrays;

import java.util.Arrays;

public class Solutions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(getSecondOrderElements(5, arr)));

    }

    public static int secondlargest(int[]arr , int n){
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest&&arr[i]>slargest){
                slargest=arr[i];

            }

        }
        return slargest;

    }
    public static int secondSmallest(int[]arr , int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest&&arr[i]<ssmallest){
                ssmallest=arr[i];

            }

        }
        return ssmallest;

    }
    public static int[] getSecondOrderElements(int n, int []a)
    {

        int ssmallest = secondSmallest(a,n);
        int slargest = secondlargest(a,n);
        return new int[]{slargest, ssmallest};
    }
}