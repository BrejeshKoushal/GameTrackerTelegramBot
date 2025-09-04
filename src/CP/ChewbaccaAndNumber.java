package CP;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int finalAns = 0;
        int place = 1;
        while(num>0){
            int last = num%10;
            if(9-last < last){
                last = 9-last;
            }
            finalAns+=last*place;
            place*=10;
            num/=10;

        }
        System.out.println(finalAns);
    }
}
