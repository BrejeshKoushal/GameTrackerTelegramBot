package Practice;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChocoAndChocolate {

        public static int getMaxChocolates(int A, int B, String chocolates, int[] cost) {
            // Write your logic here
            int max = 0;
            for (char ch = 'a' ; ch<='z';ch++){
                int i = 0 , j = 0 , sum = 0;
                while(j<A){
                    char cur = chocolates.charAt(j);
                    if (cur!=ch){
                        sum+=cost[cur-'a'];
                    }
                    while (sum>B && i<=j){
                        char left = chocolates.charAt(i);
                        if (left!=ch){
                            sum-=cost[left-'a'];
                        }
                        i++;
                    }
                    max = Math.max(max,j-i+1);
                    j++;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int A = 6;
            int B = 10;
            String chocolates = "aabcda";
            int[] cost = {5 ,4 ,4 ,5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1};
            int result = getMaxChocolates(A, B, chocolates, cost);
            System.out.println(result);
        }
    }
