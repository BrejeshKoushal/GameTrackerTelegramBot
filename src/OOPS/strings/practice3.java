package OOPS.strings;

import java.util.Arrays;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        String[] names  = new String[6];
        Scanner scanner = new Scanner(System.in);
        StringBuilder buil = new StringBuilder();
        for(int  i = 0 ; i  < 6 ;i++){
            names[i] = scanner.next();
            System.out.println(STR."Enter surname of this frind \{i+1}");
            buil.append(names[i]).append(" ").append(scanner.next()).append(",");
        }
        System.out.println(buil);
        System.out.println(STR."In reverse : \{buil.reverse()}");
    }
}
