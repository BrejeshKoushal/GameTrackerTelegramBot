package binarysearch;

public class squareroot {
    public static void main(String[] args) {
        System.out.println(root(6,4096));
    }

    public static long   Mid_power_N(int mid,int n){
        long ans=1;
        for(int i = 1;i<=n;i++){
            ans*=mid;
            if(ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        return ans;
    }
    public static int root(int n , int m){
        int start=1;
        int end = m;
        while(start<=end){
            int mid =start+(end-start)/2;
            int midn= (int) Mid_power_N(mid,n);
            if(midn==m) return mid;
            else if (midn>m) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
