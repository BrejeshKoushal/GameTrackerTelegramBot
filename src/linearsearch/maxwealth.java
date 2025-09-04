package linearsearch;

public class maxwealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2 , 3},
                {4 , 5 , 6},
                {7 , 8 , 9}
        };
        System.out.println(maxWealth(arr));

    }
     static int maxWealth(int[][] arr){
        int max = Integer.MIN_VALUE;
         for (int[] ints : arr) {
             int sum = 0;
             for (int anInt : ints) {
                 sum += anInt;
             }
             if (sum > max) {
                 max = sum;
             }

         }
         return max;
     }

}
