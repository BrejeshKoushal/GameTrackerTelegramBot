package Arrays;

import java.util.HashMap;
import java.util.Map;

public class checkIfNandItsDoubleExists {
    public static void main(String[] args) {
        int[]arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0 ; i < arr.length;i++){
           if(map.containsKey(2*arr[i])|| arr[i]%2==0&&map.containsKey(arr[i]/2)) return true;
           map.put(arr[i],i);
       }
       return false;
    }
}
