package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class CalculateAverageOfNNumbers {
    public static void main(String[] args) {
       int ans = average();
        System.out.println(ans);
    }
    static int average(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to insert : ");
        int size  = scanner.nextInt();
        int sum = 0;
        int count = 0;
        System.out.println("Enter numbers : ");
        for (int i = 0 ; i < size ; i++)
        {
               int num = scanner.nextInt();
                count++;
                sum+=num;
        }
        return sum/count;
    }
}
