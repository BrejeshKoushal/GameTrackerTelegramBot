package assignments.firstjava.arrays.greatestno;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class ofcandies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2,3,5,1,3};
        int extracandies = 3;
        System.out.println(Arrays.toString(new List[]{kidsWithCandies(arr, extracandies)}));
    }
    public static List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        for(int  i = 0 ; i < arr.length ;i++){
            if(arr[i]+extraCandies >=max){
                result.add(true);
            }
            else result.add(false);
        }
        return result;
    }


}
