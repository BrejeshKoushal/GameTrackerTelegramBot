package conditionalsandloops;

public class alldivisors {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(10));
    }
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum=0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
        }
        return sum;
    }
}
