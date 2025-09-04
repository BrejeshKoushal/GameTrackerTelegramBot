package Arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {2,0,2};
        System.out.println(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        if(arr[0]>arr[1]) return false;
        int index = 0;
        for (int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] == arr[i+1]){
                return false;
            }
            else if(index==0 && arr[i] > arr[i+1]){
                index = i;
            }
            else if(index!=0 && arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
