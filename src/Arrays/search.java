package Arrays;

public class search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(searchInSorted(arr,5,2));
    }
  public static  int searchInSorted(int arr[], int N, int K)
    {

        // Your code here
        for(int i = 0 ; i<N ; i++){
            if(arr[i]==K){
                return 1;
            }
        }
        return -1;

    }
}
