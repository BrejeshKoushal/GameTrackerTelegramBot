package assignments.firstjava.arrays;

import javax.management.StringValueExp;
import java.util.Scanner;

public class nonrepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(firstUniqChar(word));
    }
    static int firstUniqChar(String s) {
        int ans =-1;
        char[] arr = s.toCharArray();

        int count=0;
        for(int i = 0 ; i < arr.length;i++){
            for(int j = i ;j < arr.length ;j++){
                if (arr[i]==arr[j]) {
                    ans = arr[i];
                    break;
                }
            }
        }

      return ans;

    }
}
