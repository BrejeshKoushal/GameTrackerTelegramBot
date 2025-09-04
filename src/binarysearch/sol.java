package binarysearch;

class sol {
    public int func(int[]arr,int mid){
        int days=1;
        int load=0;
        for(int i = 0 ;i<arr.length;i++){
            if(load+arr[i]>mid){
                days+=1;
                load=arr[i];
            }
            else load+=arr[i];
        }
        return days;
    }


    public int shipWithinDays(int[] weights, int days) {
        int end = 0;
        int max=Integer.MIN_VALUE;
        for(int i = 0;i<weights.length;i++){
            end+=weights[i];
            max=Math.max(max,weights[i]);

        }
        int start=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(func(weights,mid)<=days) end=mid-1;
            else start=mid+1;
        }
        return start;
    }
}
