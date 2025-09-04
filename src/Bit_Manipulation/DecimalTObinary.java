package Bit_Manipulation;

import java.util.Scanner;

public class DecimalTObinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuilder st = new StringBuilder();
        while(num!=0){
            int rem = num%2;
            num = num>>1;
            st.append(rem);
        }
        st.reverse();
        System.out.println(st);
    }
}
