package binarysearch;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,3,6,7,9};
        int[] arr2 = {1,4,8,10};
        System.out.println(kthElement(arr1,arr2,5,4,5));
    }

    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {

        int p1 = n - 1;
        int p2 = m - 1;
        double median = -1;
        int[] merged = new int[n+m];
        int i = merged.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (arr2[p2] >= arr1[p1]) {
                merged[i] = arr2[p2];
                p2--;
            } else {
                merged[i] = arr1[p1];
                p1--;
            }
            i--;
        }

        // If there are remaining elements in nums1
        while (p1 >= 0) {
            merged[i] = arr1[p1];
            p1--;
            i--;
        }

        // If there are remaining elements in nums2
        while (p2 >= 0) {
            merged[i] = arr2[p2];
            p2--;
            i--;
        }
        median = merged[k-1];
        return (long) median;
    }
    }

