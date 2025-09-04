package Practice;

public class KokoEatingBananas {
    public boolean possible(int mid , int h , int[] piles){
        int hours = 0;
        for(int i = 0 ; i < piles.length ;i++){
            if(hours>=h && i < piles.length-1) return false;
            if(piles[i]<=mid){
                hours+=1;
            }
            else{
                hours+= (int) Math.ceil((double) piles[i] /mid);
            }
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high = 0;
        for(int ints : piles) high = Math.max(high,ints);
        int low = 1;
        int ans = 0;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(possible(mid,h,piles)){
                ans = mid;
                high = mid-1;
            }
            else  low = mid+1;
        }
        return ans;
    }
    public  void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(Math.ceilDiv(1,1));
//        System.out.println(minEatingSpeed(piles,h));
    }
}
