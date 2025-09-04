package Arrays;

public class count {
    public static void main(String[] args) {
        System.out.println(countDigits(153));
    }
    public static int countDigits(int n){
        // Write your code here.
        int count =0;
        int m = n;
        while(m>0){
            int rem = m%10;
            if(rem!=0){
            if(n%rem==0){
                count++;
            }}
            m=m/10;
        }
        return count;
    }
}
