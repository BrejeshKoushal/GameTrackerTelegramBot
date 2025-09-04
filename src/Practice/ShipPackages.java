package Practice;

public class ShipPackages {
    public boolean isPossible(int mid, int[] weights, int days){
        int count = 1;
        int num = mid;
        for(int i = 0 ; i < weights.length ; i++){
            if(num>=weights[i]){
                num = num - weights[i];
            }
            else{
                count++;
                num = mid;
                num-=weights[i];
            }
        }
        return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        for(int ints : weights){
            start = Math.max(ints,start);
            end+=ints;
        }
        int ans= 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isPossible(mid,weights,days)){
                end = mid-1;
                ans = mid;
            }
            else start = mid+1;
        }
        return ans;
    }
    public void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
}
