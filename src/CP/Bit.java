package CP;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0 ; i < n ; i++){
            String st = scanner.next();
            if(st.charAt(1)=='+') x++;
            else x--;
        }
        System.out.println(x);
    }
}
