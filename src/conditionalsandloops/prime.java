package conditionalsandloops;

public class prime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    public static boolean isPrime(int num) {
        //Your code goes here
        boolean ans = false;
        for (int i = 2 ; i*i<num;i++){
            if(num%i!=0){
                ans = true;
            }
        }
        if(ans) System.out.println("YES");
        else System.out.println("NO");

        return ans;
    }
}
