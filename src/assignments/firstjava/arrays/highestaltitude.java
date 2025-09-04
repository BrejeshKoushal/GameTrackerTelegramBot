package assignments.firstjava.arrays;

public class highestaltitude {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int count = 0;
        int max = 0;
        for(int i = 0 ; i < gain.length ;i++){

            count+=gain[i];
            if(count>max){
                max=count;
            }
        }

return max;

    }
}
