package Recursion;

public class PerfectSum {
    public void main(String[] args) {
  int[]arr = {5,2,3,10,6,8};
        System.out.println(perfectSum(arr,6,10));
    }
    public int perfectSum(int[] arr,int n, int sum)
    {
        // Your code goes here
       return recursion(arr,n,0,sum,0);

    }
    public int recursion(int[]arr , int n , int index,int sum , int s){
        if(n==index){
            if(s==sum){
                return 1;
            }
            else return 0;
        }
        s+=arr[index];
        int l = recursion(arr,n,index+1,sum,s);
        s-=arr[index];
        int r = recursion(arr,n,index+1,sum,s);
        return l+r;
    }
}
