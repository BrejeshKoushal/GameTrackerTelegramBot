package assignments.firstjava.functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(fact(num));

    }
    static int fact(int n){

        int ans = 1;
        for(int i = 1 ; i <= n ; i++){
            ans=ans*i;
        }
        if(n==1||n==0){
            return 1;
        }
        return ans;

    }
}
