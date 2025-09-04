package Arrays;

public class Coins {
    public static void main(String[] args) {
        System.out.println(maths(2));
        System.out.println(arrangeCoins(3));
    }

    public static int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        long ans = -1;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (maths(mid) > n) end = mid - 1;
            else if(maths(mid)<n){
                ans=start;
                start = mid + 1;
            }
            else{ ans = mid;
            break;}
        }
        return (int) ans;
    }

    public static long maths(long end) {
        return end * (end + 1) / 2;

    }
}
