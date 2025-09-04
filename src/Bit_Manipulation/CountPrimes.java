package Bit_Manipulation;

public class CountPrimes {
    public static void main(String[] args) {

    }

    public int countPrimes(int n) {
        boolean[] one = new boolean[n];
        for(int i = 2 ; i  <n ; i++){
            one[i] = true;
        }
        int j = 0;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(one[i]){
                count++;
                j+=i;
                while(j < n){
                    one[j] = false;
                    j+=i;
                }
            }
        }
        return count;
    }
}
