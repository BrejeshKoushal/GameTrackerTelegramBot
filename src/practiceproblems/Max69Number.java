package practiceproblems;

import java.util.Collections;

public class Max69Number {
    public int maximum69Number (int num) {
            StringBuilder sb = new StringBuilder();
            sb.append(num);
            System.out.println(sb);
            for (int i = 0 ; i < sb.length();i++){
                if (sb.charAt(i)=='6'){
                    sb.replace(i,i+1, "9");
                    break;
                }
            }
            return Integer.parseInt(sb.toString());
        }

    public void main(String[] args) {
        int num = 9996;
        int[] arr = {2,3,2};
        int n = arr.length;
        int[] dp = new int[n+1];
        for(int i  =  n-1 ; i>=1 ;i--){
            System.out.println(arr[i] + dp[i+2]);
        }
        System.out.println(maximum69Number(num));
    }
}
