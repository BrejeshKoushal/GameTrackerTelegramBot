package assignments.firstjava.arrays;

public class richestcustomerwealth {

    public static void main(String[] args) {
        int[][] arr = {
                {1 , 2 , 3},
                {4 , 5 , 6},
                {7 , 8 , 9}
        };
        System.out.println(richest(arr));

    }
    static int richest(int[][] nums){

        int max = Integer.MIN_VALUE;
        for(int[] i : nums){
            int sum = 0;
            {
                for(int j : i){
                    sum+=j;
                }
                if(sum>max){
                    max = sum;
                }
            }

            }


        return max;


    }

}
